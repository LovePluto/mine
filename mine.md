好久不更文了，今天聊一聊 Java 对象的创建方式。

Java 对象创建一共有四种方式

- 关键字 ***new*** 
- 反射 ```newInstant()``` 
- Object 的 ```clone()```
- 序列化 ```readObject()```

## 关键字 ***new***
```
Student s = new Student();
```
这段代码看着是不是特别熟悉，稍微学过一点Java的都写过类似的代码的，也是我们最初实例化对象的方式，不做过多讲解，太简单，太基础。

## 反射 ```newInstant()```
```
Student student = (Student) Class.forName("com.test.Student").newInstance();
```
你觉得这段代码陌生，我们来看下面这一段呢？
```
Class.forName("com.mysql.jdbc.Driver");
```
MySql 数据库的驱动加载总该用过了吧，是不是有一点熟悉的感觉？这种方式用的很多的，比如 Spring 的依赖注入。当然 Spring 的机制肯定比我的例子完善和复杂的。
## Object 的 ```clone()```
```
Student student = new Student("张三",2);
Student student1 = (Student) student.clone();
```

记得在 Student 里重写 ```clone()```，并且实现接口(implements) Cloneable。

```
@Override
protected Object clone() throws CloneNotSupportedException {
    return super.clone();
}
```

请注意 ```clone()``` 方法的权限是 ***protected***，所以这里需要手动重写一遍。不过应当注意，这个方法要慎用。如果条件允许，我建议使用下面这种方式手动拷贝。

```
public static Student build(Student s) {
    Student student = new Student();
    student.name = new String(s.getName());
    student.age = s.age;
    return student;
}
```

调用方式

```
Student student = new Student("张三", 2);
Student student2 = Student.build(student);
```
至于为什么要这样写，这牵涉到 ```clone()``` 的一些底层实现问题，感兴趣的可以自行搜索。
```
Student student = new Student("张三", 2);
Student student1 = (Student) student.clone();
Student student2 = Student.build(student);
if (student.getName() == student1.getName()) {
    System.out.println("1");
}
if (student.getName() == student2.getName()) {
    System.out.println("2");
}
```
运行结果为 1，来一张图解释一下 ```clone()``` 的拷贝。

虽然本地方法执行效率比较快，但这个问题有些时候是致命的，还不好排查，踩过坑的人都懂。
## 序列化 ```readObject()```
序列化要实现接口(implements) Serializable，这个是必需的，不然会报错，直接上代码。
```
Student student = new Student("张三", 2);
ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("demo.data"));
out.writeObject(student);
out.close();
ObjectInputStream in = new ObjectInputStream(new FileInputStream("demo.data"));
Student student3 = (Student) in.readObject();
in.close();
System.out.println("name："+student3.getName()+",age："+student3.getAge());
```
运行结果：***name：张三,age：2***，结果没有什么争议，内容也没有什么亮点。序列化的问题在于，可以从数据流中创建对象，这给不法分子创造了利用空间。个人不建议使用默认的序列化的，最好自定义序列化规则，在你需要序列化的 Class 里面添加如下的方法。
```
private void writeObject(ObjectOutputStream stream) throws IOException,ClassNotFoundException{
    stream.defaultWriteObject();//这里为了省事直接调用了默认的序列化方法，重写这个方法是最好的。
}

private void readObject(ObjectInputStream stream) throws IOException,ClassNotFoundException{
    stream.defaultReadObject();
}
```

## 总结
今天一共讲了四种创建对象方式，其中前两种都会显示的调用对象本身的构造函数，后面两种不会调用构造函数，可以自己尝试一下。
如有不对，欢迎后台留言指教！

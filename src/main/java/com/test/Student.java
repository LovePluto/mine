package com.test;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable, Cloneable {
    private String name;
    private int age;

    public Student() {
        System.out.println("init");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("init 2");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Student build() {
        Student student = new Student();
        student.name = new String(this.getName());
        student.age = this.age;
        return student;
    }
    private void writeObject(ObjectOutputStream stream) throws IOException,ClassNotFoundException{
        stream.defaultWriteObject();//这里为了省事直接调用了默认的序列化方法，当然也可以自己实现这个方法
        System.out.println("自定义的writeObject");
    }

    private void readObject(ObjectInputStream stream) throws IOException,ClassNotFoundException{
        stream.defaultReadObject();
        System.out.println("自定义的readObject");
    }

}

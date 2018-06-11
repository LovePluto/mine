package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws Exception {

        Student student4 = (Student) Class.forName("com.test.Student").newInstance();
        Student student = new Student("张三", 2);
        Student student1 = (Student) student.clone();
        Student student2 = student.build();
        if (student.getName() == student1.getName()) {
            System.out.println("1");
        }
        if (student.getName() == student2.getName()) {
            System.out.println("2");
        }

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("demo.data"));
        out.writeObject(student);
        out.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("demo.data"));
        Student student3 = (Student) in.readObject();
        in.close();
        System.out.println("name：" + student3.getName() + ",age：" + student3.getAge());
    }
}

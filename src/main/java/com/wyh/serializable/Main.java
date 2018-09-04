package com.wyh.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {


        User user = new User("zhangsan", 10);
        System.out.println("序列化之前：" + user.toString());
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.obj"));
        out.writeObject(user);
        out.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.obj"));
        User u = (User) in.readObject();
        in.close();
        System.out.println("反序列化：" + u.toString());
    }
}

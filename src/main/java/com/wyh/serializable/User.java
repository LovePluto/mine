package com.wyh.serializable;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 123456L;
    private String name;
    private int age;
    private int sex;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void writeObject(ObjectOutputStream stream) throws IOException, ClassNotFoundException {
//        stream.defaultWriteObject();
        ObjectOutputStream.PutField putField = stream.putFields();
        putField.put("name", name);
        putField.put("age", age);
        stream.writeFields();
    }

    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
//        stream.defaultReadObject();
        ObjectInputStream.GetField getField = stream.readFields();
        name = (String) getField.get("name", null);
        age = (Integer) getField.get("age", 0);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}

package com.wyh.serializable;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ListLink implements Serializable {

    private transient int size = 0;
    private transient MyNode head = null;

    public ListLink() {
    }

    public void add(String data) {
        MyNode m = new MyNode();
        m.data = data;
        m.next = null;
        m.previous = null;
        if (head == null) {
            head = m;
        } else {
            MyNode last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = m;
            m.previous = last;
        }
        size += 1;
    }


    private void writeObject(ObjectOutputStream stream) throws IOException, ClassNotFoundException {
        System.out.println("自定义的writeObject1");
        stream.defaultWriteObject();
        stream.writeInt(size);
        MyNode myNode = head;
        while (myNode.next != null) {
            stream.writeObject(myNode.data);
            myNode = myNode.next;
        }
        System.out.println("自定义的writeObject");
    }

    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        int size = stream.readInt();
        for (int i = 0; i < size; i++) {
            add((String) stream.readObject());
        }
        System.out.println("自定义的readObject");
    }

    private static class MyNode implements Serializable {
        String data;
        MyNode next;
        MyNode previous;

    }

    @Override
    public String toString() {
        MyNode myNode = head;
        do {
            System.out.print(myNode.data + ",");
            myNode = myNode.next;
        } while (myNode.next != null);
        System.out.println();
        return null;
    }
}

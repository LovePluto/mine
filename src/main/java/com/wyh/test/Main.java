package com.wyh.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws Exception {
        String a = "hello";
        String b = "hello2";
        String c = a + 2;
       if (c == b){
           System.out.println("true");
       }
    }
}

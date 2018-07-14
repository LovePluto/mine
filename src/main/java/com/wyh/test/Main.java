package com.wyh.test;

//import com.sun.org.apache.xpath.internal.operations.String;

public class Main {

    public static void main(String[] args) throws Exception {
        String a = "hello";
        String b = "hello2";
        String c = a + 2;
        if (c == b) {
            System.out.println("true");
        }

        byte[] bs = new byte[2];
        bs[0] = -127;
        bs[1] = -127;
        String s = new String(bs, "utf-16");
        System.out.println(s);
       byte[] aa =  "\udbdb".getBytes("utf-16");
       for (byte bvv:aa){
           System.out.println(bvv);
       }

    }
}

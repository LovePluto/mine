package com.wyh.interesting;

public class Main {

    public static void main(String[] args) {
        int a =2 ;

        cc:
        {
            if (a > 1) {
                break cc;
            }
            System.out.println("cc");

        }
        System.out.println("21");
    }
}

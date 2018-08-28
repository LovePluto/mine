package com.wyh.interesting;

import java.util.ArrayList;
import java.util.List;

public class Son extends Father {

//    @Override
//    public void foo(double b) {
//        System.out.println("son double");
//    }


    public static void foo(List<? extends Father> list) {
        System.out.println("son int");
    }

    public static void main(String[] args) throws Exception {
        List<Father> list1 = new ArrayList<>();
        list1.add(new Son());
        foo(list1);
    }
}

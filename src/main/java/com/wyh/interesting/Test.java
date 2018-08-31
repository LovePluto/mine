package com.wyh.interesting;

import java.util.LinkedList;
import java.util.List;

public class Test<T> {
    List<T>[] list;

    public Test(int a) {
        this.list = new LinkedList[a];
    }

    public void foo(int i) {
        list = new LinkedList[i];
    }
}

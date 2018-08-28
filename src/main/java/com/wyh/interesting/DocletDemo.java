package com.wyh.interesting;


/**
 * 类 DocletDemo 的描述
 */
public class DocletDemo {


    /**
     * 无参构造函数
     */
    public DocletDemo() {
    }

    /**
     * 含参构造函数
     *
     * @param name
     * @param age
     */
    public DocletDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 字段 name 描述
     */
    private String name;

    /**
     * 字段 age 的描述
     */
    private int age;


    /**
     * 无参方法的描述
     */
    private void foo() {
        System.out.println("foo");
    }

    /**
     * 含参方法的构造函数
     *
     * @param name
     */
    private void foo1(String name) {
        System.out.println("foo1");
    }
}

package com.wyh.interesting;

public class Animal {

    static Action action = new Action() {
        @Override
        public void eat() {
            System.out.println("eat");
        }
    };

    public static void main(String[] args) {
        new Action() {
            @Override
            public void eat() {
                System.out.println("eat");
            }
        }.eat();

    }
}

package com.wyh.interesting;

public  abstract  class Father {


    private String cc;

    public Father() {
    }


    public void foo() {
        class Son2 {
            String name;
        }
        Son2 son = new Son2();
        son.name = "dd";
        son.name = "cc";
        Son1 son1 = new Son1();
    }


    public void test() {
//        Son2
    }

    static class Son1 {
        public Son1() {
        }


        public void dd(Father father) {
            father.cc = "dd";
        }
    }
}




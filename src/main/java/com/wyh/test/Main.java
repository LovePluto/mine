package com.wyh.test;

//import com.sun.org.apache.xpath.internal.operations.String;

public class Main {


    public static void main(String[] args) throws Exception {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();
        System.out.println("1:" + a1.show(b));
        System.out.println("2:" + a1.show(c));
        System.out.println("3:" + a1.show(d));
        System.out.println("4:" + a2.show(b));
        System.out.println("5:" + a2.show(c));
        System.out.println("6:" + a2.show(d));
        System.out.println("7:" + b.show(b));
        System.out.println("8:" + b.show(c));
        System.out.println("9:" + b.show(d));

    }

    static class A {
        public String show(D obj) {
            return ("AD");
        }

        public String show(A obj) {
            return ("AA");
        }
    }

    static class B extends A {
        public String show(B obj) {
            return ("BB");
        }

        public String show(A obj) {
            return ("BA");
        }
    }

    static class C extends B {
    }

    static class D extends B {
    }
}

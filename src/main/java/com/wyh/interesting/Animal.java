package com.wyh.interesting;


/**
 * dd
 *
 * @aa aa
 * @bb bb
 * @aa aa2
 */
public class Animal {

    /**
     * names
     */
    private String name;

    public static void main(String[] args) {

        String input = "Hello World";
        String[] ss = input.split(" ");
        for (int i = 0; i < ss.length; i++) {
            for (int j = ss[i].length() - 1; j >= 0; j--) {
                System.out.print(ss[i].charAt(j));
            }
            System.out.print(" ");
        }
    }


    /**
     * foo
     * foo1
     *
     * @foo cc
     */
    public void foo() {

    }
}

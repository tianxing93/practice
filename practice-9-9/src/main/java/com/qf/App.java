package com.qf;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        int a = 3, b = 4;
        a = ++b;
        System.out.println(a);
        System.out.println(b);
        a++;
        System.out.println(a);
        a -= b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(++a);
    }
}

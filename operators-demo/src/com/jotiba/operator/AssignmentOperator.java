package com.jotiba.operator;


public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 8;
        int c = 15;
        int d = 14;
        int e = 17;

        a += 3;                    // a = a + 3;
        System.out.println(a);
        b -= 4;
        System.out.println(b);
        c *= 2;
        System.out.println(c);
        d /= 2;
        System.out.println(d);
        e %= 2;
        System.out.println(e);
    }
}

package com.company.lanqiao;


import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        int a, b, t;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        t = scanner.nextInt();
        method(a, b, t);

    }

    public static void method(int a, int b, int t) {
        int num = 0;
        int sum;
        sum = b + t;

        if (sum >= 60) {
            num = sum / 60;
            b = sum % 60;
        }else {
            b = sum;
        }
        a = a + num;
        System.out.println(a);
        System.out.println(b);
    }
}

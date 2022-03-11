package com.Tasklog;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("X1*X2 + Y1*Y2 + Z1*Z2  shu ifoda uchun sonlarni kiriting");
        System.out.println("x1=");
        int x1 = scanner.nextInt();
        System.out.println("x2=");
        int x2 = scanner.nextInt();
        System.out.println("y1=");
        int y1 = scanner.nextInt();
        System.out.println("y2=");
        int y2 = scanner.nextInt();
        System.out.println("z1=");
        int z1 = scanner.nextInt();
        System.out.println("z2=");
        int z2 = scanner.nextInt();


        int summ = x1*x2 + y1*y2 + z1*z2;
        System.out.println(summ);
    }
}

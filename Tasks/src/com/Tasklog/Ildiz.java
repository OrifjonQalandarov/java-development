package com.Tasklog;

import java.util.Scanner;

public class Ildiz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("birinchi sonni kiriting :");
        double a = scanner.nextInt();
        System.out.println("ikkinchi sonni kiriting :");
        double b = scanner.nextInt();
        System.out.println("uchinchi sonni kiriting :");
        double c = scanner.nextInt();

        System.out.println(Math.sqrt(Math.pow(a,2)+ Math.pow(b,2) + Math.pow(c,2)));

    }
}

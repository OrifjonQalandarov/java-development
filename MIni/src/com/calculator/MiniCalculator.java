package com.calculator;

import java.util.Scanner;

public class MiniCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinchi sonni kiriting : ");
        var a = scanner.nextInt();
        System.out.println();
        System.out.println("Ikkinchi sonni kiriting : ");
        var b = scanner.nextInt();
        System.out.println();
        System.out.println("Amalni tanlang : ");
        System.out.println();
        System.out.println("1. Qo'shish");
        System.out.println("2. Ayirish");
        System.out.println("3. Ko'paytirish");
        System.out.println("4. Bo'lish");
        var amal = scanner.nextInt();
        System.out.println();
        switch (amal){
            case 1:
                System.out.println("Yig'indi : " + (a + b));
                break;
            case 2:
                System.out.println("Ayirma : " + (a - b));
                break;
            case 3:
                System.out.println("Ko'paytma : " + (a * b));
                break;
            case 4:
                System.out.println("Bo'linma : " + (a / b));
                break;
        }
    }
}

package com.calculator;

public class Task {
    public static void main(String[] args) {
        int [] massiv = {5, 10, 15, 25, 6, 66, 76, -34, 3,98};
        int size = massiv.length;
        int birinchi =  massiv[0];
        int ohirgi = massiv[(size-1)];
        int middle = massiv[(size/2)];

        System.out.println("--------Task 1-------");
        System.out.println();
        System.out.println("Birinchi element : " + birinchi);
        System.out.println("Ohirgi element : " + ohirgi );
        System.out.println();
        System.out.println("--------Task 2-------");
        System.out.println();
        System.out.println("Birinchi va ohirgi elementlar ko'paytmasi : " + (birinchi * ohirgi));
        System.out.println();
        System.out.println("--------Task 3-------");
        System.out.println();
        System.out.println("Birinchi, ohirgi va o'rtadagi elementlar yig'indisi : " + (birinchi + ohirgi + middle));

    }
}

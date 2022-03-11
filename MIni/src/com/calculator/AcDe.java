package com.calculator;

public class AcDe {
    public static void main(String[] args) {

        int [] arr = { 2, 1, 4, 3, 6, 7, 8, 9, 6, 4, 1, 7, 9, 8, 7, 5, 3, 8, 10, 56, 98, 10, 4, 7, 8, 44, 22};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                   int temp = arr[i];
                       arr[i] = arr[j];
                       arr[j] = temp;
                }
            }
        }

        System.out.println();



        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);;
        }
    }
}


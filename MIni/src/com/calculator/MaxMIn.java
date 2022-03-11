package com.calculator;

public class MaxMIn {
    public static void main(String[] args) {
        int [] massiv1 = { 1, 2, 54, 154, 12, 57, 89, 100,};
        int max = 0;
        for(int index: massiv1){
            if(index > max){
                max = index;
            }

        }
        int min = max;
        for(int index: massiv1){
            if(index<min){
                min = index;
            }
        }
        System.out.println("Min : " + min );
        System.out.println("Max : " + max );
    }
}

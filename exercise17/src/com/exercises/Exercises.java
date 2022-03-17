package com.exercises;

import java.util.Random;

public class Exercises {
    public static void main(String[] args) {

        System.out.println("------Task 1------");

        String[] strArr = new String[10];

        for (int i = strArr.length -1; i >= 0; i--){
            strArr[i] = "b" + (i - 1);
        }

        System.out.println("Value: " + strArr[5]);
        System.out.println("-------Task 2-----");

        double[] dbArr = {3.5, 6.8, 2.3, 9.1, 1.0};

        for (int i = 0; i < dbArr.length; i++){
            dbArr[i]/=2;
        }

        for(int i = dbArr.length - 1; i >= 0; i--){
            System.out.println("Value: " + dbArr[i]);
        }

        System.out.println("------Task 3------");

        int[] intArr = { 1, 2, 3, 4, 5};
        double[] dbArr2 = {.5, 1, 1.5, 2, 2.5};

        for (int i = 0; i <intArr.length; i++){
            dbArr2[i] = dbArr2[i] * intArr[i];
        }

        for(int i = 0; i < intArr.length; i++){
            System.out.println(intArr[i] + ": " + dbArr2[i]);
        }

        System.out.println("------Task 4------");

        int[] intArr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < intArr3.length; i += 3){
            System.out.println("Value: " + intArr3[i]);
        }


        System.out.println("------Task 5-------");

        int[] intArr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = 1; i <= 9; i+=2){
            System.out.println(intArr2[i] + ", ");
        }

        System.out.println("------Task 6------");

        String[] strArr6 = new String [5];
        String sep = "";
        for (int i = 0; i < strArr6.length ; i ++) {
            System.out.println ( sep + strArr6 [i]) ;
            sep = ", ";
        }

        System.out.println("-------Task 7------");

        int [] intArr7 = new int [5];
        for (int i = 0; i < intArr7 . length ; i ++) {
            intArr7 [ i ] = i * 2;
        }
        for (int i = 0; i < intArr7 . length ; i ++) {
            System . out . println ( intArr7 [ i ] + ", ") ;
        }

        System.out.println("-------Task 8------");

        String [] strArr8 = new String [50];

        System.out.println("-------Task 9------");

        String [] strArr9 ;
        strArr9 = new String [50];

        System.out.println("-------Task 10------");

        for (int i = 0; i < strArr8 . length ; i ++) {
            strArr8 [ i ] = " \\ " ;
        }

        System.out.println("-------Task 11------");

        for (int i = strArr8.length - 1; i >= 0; i --){
            System.out.println ( i + " : " + strArr8 [ i ]) ;
        }

        System.out.println("------Task 12------");

        Random rand = new Random();
        int [] intArr12 = new int [50];
        for (int i = 0; i < intArr12 . length ; i ++) {
            intArr12 [ i ] = rand.nextInt (50) ;
        }
        for (int i = 0; i < intArr12 . length ; i ++) {
            int indexOfMin = i ;
            for ( int j = i + 1; j < intArr12 . length ; j ++) {
                if ( intArr12 [ j ] < intArr12 [ indexOfMin ]) {
                    indexOfMin = j ;
                }
            }
            if ( indexOfMin != i ) {
                int tmp = intArr12 [ i ];
                intArr12 [ i ] = intArr12 [ indexOfMin ];
                intArr12 [ indexOfMin ] = tmp ;
            }
        }

        for (int j = 0; j < intArr12.length; j++){
            System.out.println(intArr12[j]);
        }

        System.out.println("------Task 13-------");

        int [][] intArr13 = new int [5][8];

        System.out.println("------Task 14-------");

        int [][] intArr14 ;
        intArr14 = new int [5][8];

        System.out.println("------Task 15-------");

        int [][] intArr15 ;
        intArr15 = new int [5][];
        for (int i = 0; i < intArr15 . length ; i ++) {
            intArr15 [ i ] = new int [8];
        }

        System.out.println("-------Task 16------");

        for (int row = 0; row < intArr15 . length ; row ++) {
            for ( int col = 0; col < intArr15 [ row ].length ; col ++) {
                intArr15 [ row ][ col ] = row * col ;
            }
        }
        for (int i = 0; i<intArr15.length; i++) {
            System.out.println(intArr15[i][i]);
        }

        System.out.println("-------Task 17-------");

        for (int row = 0; row < intArr15 . length ; row ++) {
            int rowSum = 0;
            for ( int col = 0; col < intArr15 [ row ].length ; col ++) {
                System.out.print( intArr15 [ row ][ col ] + " " ) ;
                rowSum += intArr15 [ row ][ col ];
            }
            System.out.println ( " : " + rowSum ) ;
        }
    }
}

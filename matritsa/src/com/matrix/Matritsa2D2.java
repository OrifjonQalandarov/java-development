package com.matrix;

public class Matritsa2D2 {
    public static void main(String[] args) {
        int [][] matr1 = {  {1, 2, 4, 3},
                {4, 5, 60, 4},
                {3, 8, 9, 7},
                {3, 6, -9, 1}};

        for (int i=0; i< matr1.length; i++){
            for (int j=0; j< matr1[i].length; j++) {
                System.out.print(" " + matr1[i][j]);
            }
            System.out.println();
        }

        for(int i = 0; i<matr1.length; i++){

            matr1[i][i] = 0;
           ;

        }
        System.out.println();

        int b = 0;
        int c = matr1.length-1;


        while (b < matr1.length && c >= 0 ) {
            matr1[b][c] = 0;

            b++;
            c--;
        }

        System.out.println("------ Task 2 --------");

        for (int i=0; i< matr1.length; i++){
            for (int j=0; j< matr1[i].length; j++) {
                System.out.print(" " + matr1[i][j]);
            }
            System.out.println();
        }
    }
}

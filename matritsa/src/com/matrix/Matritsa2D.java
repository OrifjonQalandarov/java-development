package com.matrix;

public class Matritsa2D {
    public static void main(String[] args) {
        int [][] matr1 = {  {1, 2, 4, 3},
                            {4, 5, 60, 4},
                            {3, 8, 9, 0},
                            {3, 6, -9, 1}};
        int a = 0;
        int sum1 = 0;

        for(int i = 0; i<matr1.length; i++){

            a = matr1[i][i];
            sum1 += a;
            System.out.print(" "+a);

        }
        System.out.println();

        int b = 0;
        int c = matr1.length-1;
        int d = 0;
        int sum2 = 0;

       while (b < matr1.length && c >= 0 ){
            d = matr1[b][c];
            sum2 += d;
           System.out.print(" " +d);
           b++;
           c--;

       }
        System.out.println("--------- Task 1 ----------");
        System.out.println();
        System.out.println("Dioganallar yig'indisi: " + (sum1 + sum2));
        System.out.println();
        System.out.println("Dioganallar ko'paytmasi: " + (sum1 * sum2));





    }
}

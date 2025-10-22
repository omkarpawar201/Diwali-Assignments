package com.demo.test;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();

        for (int i = 0; i <= rows; i++) {

            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        sc.close();
    }
}

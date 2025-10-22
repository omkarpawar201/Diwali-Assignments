package com.demo.test;

import java.util.Scanner;

public class AdditionOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int first = sc.nextInt();
        System.out.print("Enter second number : ");
        int second = sc.nextInt();

        System.out.println("Addition : " + (first + second));

        sc.close();
    }
}

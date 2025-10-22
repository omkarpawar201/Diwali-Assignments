package com.demo.test;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, sum = 0, temp, orgnum;

        System.out.print("Enter a number : ");
        num = sc.nextInt();

        orgnum = num;

        while (num != 0) {
            temp = num % 10;
            sum += temp;
            num = num / 10;
        }

        System.out.println("Sum of digits of " + orgnum + " is " + sum);
        sc.close();
    }
}

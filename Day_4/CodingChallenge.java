package com.demo.test;

import java.util.Scanner;

public class CodingChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int sum_of_n_numbers = (size * (size + 1)) / 2;
        int sum_of_arr_elements = 0;

        for (int i = 0; i < size; i++) {
            sum_of_arr_elements += arr[i];
        }

        int num = sum_of_n_numbers - sum_of_arr_elements;

        System.out.println("Sum of " + size + " numbers is " + sum_of_n_numbers);
        System.out.println("Sum of array elements is " + sum_of_arr_elements);
        System.out.println("Missing number from array is " + num);
    }
}

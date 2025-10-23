package com.demo.test;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements of array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array to be shifted by : ");
        int k = sc.nextInt();

        int[] arr_rotate = new int[size];

        for (int i = 0; i < size; i++) {
            arr_rotate[(i + k) % size] = arr[i];
        }

        for (int i = 0; i < size; i++) {
            System.out.println(arr_rotate[i]);
        }

        sc.close();
    }
}

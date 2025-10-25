package com.demo.test;

public class StringAlphanumeric {
    public static void main(String[] args) {
        String str = "@@@@@a";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                count++;
            }
        }

        System.out.println(str.length());
        System.out.println(count);

        if (count == str.length()) {
            System.out.println("String contains only alphanumeric characters");
        } else {
            System.out.println("String dosen't contains only alphanumeric characters");
        }
    }
}

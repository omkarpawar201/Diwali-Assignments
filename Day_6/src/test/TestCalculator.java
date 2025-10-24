package test;

import java.util.Scanner;

import exceptions.WrongOperatorException;
import study.Calculator;

public class TestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number 1: ");
            int num1 = sc.nextInt();

            System.out.print("Enter number 2 : ");
            int num2 = sc.nextInt();

            System.out.print("Enter operator (+, -, *, /, %): ");
            String op = sc.next();

            int result = Calculator.calculate(num1, num2, op);
            System.out.println("Result: " + result);

        } catch (WrongOperatorException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}

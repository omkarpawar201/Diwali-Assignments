package study;

import exceptions.WrongOperatorException;

public class Calculator {

    public static int calculate(int number1, int number2, String operator) throws WrongOperatorException {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                return number1 / number2;
            case "%":
                return number1 % number2;
            default:
                throw new WrongOperatorException("Invalid operator...");
        }
    }
}

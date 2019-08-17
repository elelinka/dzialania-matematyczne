package com.example.utils;

public class MathematicalOperations {

    public static double sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static double multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double divide(int firstNumber, int secondNumber) {
        if (firstNumber == 0 || secondNumber == 0) {
            throw new ArithmeticException("nie można dzielić przez 0");
        }
        return firstNumber / secondNumber;
    }
}

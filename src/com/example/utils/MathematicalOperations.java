package com.example.utils;

import com.example.model.MathComponent;

public class MathematicalOperations {
    private static MathComponent component;

    public static double sum() {
        return component.getFirstNumber() + component.getSecondNumber();
    }

    public static double subtract() {
        return component.getFirstNumber() - component.getSecondNumber();
    }

    public static double multiply() {
        return component.getFirstNumber() * component.getSecondNumber();
    }

    public static double divide() {
        if (component.getFirstNumber() == 0 || component.getSecondNumber() == 0) {
            throw new ArithmeticException("nie można dzielić przez 0");
        }
        return component.getFirstNumber() / component.getSecondNumber();
    }
}

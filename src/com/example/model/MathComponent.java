package com.example.model;

public class MathComponent {
    private int firstNumber;
    private int secondNumber;
    private String sign;

    public MathComponent(int firstNumber, int secondNumber, String sign) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.sign = sign;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MathComponent)) return false;

        MathComponent component = (MathComponent) o;

        if (firstNumber != component.firstNumber) return false;
        if (secondNumber != component.secondNumber) return false;
        return sign.equals(component.sign);
    }

    @Override
    public int hashCode() {
        int result = firstNumber;
        result = 31 * result + secondNumber;
        result = 31 * result + sign.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return firstNumber + sign + secondNumber;
    }
}

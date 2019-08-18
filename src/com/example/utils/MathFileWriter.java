package com.example.utils;

import com.example.model.MathComponent;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MathFileWriter {
    public static void writeMathFile(String path, MathComponent[] components) {
        try {
            FileWriter eFileWrite = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(eFileWrite);
            for (int i = 0; i < components.length; i++) {
                String result = "";
                int firstNumber = components[i].getFirstNumber();
                int secondNumber = components[i].getSecondNumber();
                if (components[i].getSign().equals("+")) {
                    result = firstNumber + " + " + secondNumber + " = " + MathematicalOperations.sum(firstNumber, secondNumber);
                    bufferedWriter.write(result);
                } else if (components[i].getSign().equals("-")) {
                    result = firstNumber + " - " + secondNumber + " = " + MathematicalOperations.subtract(firstNumber, secondNumber);
                    bufferedWriter.write(result);
                } else if (components[i].getSign().equals("*")) {
                    result = firstNumber + " * " + secondNumber + " = " + MathematicalOperations.multiply(firstNumber, secondNumber);
                    bufferedWriter.write(result);
                } else {
                    result = firstNumber + " / " + secondNumber + " = " + MathematicalOperations.divide(firstNumber, secondNumber);
                    bufferedWriter.write(result);
                }
                bufferedWriter.newLine();
                System.out.println(result);
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("nie odnaleziono pliku");
        }
    }
}

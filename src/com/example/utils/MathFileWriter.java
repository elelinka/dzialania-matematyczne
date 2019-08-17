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
                int firstNumber = components[i].getFirstNumber();
                int secondNumber = components[i].getSecondNumber();
                if (components[i].getSign().equals("+")) {
                    bufferedWriter.write(firstNumber + " + " + secondNumber + " = " + MathematicalOperations.sum(firstNumber, secondNumber));
                }
                if (components[i].getSign().equals("-")) {
                    bufferedWriter.write(firstNumber + " - " + secondNumber + " = " + MathematicalOperations.subtract(firstNumber, secondNumber));
                }
                if (components[i].getSign().equals("*")) {
                    bufferedWriter.write(firstNumber + " * " + secondNumber + " = " + MathematicalOperations.multiply(firstNumber, secondNumber));
                }
                if (components[i].getSign().equals("/")) {
                    bufferedWriter.write(firstNumber + " / " + secondNumber + " = " + MathematicalOperations.divide(firstNumber, secondNumber));
                }
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("nie odnaleziono pliku");
        }
    }
}

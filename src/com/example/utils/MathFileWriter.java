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
                if (components[i].getSign().equals("+")) {
                    bufferedWriter.write(components[i].getFirstNumber() + " + " + components[i].getSecondNumber() + " = " + MathematicalOperations.sum());
                }
                if (components[i].getSign().equals("-")) {
                    bufferedWriter.write(components[i].getFirstNumber() + " - " + components[i].getSecondNumber() + " = " + MathematicalOperations.subtract());
                }
                if (components[i].getSign().equals("*")) {
                    bufferedWriter.write(components[i].getFirstNumber() + " * " + components[i].getSecondNumber() + " = " + MathematicalOperations.multiply());
                }
                if (components[i].getSign().equals("/")) {
                    bufferedWriter.write(components[i].getFirstNumber() + " / " + components[i].getSecondNumber() + " = " + MathematicalOperations.divide());
                }
            }
        } catch (IOException e) {
            System.out.println("nie odnaleziono pliku");
        }
    }
}

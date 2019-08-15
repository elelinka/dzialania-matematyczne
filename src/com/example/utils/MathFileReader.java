package com.example.utils;

import com.example.model.MathComponent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class MathFileReader {
    public static String getMathFile(String path) {
        MathComponent[] components = new MathComponent[4];
        int index = 0;
        try {
            FileReader file = new FileReader(path);
            BufferedReader bFile = new BufferedReader(file);
            String nextLine;
            while ((nextLine = bFile.readLine()) != null) {
                String[] lines = nextLine.split(" ");
                components[index] = new MathComponent(Integer.parseInt(lines[0]), Integer.parseInt(lines[2]), lines[1]);
                index++;
            }
        } catch (IOException e) {
            System.err.println("Nie odnaleziono pliku.");
        }

        return Arrays.toString(components);
    }
}

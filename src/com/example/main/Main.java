package com.example.main;

import com.example.model.MathComponent;
import com.example.utils.MathFileReader;
import com.example.utils.MathFileWriter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String pathToRead = "C:\\Users\\grego\\Desktop\\dzialania.txt";
        String pathToWrite = "C:\\Users\\grego\\Desktop\\dzialania z wynikiem.txt";
        MathComponent[] contents = MathFileReader.getMathFile(pathToRead);
        System.out.println("Zawartość pliku: " + Arrays.toString(contents));
        System.out.println("Obliczenia:");
        MathFileWriter.writeMathFile(pathToWrite, contents);
    }
}
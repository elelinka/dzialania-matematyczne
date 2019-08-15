package com.example.main;

import com.example.utils.MathFileReader;

public class Main {
    public static void main(String[] args) {
        String pathToRead = "C:\\Users\\grego\\Desktop\\dzialania.txt";
        String content = MathFileReader.getMathFile(pathToRead);
        System.out.println(content);


    }
}

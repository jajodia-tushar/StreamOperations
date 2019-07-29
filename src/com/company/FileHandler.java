package com.company;

import java.io.FileNotFoundException;

public class FileHandler {
    public static void main(String[] args) {
        FileWriter fileWriter = new FileWriter();
        try {
            String data = "This is the First Line in the File\n"+
                    "This is the Last line in the File";
            fileWriter.writeFile("DataFile.txt", data);
        } catch (FileNotFoundException e) {
            System.out.println("Specified File not found");
        }
    }
}

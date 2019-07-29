package com.company;

import java.io.FileNotFoundException;

public class FileHandler {
    public static void main(String[] args) {
    fileWrite();
    fileRead();
    }

    public static void fileWrite(){
        FileWriter fileWriter = new FileWriter();
        try {
            String data = "This is the First Line in the File\r\n"+
                    "This is the Last line in the File";
            fileWriter.writeFile("DataFile.txt", data);
        } catch (FileNotFoundException e) {
            System.out.println("Specified File not found");
        }
    }

    public static void fileRead(){
        FileReader fileReader = new FileReader();
        try {
            String data = fileReader.read("DataFile.txt");
            System.out.println(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

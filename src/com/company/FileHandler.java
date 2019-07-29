package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandler {
    public static void main(String[] args) {
        consoleWrite();
    }

    public static void fileWrite(){
        FileWriter fileWriter = new FileWriter();
        try {
            String data = "This is the First Line in the File\r\n"+
                    "This is the second line in the file\r\n"+
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void consoleWrite(){
        ConsoleWriter consoleWriter = new ConsoleWriter();
        try {
            consoleWriter.writeToConsole("Hello World");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {

    public String read(String fileName) throws FileNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(fileName);
        byte[] b = new byte[1024];
        try {
            fileInputStream.read(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(b);
    }
}

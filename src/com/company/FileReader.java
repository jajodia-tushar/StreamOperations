package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {

    public String read(String fileName) throws IOException {

        StringBuffer stringBuffer = new StringBuffer("");
        FileInputStream fileInputStream = new FileInputStream(fileName);
        byte[] b = new byte[8];
        try {
            while(fileInputStream.read(b) > 0){
                stringBuffer.append(new String(b));
                b = new byte[8];
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }
}

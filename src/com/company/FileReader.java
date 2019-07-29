package com.company;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReader {

    public String read(String fileName) throws IOException {

        StringBuffer stringBuffer = new StringBuffer("");
        FileInputStream fileInputStream = new FileInputStream(fileName);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        byte[] b = new byte[8];
        try {
            while(bufferedInputStream.read(b) > 0){
                stringBuffer.append(new String(b));
                b = new byte[8];
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }
}

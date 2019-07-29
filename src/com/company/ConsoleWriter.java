package com.company;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ConsoleWriter {
    public void writeToConsole(String data) throws FileNotFoundException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(System.out);
        try(bufferedOutputStream){
            bufferedOutputStream.write(data.getBytes());
        } catch (IOException e) {
            System.out.println("Exception occured: "+e);
            e.printStackTrace();
        }
    }
}

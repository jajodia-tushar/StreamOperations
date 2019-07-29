package com.company;

import java.io.*;

public class FileWriter {
    public void writeFile(String fileName,String data) throws FileNotFoundException{
        FileOutputStream writer = new FileOutputStream(fileName);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(writer);

        try(bufferedOutputStream){
            bufferedOutputStream.write(data.getBytes());
        } catch (IOException e) {
            System.out.println("Exception occured: "+e);
            e.printStackTrace();
        }
    }
}

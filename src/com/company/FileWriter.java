package com.company;

import java.io.*;

public class FileWriter {
    public void writeFile(String fileName,String data) throws FileNotFoundException{
        FileOutputStream writer = new FileOutputStream(fileName);
        DataOutputStream dataOutputStream= new DataOutputStream(writer);

        try(dataOutputStream){
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeInt(12);
            dataOutputStream.writeFloat(12.4f);
            dataOutputStream.write(data.getBytes());
            dataOutputStream.writeBoolean(false);
            System.out.println("hel================>"+data.getBytes().length);
        } catch (IOException e) {
            System.out.println("Exception occured: "+e);
            e.printStackTrace();
        }
    }


}

package com.company;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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

    public void readAsWritten(String fileName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        DataInputStream dataInputStream= new DataInputStream(fileInputStream);

        try(dataInputStream) {
            byte[] byt = new byte[1024];
            boolean b = dataInputStream.readBoolean();
            int i = dataInputStream.readInt();
            float f = dataInputStream.readFloat();
            dataInputStream.read(byt);
            boolean by = dataInputStream.readBoolean();

            System.out.println("Boolean : "+b);
            System.out.println("Integer : "+i);
            System.out.println("Float : "+f);
            System.out.println(" user's data  "+new String(byt));
            System.out.println(" new "+by);

            Comparator<Integer> myComp = Integer::compareTo;
            List list = Arrays.asList(1,2,3,4,5,6);
            list.stream().sorted(myComp);
        }
    }
}

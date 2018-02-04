package com.tstar.basic;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/5 0005
 */
public class TestObjectStream {
    public static void main(String[] args) throws IOException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        try ( // Create an output stream for file object.dat
            ObjectOutputStream output =
                new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("E:/ioDoc/object.dat")))
        ) {
            output.writeUTF("Lily");
            output.writeDouble(100.00);
            output.writeObject(new Date());
        }

        try ( // Create an input stream for file object.dat
            ObjectInputStream input =
                new ObjectInputStream(new BufferedInputStream(new FileInputStream("E:/ioDoc/object.dat")))
        ) {
            // Read a string, double value, and object from the file
            String name = input.readUTF();
            double score = input.readDouble();
            Date date = (Date)input.readObject();
            System.out.println(name + " " + score + " " + sdf.format(date) );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

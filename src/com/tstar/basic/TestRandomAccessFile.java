package com.tstar.basic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/5 0005
 */
public class TestRandomAccessFile {
    public static void main(String[] args) throws IOException{
        try ( // Create a random access file
            RandomAccessFile inout = new RandomAccessFile("inout.dat", "rw")
        ) {
            // Clear the file to destroy the old contents if exist
            inout.setLength(10);

            // Write new integers to the file
            for ( int i = 0; i < 200; i++ ) {
                inout.writeInt(i);
            }

            // Display the current length of the File
            System.out.println("Current file length is: " + inout.length());

            // Retrieve the first number
            inout.seek(0);
            System.out.println("The first number is: " + inout.readInt());

            // Retrieve the second number
            inout.seek(1 * 4);
            System.out.println("The second number is: " + inout.readInt());

            // Retrieve the tenth number
            inout.seek(9 * 4);
            System.out.println("The tenth number is: " + inout.readInt());

            // Modify the eleventh number
            inout.writeInt(555);

            // Append a new number
            inout.seek(inout.length());
            inout.writeInt(999);

            // Display the nuw length
            System.out.println("The new length is: " + inout.length());

            // Retrieve the new eleventh number
            inout.seek(10 * 4);
            System.out.println("The eleventh number is: " + inout.readInt());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

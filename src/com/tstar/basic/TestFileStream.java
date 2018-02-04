package com.tstar.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/5 0005
 */
public class TestFileStream {
    public static void main(String[] args) throws IOException {
        try {
            FileOutputStream output = new FileOutputStream("E:/ioDoc/temp.dat");
            for ( int i = 0; i <= 10 ; i++ ) {
                output.write(i);
            }

            FileInputStream input = new FileInputStream("E:/ioDoc/temp.dat");
            int value;
            while ((value = input.read()) != -1) {
                System.out.println(value + "\t");
            }

            output.flush();
            output.close();
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

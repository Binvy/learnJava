package com.tstar.basic;

import java.io.*;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/5 0005
 */
public class TestDataStream {
    public static void main(String[] args) throws IOException{
        try {
            try ( // Create an output stream for file tmp.dat
                DataOutputStream dataOutputStream =
                    new DataOutputStream(new FileOutputStream("E:/ioDoc/tmp.dat"))
            ) {
                // Write student test scores to the file
                dataOutputStream.writeUTF("Binvy");
                dataOutputStream.writeDouble(80.00);
                dataOutputStream.writeUTF("Lily");
                dataOutputStream.writeDouble(100.00);
                dataOutputStream.writeUTF("David");
                dataOutputStream.writeDouble(99.00);
            }

            try ( // Create an input stream for file tmp.dat
                DataInputStream dataInputStream =
                    new DataInputStream(new FileInputStream("E:/ioDoc/tmp.dat"))
            ) {
                // Read student test scores from the file
                while (true) {
                    System.out.println(dataInputStream.readUTF());
                }
            }
        } catch (EOFException ex) { // 检测文件末尾
            System.out.println("All data were read");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}

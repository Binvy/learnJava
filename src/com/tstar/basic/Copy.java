package com.tstar.basic;

import java.io.*;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/5 0005
 */
public class Copy {
    public static void main(String[] args) throws IOException{
        // Check command-line parameter usage
        if (args.length != 2) {
            System.out.println("Usage: java Copy sourceFile targetFile");
            System.exit(1);
        }

        // Check if source exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source File " + args[0] + " does not exist");
            System.exit(2);
        }

        // Check if target file exist
        File targetFile = new File(args[1]);
        if (!targetFile.exists()) {
            System.out.println("Target File " + args[1] + " does not exist");
            System.exit(2);
        } else {
            System.out.println("Target File" + args[1] + " already exist");
            System.exit(3);
        }

        try ( // Create an input stream
            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(sourceFile));
             // Create an output stream
            BufferedOutputStream outputStream = new  BufferedOutputStream(new FileOutputStream(targetFile));
        ) {
            // Continuously read a byte from input and write it to output
            int r, numberOfBytesCopied= 0;
            while ((r = inputStream.read()) != -1) {
                outputStream.write((byte)r);
                numberOfBytesCopied ++;
            }

            System.out.println(numberOfBytesCopied + " bytes copied");
        }


    }
}

package com.book.thinkinginjava.basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @comments: 构造器
 * @author: binvy
 * @Date: 2018/3/6
 */
public class InputFile {
    private BufferedReader in;
    public InputFile(String fileName) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fileName));
            // Other code that might throw exceptions
        } catch (FileNotFoundException e) {
            System.out.println("Could not open " + fileName);
            // Wasn't open. so don't close it
            throw e;
        } catch (Exception e) {
            // All other exceptions must close it
            try {
                in.close();
            } catch (IOException ioException) {
                System.out.println("in.close() unsuccessful");
            }
            throw e;
        } finally {
            // Doesn't close it here!!!
        }
    }
    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException("readLine() failed");
        }
        return s;
    }
    public void dispose() {
        try {
            in.close();
            System.out.println("dispose() successful");
        } catch (IOException e) {
            throw new RuntimeException("in.close() failed");
        }
    }

    public static void main(String[] args) {
        try {
            InputFile inputFile = new InputFile("Cleanup.java");
            try {
                String s;
                int i = 1;
                while ((s = inputFile.getLine()) != null ) {
                    // Perform line-by-line processing here...
                }
            } catch (Exception e) {
                System.out.println("Caught exception in main");
                e.printStackTrace(System.out);
            } finally {
                inputFile.dispose();
            }
        } catch (Exception e) {
            System.out.println("InputFile construction failed");
            e.printStackTrace();
        }
    }
}

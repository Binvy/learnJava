package com.book.thinkinginjava.annotation;

import com.book.thinkinginjava.io.BinaryFile;
import com.book.thinkinginjava.io.Directory;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/7/29
 */
public class ClassNameFinder {
    public static String thisClass(byte[] classBytes) {
        Map<Integer, Integer> offsetTable = new HashMap<>();
        Map<Integer, String> classNameTable = new HashMap<>();
        try {
            DataInputStream data = new DataInputStream(new ByteArrayInputStream(classBytes));
            int magic = data.readInt();
            int minorVersion = data.readShort();
            int mijorVersion = data.readShort();
            int constant_pool_count = data.readShort();
            int[] constant_pool = new int[constant_pool_count];
            for ( int i = 0; i < constant_pool_count; i++ ) {
                int tag = data.read();
                int tableSize;
                switch (tag) {
                    // UTF
                    case 1:
                        int length = data.readShort();
                        char[] bytes = new char[length];
                        for ( int j = 0; j < bytes.length; j++ ) {
                            bytes[j] = (char)data.read();
                        }
                        String className = new String(bytes);
                        classNameTable.put(i, className);
                        break;
                    // LONG DOUBLE
                    case 5:
                    case 6:
                        data.readLong(); // discard 8 bytes
                        i++; // Special skip necessary
                        break;
                    // CLASS
                    case 7:
                        int offset = data.readShort();
                        offsetTable.put(i, offset);
                        break;
                    // STRING
                    case 8:
                        data.readShort(); // discart 2 bytes
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        data.readInt(); // discard 4 bytes
                        break;
                    default:
                        throw new RuntimeException("Bad tag " + tag);
                }
            }
            short access_flags = data.readShort();
            int this_class = data.readShort();
            int super_class = data.readShort();
            return classNameTable.get(offsetTable.get(this_class)).replace("/", ".");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            for ( String arg : args
                   ) {
                System.out.println(thisClass(BinaryFile.read(new File(arg))));
            }
        } else {
            for ( File klass : Directory.walk(".", ".*\\.class")
                   ) {
                System.out.println(thisClass(BinaryFile.read(klass)));
            }
        }
    }

}

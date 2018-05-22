package com.book.thinkinginjava.collection;

import java.util.BitSet;
import java.util.Random;

/**
 * @comments: BitSet
 * @author: binvy
 * @Date: 2018/5/22
 */
public class Bits {
    public static void printBitSet(BitSet bitSet) {
        System.out.println("bitSet: " + bitSet);
        StringBuilder sb = new StringBuilder();
        for ( int j = 0; j < bitSet.size(); j++ ) {
            sb.append(bitSet.get(j) ? "1" : "0");
        }
        System.out.println("bit pattern " + sb);
    }
    public static void main(String[] args) {
        Random random = new Random(47);
        byte b = (byte)random.nextInt();
        BitSet bb = new BitSet();
        for (int i = 7; i >= 0; i--) {
            if (((1 << i) & b) != 0) {
                bb.set(i);
            } else {
                bb.clear(i);
            }
        }
        System.out.println("byte value: " + b);
        printBitSet(bb);

        short s = (short)random.nextInt();
        BitSet bs = new BitSet();
        for (int i = 15; i >= 0; i--) {
            if (((1 << i) & s) != 0) {
                bs.set(i);
            } else {
                bs.clear(i);
            }
        }
        System.out.println("short value: " + s);
        printBitSet(bs);

        int love = random.nextInt();
        BitSet bi = new BitSet();
        for (int i = 31; i >= 0; i--) {
            if (((1 << i) & love) != 0) {
                bi.set(i);
            } else {
                bi.clear(i);
            }
        }
        System.out.println("int value: " + love);
        printBitSet(bi);

        BitSet b127 = new BitSet();
        b127.set(127);
        System.out.println("set bit 127: " + b127);

        BitSet b255 = new BitSet(65);
        b255.set(255);
        System.out.println("set bit 255: " + b255);

        BitSet b1023 = new BitSet(512);
        b1023.set(1023);
        b1023.set(1024);
        System.out.println("set bit 1023: " + b1023);

    }
}

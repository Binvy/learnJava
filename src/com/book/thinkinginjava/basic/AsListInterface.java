package com.book.thinkinginjava.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/3/4
 */
class Snow {}
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}
public class AsListInterface {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Crusty(), new Powder(), new Slush());
        // Won't compile
        // List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
        List<Powder> snow2 = Arrays.asList(new Light(), new Heavy());
        // Collections.addAll() doesn't get confused
        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3, new Light(), new Heavy());
        // Give a hint using an explicit type argument specification
        List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());
    }
}

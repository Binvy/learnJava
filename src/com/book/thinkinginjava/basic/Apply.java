package com.book.thinkinginjava.basic;

import java.util.Arrays;

/**
 * @comments: 策略设计模式：能够根据所传递的参数对象的不同而具有不同行为的方法
 * @author: binvy
 * @Date: 2018/3/2
 */
public class Apply {
    public static void process(Processor processor, Object object) {
        System.out.println("Processor name: " + processor.name());
        System.out.println(processor.process(object));
    }
    public static String str = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new UpCase(), str);
        process(new DownCase(), str);
        process(new Splitter(), str);
    }
}

class Processor {
    public String name() {
        return getClass().getSimpleName();
    }
    Object process(Object object) {
        return object;
    }
}

class UpCase extends Processor {
    @Override
    String process(Object object) {
        return ((String)object).toUpperCase();
    }
}

class DownCase extends Processor {
    @Override
    String process(Object object) {
        return ((String)object).toLowerCase();
    }
}

class Splitter extends Processor {
    @Override
    String process(Object object) {
        return Arrays.toString(((String) object).split(" "));
    }
}

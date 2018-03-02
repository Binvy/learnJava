package com.book.thinkinginjava.basic;


import java.util.Arrays;

/**
 * @comments: 适配器设计模式。适配器中的代码将接受你所拥有的接口，并产生你所需要的接口。
 * @author: binvy
 * @Date: 2018/3/2
 */
public class FilterProcessor {
    public static void process (Processor2 processor2, Object object) {
        System.out.println("Processor2 name: " + processor2.name());
        System.out.println(processor2.process(object));
    }
    public static void main(String[] args) {
        WaveForm waveForm = new WaveForm();
        process(new FilterAdapter(new UpPass(1.0)), waveForm);
        process(new FilterAdapter(new LowPass(2.0)), waveForm);
        process(new FilterAdapter(new BandPass(3.0, 4.0)), waveForm);
    }
}

interface Processor2 {
    public String name();
    Object process(Object object);
}

class FilterAdapter implements Processor2 {
    Filter filter;
    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }
    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public WaveForm process(Object object) {
        return filter.process((WaveForm) object);
    }
}
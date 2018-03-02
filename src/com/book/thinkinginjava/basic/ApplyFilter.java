package com.book.thinkinginjava.basic;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/3/2
 */
public class ApplyFilter {
    public static String str = "Disagreement with beliefs is by definition incorrect";
    public static void main(String[] args) {
        // Apply.process(new Filter(), str);
    }
}

class WaveForm {
    private static long counter;
    private final long id = counter++;
    @Override
    public String toString() {
        return "WaveForm" + id;
    }
}

class Filter {
    public String name() {
        return getClass().getSimpleName();
    }
    public WaveForm process(WaveForm waveForm) {
        return waveForm;
    }
}

class LowPass extends Filter {
    double cutoff;
    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }
    @Override
    public WaveForm process(WaveForm waveForm){
        return waveForm;
    }
}

class UpPass extends Filter {
    double cutoff;
    public UpPass(double cutoff) {
        this.cutoff = cutoff;
    }
    @Override
    public WaveForm process(WaveForm waveForm) {
        return waveForm;
    }
}

class BandPass extends Filter {
    double lowCutoff, upCutoff;
    public BandPass(double lowCutoff, double upCutoff) {
        this.lowCutoff = lowCutoff;
        this.upCutoff = upCutoff;
    }
    @Override
    public WaveForm process(WaveForm waveForm) {
        return waveForm;
    }
}
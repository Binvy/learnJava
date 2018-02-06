package com.tstar.basic;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/7 0007
 */
public enum TrafficLight {
    RED ("Please stop!"),
    GREEN ("Please go!"),
    YELLOW ("Please caution");

    private String description;

    private TrafficLight(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}

class TestTranfficLight {
    public static void main(String[] args) {
        TrafficLight light = TrafficLight.RED;
        System.out.println(light.getDescription());
    }
}

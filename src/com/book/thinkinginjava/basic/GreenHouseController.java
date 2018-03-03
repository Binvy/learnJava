package com.book.thinkinginjava.basic;

/**
 * @comments: 温室系统运作ing
 * @author: binvy
 * @Date: 2018/3/4
 */
public class GreenHouseController {
    public static void main(String[] args) {
        GreenHouseControls controls = new GreenHouseControls();
        controls.addEvent(controls.new Bell(900));
        Event[] eventList = {
            controls.new ThermostatNight(0),
            controls.new LightOn(200),
            controls.new LightOff(400),
            controls.new WaterOn(600),
            controls.new WaterOff(800),
            controls.new ThermostatDay(1400),
        };
        controls.addEvent(controls.new Restart(2000, eventList));
        if (args.length == 1) {
            controls.addEvent(new GreenHouseControls.Terminate(new Integer(args[0])));
        }
        controls.run();
    }
}

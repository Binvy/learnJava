package com.book.thinkinginjava.basic;

/**
 * @comments: 控制框架：温室系统
 * @author: binvy
 * @Date: 2018/3/4
 */
public class GreenHouseControls extends Controller {
    private boolean light = false;
    public class LightOn extends Event {
        public LightOn(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            // Put hardware control code here to physically turn on the light;
            light = true;
        }
        @Override
        public String toString() {
            return "Light is on";
        }
    }
    public class LightOff extends Event {
        public LightOff(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            // Put hardware control code here to physically turn off the light;
            light = false;
        }
        @Override
        public String toString() {
            return "Light is off";
        }
    }
    private boolean water = false;
    public class WaterOn extends Event {
        public WaterOn(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            // Put hardware control code here
            water = true;
        }
        @Override
        public String toString() {
            return "Greenhouse Water is on";
        }
    }
    public class WaterOff extends Event {
        public WaterOff(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            // Put hardware control code here
            water = false;
        }
        @Override
        public String toString() {
            return "Greenhouse Water is off";
        }
    }
    private String thermostat = "Day";
    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            thermostat = "Night";
        }
        @Override
        public String toString() {
            return "Thermostat on night setting";
        }
    }
    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            thermostat = "Day";
        }
        @Override
        public String toString() {
            return "Thermostat on day setting";
        }
    }
    //
    public class Bell extends Event {
        public Bell(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }
        @Override
        public String toString() {
            return "Bing";
        }
    }
    public class Restart extends Event {
        private Event[] eventList;
        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for ( Event event : eventList ) {
                addEvent(event);
            }
        }
        @Override
        public void action() {
            for ( Event event : eventList ) {
                event.start();  //Rerun each event
                addEvent(event);
            }
            start();
            addEvent(this);
        }
        @Override
        public String toString() {
            return "Restarting system";
        }
    }
    public static class Terminate extends Event {
        public Terminate(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            System.exit(0);
        }
        @Override
        public String toString() {
            return "Terminating";
        }
    }
}

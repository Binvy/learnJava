package com.book.thinkinginjava.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * @comments: 内部类与控制框架
 * @author: binvy
 * @Date: 2018/3/4
 */
public class Controller {
    private List<Event> eventList = new ArrayList<Event>();
    public void addEvent(Event c) {
        eventList.add(c);
    }
    public void run() {
        while (eventList.size() > 0) {
            // Make a copy so you're not modifying the list while you're selecting the elements in it;
            for ( Event event : new ArrayList<Event>(eventList) ) {
                if (event.ready()) {
                    System.out.println(event);
                    event.action();
                    eventList.remove(event);
                }
            }
        }
    }
}

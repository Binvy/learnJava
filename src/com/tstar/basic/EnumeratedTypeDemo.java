package com.tstar.basic;

import java.util.Arrays;

/**
 * @comments: Enum type
 * @author: binvy
 * @Date: 2018/2/6 0006
 */
public class EnumeratedTypeDemo {

    enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};

    public static void main(String[] args) {

        Day day1 = Day.FRIDAY;
        Day day2 = Day.THURSDAY;
        Day[] days = Day.values();
        Day day4 = Day.valueOf("SUNDAY");

        System.out.println(Arrays.toString(days));
        System.out.println(day4.toString());

        System.out.println("day1's name is " + day1.name());
        System.out.println("day2's name is " + day2.name());
        System.out.println("day1's ordinal is " + day1.ordinal());
        System.out.println("day2's ordinal is " + day2.ordinal());

        System.out.println("day1.equals(day2) returns " + day1.equals(day2) );
        System.out.println("day1.toString() returns " + day1.toString() );
        System.out.println("day1.compareTo(day2) returns " + day1.compareTo(day2) );

    }

}

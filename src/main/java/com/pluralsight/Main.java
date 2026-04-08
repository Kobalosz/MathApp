package com.pluralsight;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(){
        double bobSalary = 9_999_999.97;
        double garySalary = 38_888;
        double highestSalary = Math.max(garySalary, bobSalary);

        System.out.println("The highest salary is: " + highestSalary);

        double carPrice = 99_999;
        double truckPrice = 10_000;
        // NEXT

        double circleRadius = 7.25;
        double circleArea = Math.sqrt(circleRadius) * 3.14;
        System.out.println(circleArea);

        // NEXT

        final int SET_NUMBER = 5;
        double squareRoot = Math.sqrt(SET_NUMBER);
        System.out.println(squareRoot);

        // NEXT
        int pointOneA = 5;
        int pointOneB = 10;
        int pointTwoA = 85;
        int pointTwoB = 59;

        int distanceX = pointTwoA - pointOneA;
        int distanceY = pointTwoB - pointOneB;

        System.out.println("The distance between (" + pointOneA +","+ pointOneB + ") and (" + pointTwoA + "," + pointTwoB + ") is: x="+distanceX+ " and y=" + distanceY);

        // NEXT
        System.out.println(Math.random()); //Code Reference: Ariel Raymundo

        // NEXT
        int minutesInDay = 24 * 60;
        int milliseconds = minutesInDay * 60 * 1000;
        System.out.println("There are " + minutesInDay + " minutes in a day, or " + milliseconds + " milliseconds.");
    }
}

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
        System.out.println(distanceX);
        int distanceY = pointTwoB - pointOneB;
        System.out.println(distanceY);
        System.out.println("The distance between (" + pointOneA +","+ pointOneB + ") and (" + pointTwoA + "," + pointTwoB + ") is: " + Math.sqrt((distanceX * distanceX) + (distanceY * distanceY))); //Interestingly the math output is incorrect here
        System.out.println(Math.sqrt(80 * 80 + 40 * 40)); //But runs correctly here, and even after checking the values are the same as far as I could tell.

        // NEXT
        System.out.println(Math.random()); //Code Reference: Ariel Raymundo

        // NEXT
        int minutesInDay = 24 * 60;
        int milliseconds = minutesInDay * 60 * 1000;
        System.out.println("There are " + minutesInDay + " minutes in a day, or " + milliseconds + " milliseconds.");
    }
}

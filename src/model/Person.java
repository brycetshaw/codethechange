package model;

import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Day> days;
    private int runningTotalCO2 = 0;

    public Person(int lengthOfChallenge) {
        days = new ArrayList<Day>(lengthOfChallenge);
    }

    public void calcRunningTotalCO2() {
        for (Day day : days) {
            runningTotalCO2 += day.getDayCO2();
        }
    }

    public void addDay(int dayNum, int km, String mode) {
        Day day = new Day(dayNum, km, mode);
        days.add(day);
    }

    public String toString() {
        String personStringRepresentation = "Name: " + this.name + "\nCumulative CO2: " +  runningTotalCO2 + "\n";

        for (Day day : days) {
            personStringRepresentation += day.toString() + "\n";
        }

        return personStringRepresentation;
    }

    public static void main(String[] args) {
        Person testPerson = new Person(3);
        System.out.println(testPerson.days.size());
        testPerson.addDay(1, 20, "car");
        testPerson.addDay(2, 10, "bus");
        testPerson.addDay(3, 50, "car");

        testPerson.calcRunningTotalCO2();
        System.out.println("Total CO2: "+ testPerson.runningTotalCO2);
    }
}
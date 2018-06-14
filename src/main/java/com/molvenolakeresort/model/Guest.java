package com.molvenolakeresort.model;


import java.util.GregorianCalendar;

public class Guest {

    private String name;
    private GregorianCalendar dateOfBirth;

    public Guest(String name) {
        this.name = name;
    }

    public String toString() {

        return "Guest: " + this.name;
    }

    public String getName() {
        return name;
    }

    public GregorianCalendar getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(int year, int month, int dayOfMonth) {
        this.dateOfBirth = new GregorianCalendar(year, month, dayOfMonth);
    }
}

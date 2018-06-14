package com.molvenolakeresort.model;


import java.time.LocalDate;


public class Guest {

    private String name;
    private LocalDate dateOfBirth;

    public Guest(String name) {
        this.name = name;
    }

    public String toString() {

        return "Guest: " + this.name;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(int year, int month, int dayOfMonth) {
        this.dateOfBirth = LocalDate.of(year, month, dayOfMonth);
    }
}

package com.molvenolakeresort.model;


import java.time.LocalDate;


public class Guest {

    private long id;

    private String name;
    private LocalDate dateOfBirth;

    public Guest(String name) {
        this.setName(name);
    }

    public String toString() {

        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(int year, int month, int dayOfMonth) {
        this.dateOfBirth = LocalDate.of(year, month, dayOfMonth);

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

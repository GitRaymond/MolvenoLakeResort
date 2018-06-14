package com.molvenolakeresort.model;

public class Room {

    private int number;

    public Room(int number) {

        this.number = number;
    }

    public String toString() {

        return "Room: " + this.number;
    }

    public int getNumber() {

        return this.number;
    }
}

package com.molvenolakeresort.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    // array van rooms
    // array van bookings
    private Room[] rooms = new Room[20];
    public Store store = new Store();

    public Hotel() {
        for( int i = 0; i <rooms.length ; i++) {
            rooms[i] = new Room(i+1);
        }
        for( int i = 0; i <rooms.length ; i++) {
            store.addRoom(i+1, new Room(i+1));
        }

    }

    public Room[] getRooms() {
        return this.rooms;
    }

    //method to generate rooms
}

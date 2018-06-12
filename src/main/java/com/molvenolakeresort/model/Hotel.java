package com.molvenolakeresort.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    // array van rooms
    // array van bookings
    public Store store = new Store();

    public Hotel() {

        int numberOfRooms = 20;

        for( int i = 0; i < numberOfRooms ; i++) {
            store.addRoom(i+1, new Room(i+1));
        }

    }



}

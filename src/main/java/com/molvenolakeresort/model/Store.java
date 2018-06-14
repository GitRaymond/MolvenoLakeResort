package com.molvenolakeresort.model;

import java.util.HashMap;
import java.util.Map;

public class Store {

    private static int lastRoomNumber = 0;

    public Map<Integer, Room> rooms = new HashMap<>();

    void addRoom() {
        this.rooms.put(lastRoomNumber +1, new Room(lastRoomNumber + 1));
        ++this.lastRoomNumber;
    }
}

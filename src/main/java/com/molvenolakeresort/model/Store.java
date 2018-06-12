package com.molvenolakeresort.model;

import java.util.HashMap;
import java.util.Map;

public class Store {

    public Map<Integer, Room> rooms = new HashMap<>();

    public void addRoom(int i, Room room) {
        this.rooms.put(i, room);
    }
}

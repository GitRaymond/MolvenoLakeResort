package com.molvenolakeresort.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RoomStore implements Iterable<Room> {

    private static int lastRoomNumber = 0;

    private Map<Integer, Room> rooms = new HashMap<>();

    protected void createRoom() {
        ++this.lastRoomNumber;
        this.rooms.put(lastRoomNumber, new Room(lastRoomNumber));
    }

    public Room getRoom(int id) {
        return this.rooms.get(id);
    }

    @Override
    public Iterator<Room> iterator() {
        return rooms.values().iterator();
    }
}

package com.molvenolakeresort.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CheckInStore implements Iterable<Map.Entry<Guest, Room>> {
    // better make this < Int , Int > and add id's of guest and room's
    private Map<Guest, Room> checkIns = new HashMap<>();

    public void checkIn(Guest g, Room r) {
        checkIns.put(g, r);
    }
    public void checkOut(Guest g) {
        checkIns.remove(g);
    }
    @Override
    public Iterator<Map.Entry<Guest, Room>> iterator() {
        return checkIns.entrySet().iterator();
    }
}

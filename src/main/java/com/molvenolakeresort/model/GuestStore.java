package com.molvenolakeresort.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GuestStore implements Iterable<Guest> {

    private static int lastGuestNumber = 0;

    private Map<Integer, Guest> guests = new HashMap<>();

    public void addGuest(String name) {
        ++lastGuestNumber;
        this.guests.put(lastGuestNumber, new Guest(name));
    }

    @Override
    public Iterator<Guest> iterator() {

        return guests.values().iterator();
    }
}

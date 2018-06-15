package com.molvenolakeresort.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GuestStore implements Iterable<Guest> {

    private static long lastGuestNumber = 0;

    private Map<Long, Guest> guests = new HashMap<>();

    public Guest addGuest(String name) {
        ++lastGuestNumber;
        Guest insertedGuest = new Guest(name);
        insertedGuest.setId(lastGuestNumber);
        this.guests.put(lastGuestNumber, insertedGuest);

        return insertedGuest;
    }

    public Guest getGuest(long id) {
        return this.guests.get(id);
    }

    @Override
    public Iterator<Guest> iterator() {
        return guests.values().iterator();
    }
}

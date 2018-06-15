package com.molvenolakeresort.model;

import java.util.Iterator;
import java.util.Map;

public class Hotel {

    private final int NUMBER_OF_ROOMS = 20;
    // array van rooms
    // array van bookings
    private RoomStore rooms = new RoomStore();
    private GuestStore guests = new GuestStore();
    private CheckInStore checkIns = new CheckInStore();

    public Hotel() {

        for( int i = 0; i < NUMBER_OF_ROOMS  ; i++) {
            rooms.createRoom();
        }

    }
    public Guest addGuest(String name) {
        return this.guests.addGuest(name);
    }

    public Guest getGuest(int id) {

        return this.guests.getGuest(id);
    }

    public void createRoom() {
        this.rooms.createRoom();
    }
    public Room getRoom(int id) {
        return this.rooms.getRoom(id);
    }

    public void showAllRooms() {
        for ( Room room:this.rooms) {
            System.out.println(room);
        }
    }

    public void showAllGuests() {
        for ( Guest guest:this.guests) {
            System.out.println(guest);
        }
    }
    public void checkInGuest(Guest g, Room r) {
        this.checkIns.checkIn(g, r);
    }

    public void showGuestsInRooms() {
        Iterator<Map.Entry<Guest, Room>> entries = this.checkIns.iterator();
        while (entries.hasNext()) {
            Map.Entry<Guest, Room> entry = entries.next();
            System.out.println("[GUEST] " + entry.getKey() + ", is checked in [ROOM] " + entry.getValue());
        }
    }



}

package com.molvenolakeresort.model;

public class Hotel {

    private final int NUMBER_OF_ROOMS = 20;
    // array van rooms
    // array van bookings
    private RoomStore rooms = new RoomStore();
    private GuestStore guests = new GuestStore();

    public Hotel() {

        for( int i = 0; i < NUMBER_OF_ROOMS  ; i++) {
            rooms.createRoom();
        }

    }
    public void addGuest(String name) {
        this.guests.addGuest(name);
    }

    public void createRoom() {
        this.rooms.createRoom();
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



}

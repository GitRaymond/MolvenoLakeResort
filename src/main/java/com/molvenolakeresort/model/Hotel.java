package com.molvenolakeresort.model;

import java.util.Scanner;

public class Hotel {

    // array van rooms
    // array van bookings
    public Store store;

    public Hotel() {

        this.store = new Store();

        int numberOfRooms = 20;

        for( int i = 0; i < numberOfRooms ; i++) {
            store.addRoom();
        }

    }

    public int mainMenu() {
        System.out.println("What would you like to do?");
        System.out.println("1: Create a room");
        System.out.println("2: Show all rooms");

        Scanner reader = new Scanner(System.in);  // Reading from System.in

        int choice = reader.nextInt(); // Scans the next token of the input as an int.
        //once finished

//        reader.close();

        return choice;
    }

    public void interpretedMenuChoice(int choice) {
        if( choice == 1 ) {

            this.store.addRoom();
        } else if ( choice == 2 ){
            this.showAllRooms();
        }
    }

    public void showAllRooms() {
        for (int i = 0; i < this.store.rooms.size(); i++) {
            System.out.println(this.store.rooms.get(i+1));
        }
    }



}

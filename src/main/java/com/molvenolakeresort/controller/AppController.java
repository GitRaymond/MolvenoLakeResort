package com.molvenolakeresort.controller;

import com.molvenolakeresort.model.Guest;
import com.molvenolakeresort.model.Hotel;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AppController {

    private Hotel hotel = new Hotel();

    private boolean state = true;

    public void run() throws InterruptedException {

        while (state) {
            this.interpretedMenuChoice(this.mainMenu());
        }
    }

    private int mainMenu() {
        System.out.println("What would you like to do?");
        System.out.println("1: Create a room");
        System.out.println("2: Show all rooms");
        System.out.println("3: Create a guest");
        System.out.println("4: Show all guests");
        System.out.println("9: Exit");

        Scanner reader = new Scanner(System.in);  // Reading from System.in

        int choice = reader.nextInt(); // Scans the next token of the input as an int.
        //once finished

//        reader.close();

        return choice;
    }


    private void interpretedMenuChoice(int choice) throws InterruptedException {
        if( choice == 1 ) {
            hotel.createRoom();
        } else if ( choice == 2 ){
            hotel.showAllRooms();
        } else if ( choice == 3 ) {
            this.checkInGuest();
        } else if ( choice == 4 ) {
            hotel.showAllGuests();
        } else if ( choice == 9 ) {
            this.quit();
        }
    }
    private void quit() {
        this.state = false;
    }

    private void checkInGuest() throws InterruptedException {
        System.out.println("What is the name of the guest?");

        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();

        this.hotel.addGuest(name);

        Guest guest = this.hotel.addGuest(name);

        System.out.println(name + " is checked into the Hotel!");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("What is the birth year of " + name + "?");
        int year = reader.nextInt();

        System.out.println("In which month is " + name + " born?");
        int month = reader.nextInt();

        System.out.println("On what day is " + name + " born?");
        int day = reader.nextInt();

        guest.setDateOfBirth(year, month, day);

        System.out.println("Okay, so " + name + "'s birth day of " + day + "-" + month + "-" + year + " is in the system, thanks!");

        System.out.println("Now let's set " + name + " with a room..");

        System.out.println("In what room number would you like to book " + name + "?");
        int roomNumber = reader.nextInt();

        hotel.checkInGuest(guest, hotel.getRoom(roomNumber));
        System.out.println(name + " is checked in in room " + roomNumber + "!");
        TimeUnit.SECONDS.sleep(1);
    }
}

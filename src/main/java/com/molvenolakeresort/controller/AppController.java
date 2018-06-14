package com.molvenolakeresort.controller;

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

    private void quit() {
        this.state = false;
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

    private void checkInGuest() throws InterruptedException {
        System.out.println("What is the name of the guest?");

        Scanner reader = new Scanner(System.in);  // Reading from System.in

        String answer = reader.nextLine(); // Scans the next token of the input as an int.
        //once finished
        this.hotel.addGuest(answer);
        System.out.println(answer + " is checked into the Hotel!");
        TimeUnit.SECONDS.sleep(2);


    }
}

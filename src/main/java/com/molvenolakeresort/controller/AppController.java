package com.molvenolakeresort.controller;

import com.molvenolakeresort.helper.InputRetriever;
import com.molvenolakeresort.model.Guest;
import com.molvenolakeresort.model.Hotel;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class AppController {

    private Hotel hotel = new Hotel();

    private boolean state = true;

    private Map<Integer, String> mainMenuChoices = new HashMap<>();

    public AppController(){
        this.fillMenuChoices();
    }

    public void run() throws InterruptedException {

        while (state) {
            this.interpretedMenuChoice(this.mainMenu());
        }
    }

    private int mainMenu() {

        this.showMainMenu();

        int choice = this.getMenuChoice();

        return choice;
    }

    private void showMainMenu() {
        System.out.println("What would you like to do?");

        for (Map.Entry<Integer, String> menuChoicePair : this.mainMenuChoices.entrySet()){
            System.out.println(menuChoicePair.getKey() + ": " + menuChoicePair.getValue());
        }

    }

    private int getMenuChoice() {
        Boolean valid = false;
        int choice = 0;

        do {
            try {
                Scanner reader = new Scanner(System.in);
                choice = reader.nextInt();
                if (this.mainMenuChoices.containsKey(choice)) {
                    valid = true;
                } else {
                    System.out.println("That choice is not in the menu");
                }

            } catch (Exception e) {
                System.out.println("Input must be a number... ");

            }
        } while (!valid);

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
        } else if ( choice == 5 ) {
            hotel.showGuestsInRooms();
        } else if ( choice == 9 ) {
            this.quit();
        }
    }

    private void quit() {
        System.out.println("Thank you for using this application!");
        this.state = false;
    }

    private void checkInGuest() throws InterruptedException {
        System.out.println("What is the name of the guest?");

        InputRetriever ir = new InputRetriever();

        String name = ir.retrieveName();

        Guest guest = this.hotel.addGuest(name);

        System.out.println(name + " is checked into the Hotel!");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("What is the birth year of " + name + "?");
        int year = ir.retrieveValidBirthYear();

        System.out.println("In which month is " + name + " born?");
        int month = ir.retrieveValidMonth();

        System.out.println("On what day is " + name + " born?");
        int day = ir.retrieveValidDay(year, month);

        guest.setDateOfBirth(year, month, day);

        System.out.println("Okay, so " + name + "'s birth day of " + day + "-" + month + "-" + year + " is in the system, thanks!");
        System.out.println("Now let's set " + name + " with a room..");
        System.out.println("In what room number would you like to book " + name + "?");
        int roomNumber = ir.retrieveValidRoomNumber(hotel.getRooms());

        hotel.checkInGuest(guest, hotel.getRoom(roomNumber));
        System.out.println(name + " is checked in in room " + roomNumber + "!");
        TimeUnit.SECONDS.sleep(1);
    }

//    ----------------------------------------------
//    HELPERS
//    ----------------------------------------------

    private void fillMenuChoices() {
        this.mainMenuChoices.put(1, "Create a room");
        this.mainMenuChoices.put(2, "Show all rooms");
        this.mainMenuChoices.put(3, "Check in guest");
        this.mainMenuChoices.put(4, "Show all guests");
        this.mainMenuChoices.put(5, "Show guests in rooms");
        this.mainMenuChoices.put(9, "Exit");

    }

}

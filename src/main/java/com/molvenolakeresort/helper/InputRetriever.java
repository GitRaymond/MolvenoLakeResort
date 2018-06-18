package com.molvenolakeresort.helper;


import com.molvenolakeresort.model.Room;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class InputRetriever {

    public int retrieveValidBirthYear() {

        boolean valid = false;
        int year = 1900;
        int currentYear = LocalDate.now().getYear();

        do {
            try {
                Scanner reader = new Scanner(System.in);
                int input = reader.nextInt();
                if ( input > 1900 && input <= currentYear) {
                    year = input;
                    valid = true;
                } else {
                    System.out.println("Please provide a year between 1900 and " + currentYear);
                }

            } catch (InputMismatchException e) {
                System.out.println("A year only consists of numbers..");
            }
        } while (!valid);


        return year;
    }

    public int  retrieveValidMonth() {
        boolean valid = false;
        int month = 0;


        do {
            try {
                Scanner reader = new Scanner(System.in);
                int input = reader.nextInt();
                if ( input > 0 && input <= 12) {
                    month = input;
                    valid = true;
                } else {
                    System.out.println("Please provide a month number between 1 and 12");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please provide only numbers.");
            }
        } while (!valid);

        return month;
    }

    public int  retrieveValidDay(int year, int month) {
        boolean valid = false;
        int day = 0;


        do {
            try {
                Scanner reader = new Scanner(System.in);
                int input = reader.nextInt();
                LocalDate test2 = LocalDate.of(year, month, input);
                day = input;
                valid = true;

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Please provide a valid day of " + Month.of(month));
            }
        } while (!valid);

        return month;
    }

    public String retrieveName() {
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();

        return name;
    }

    public int retrieveValidRoomNumber(Map<Integer, Room> roomStore) {
        boolean valid = false;
        int roomNumber = 0;

        do {
            try {
                Scanner reader = new Scanner(System.in);
                int input = reader.nextInt();
                if (roomStore.containsKey(input)) {
                    roomNumber = input;
                    valid = true;
                } else {
                    System.out.println("This room number is not a known Molveno room number");
                    System.out.println("The known rooms are: ");
                    for (Map.Entry<Integer, Room> pair : roomStore.entrySet()){
                        System.out.print(pair.getValue() + ", ");
                    }

                }

            } catch (Exception e) {
                System.out.println("Please specify a number");
            }

        } while (!valid);

        return  roomNumber;
    }


}

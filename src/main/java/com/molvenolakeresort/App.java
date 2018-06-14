package com.molvenolakeresort;

import com.molvenolakeresort.model.Hotel;



/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Hotel hotel = new Hotel();

        hotel.showAllRooms();

        int i = 0;
        while (i < 5) {
            hotel.interpretedMenuChoice(hotel.mainMenu());
            i++;
        }


    }




}

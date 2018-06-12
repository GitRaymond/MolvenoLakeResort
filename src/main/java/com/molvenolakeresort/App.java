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
        Hotel molvenoLakeResort = new Hotel();


        for (int i = 0; i < molvenoLakeResort.getRooms().length; i++) {
            System.out.println(molvenoLakeResort.getRooms()[i]);
        }

        System.out.println("--------------");

        for (int i = 0; i < molvenoLakeResort.store.rooms.size(); i++) {
            System.out.println(molvenoLakeResort.store.rooms.get(i+1));
        }


    }
}

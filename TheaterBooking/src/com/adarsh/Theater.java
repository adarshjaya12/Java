package com.adarsh;

import java.util.ArrayList;

/**
 * Created by adarsh on 3/15/2016.
 */
public class Theater {
    private final String theaterName;
    private list<Seat> seats = new ArrayList<>();

    public Theater(String theaterName,int numberRows , int seatPerRows) {
        this.theaterName = theaterName;
        int lastRow = 'A' + (numberRows -1);
        for(char row = 'A' ; row <= lastRow ; row++)
        {
            for(int seatNum = 1 ; seatNum <= seatPerRows ; seatNum++)
                Seat seat = new Seat(row + String.format("%02d",seatNum));

        }
    }


}

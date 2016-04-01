package com.adarsh;

import java.util.Date;

/**
 * Created by adarsh on 3/31/2016.
 */
public class Budget
{
    private String title;
    private int date;

    public Budget(String title, int date)
    {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}

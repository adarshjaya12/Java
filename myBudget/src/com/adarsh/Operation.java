package com.adarsh;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by adarsh on 3/31/2016.
 */
public class Operation {

    ArrayList<Budget> myArrayList = new ArrayList<Budget>();
    Scanner scanner = new Scanner(System.in);
    Budget budget;
    String title;
    int date;
    public Operation()
    {

    }

    public void addBudget()
    {
        System.out.println("Enter the Title");
        title = scanner.next();
        System.out.println("Enter the Date");
        date = scanner.nextInt();
        myArrayList.add(new Budget(title,date));

    }
    public void removeBudget()
    {

    }
    public void editBudget()
    {

    }
    public void displayBudget()
    {
        for(int i=0; i < myArrayList.size(); i++)
        {
            System.out.println("Title : "+myArrayList.get(i).getTitle()+"\nDate: "+myArrayList.get(i).getDate());
        }
    }

}

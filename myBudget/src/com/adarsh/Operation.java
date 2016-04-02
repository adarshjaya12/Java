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
        String title;
        int indexNumber;
        System.out.println("Enter the Title to be removed");
        title = scanner.next();
        indexNumber = findId(title);
        if(indexNumber >= 0)
        {
            myArrayList.remove(indexNumber);
        }
        else
        {
            System.out.println("Not found");
        }
    }
    public void editBudget()
    {

    }
    public void displayBudget()
    {
        for(Budget g: myArrayList)
            System.out.println("Title :"+g.getTitle()+"\nDate : "+g.getDate());
    }

    private int findId(String findTitle)
    {
        for(int i=0; i<myArrayList.size()-1;i++)
        {
            System.out.println(myArrayList.size());
            if(myArrayList.get(i).getTitle().contains(findTitle))
            {
                return i;
            }
        }
        return -1;
    }

}

package com.series;

import java.util.Scanner;

/**
 * Created by adarsh on 3/15/2016.
 */
public class X {
    public void readScanner()
    {
        int x;
        Scanner scanner = new Scanner();
        x = scanner.nextInt();
        calculateTable(x);
    }
    public void calculateTable(int x)
    {
        for(int i =1 ; i<13;i++)
        {
            System.out.println("Value of "+x+" * "+i+" is "+x*i);

        }
    }
}

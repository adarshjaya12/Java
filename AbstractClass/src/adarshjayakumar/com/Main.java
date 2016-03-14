package adarshjayakumar.com;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        myArray.add(5);
        printArray(myArray);
    }
    public static void printArray(ArrayList<Integer> myArray)
    {
        for(Integer i : myArray)
        {
            System.out.println((Integer)i *2);
        }
    }
}

package adarshjayakumar.com;

import java.util.Scanner;

public class Main {

    public static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {

        int [] myArray = getIntegers(5);
        printArray(myArray);
        System.out.println("\nArray is now sorting");
        int[] sortedArray = sortArray(myArray);
        printArray(sortedArray);

    }

    public static int[] getIntegers(int number)
    {
        int [] newArray = new int[number];
        System.out.println("Enter the values to be sorted");
        for(int i=0 ; i< newArray.length ; i++)
        {
            newArray[i] = myScanner.nextInt();
        }
        return newArray;
    }
    public static void printArray(int[] myArray)
    {
        System.out.println("Values in Array");
        for(int i=0 ; i < myArray.length ; i++)
        {
            System.out.print(" "+myArray[i]+" ");
        }
    }
    public  static int[] sortArray(int[] myArray)
    {
        boolean flag = true;
        int [] newArray = myArray;
        while( flag)
        {
            flag = false;
            for(int i=0 ; i < newArray.length-1 ; i++)
            {
                if(newArray[i] < newArray[i+1])
                {
                    int swapVariable = newArray[i];
                    newArray[i] = newArray[i+1];
                    newArray[i+1] = swapVariable;
                    flag = true;
                }

            }

        }
        return newArray;

    }
}

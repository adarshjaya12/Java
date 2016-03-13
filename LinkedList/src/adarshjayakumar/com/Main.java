package adarshjayakumar.com;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        LinkedList<String> myLinkedList = new LinkedList<String>();
        myLinkedList.add("Chicago");
        myLinkedList.add("Mountain View");
        myLinkedList.add("San Palo");
        myLinkedList.add("Las Vegas");
        myLinkedList.add("Los Angles");
        myLinkedList.add("Chennai");
        myLinkedList.add("Dallas");
        printLinkedList(myLinkedList);
        visit(myLinkedList);
    }

    public static void printLinkedList(LinkedList<String> myLinkedList)
    {
        Iterator<String> i = myLinkedList.iterator();
        while(i.hasNext())
        {
            System.out.println("Places to visit "+i.next());
        }
        System.out.println("==============================");
    }

    public static boolean addInOrder(LinkedList<String> myLinkedList, String newCity)
    {
        ListIterator<String> myListIterator = myLinkedList.listIterator();
        while(myListIterator.hasNext())
        {
            int comparison = myListIterator.next().compareTo(newCity);
            if(comparison == 0)
            {
                System.out.println("This city has already been added to the list");
                return false;
            }
            else if(comparison > 0)
            {
                myListIterator.previous();
                myListIterator.add(newCity);
                return true;

            }
            else if(comparison < 0)
            {
                //Do nothing
            }
        }
        myListIterator.add(newCity);
        return true;
    }
    public  static void visit(LinkedList cities)
    {
        Scanner scanner = new Scanner(System.in);
        boolean quit = true;
        boolean goingForward = true;
        ListIterator<String> myListIterator = cities.listIterator();
        if(cities.isEmpty())
        {
            System.out.println("No cities in the itenary");
            return;
        }
        else {
            System.out.println("Now visiting "+myListIterator.next());
            printMenu();
        }

        while(quit)
        {
            int userValue = scanner.nextInt();
            scanner.nextLine();
            switch (userValue)
            {
                case 0:
                    System.out.println("Holiday over");
                    quit= false;
                    break;
                case 1:
                   if(!goingForward)
                    {
                        if(myListIterator.hasNext())
                        {
                            myListIterator.next();
                        }
                        goingForward = true;
                    }
                    if(myListIterator.hasNext())
                    {
                        System.out.println("Now visiting "+myListIterator.next());
                        break;
                    }
                    else
                    {
                        System.out.println(myListIterator.previous()+" was the Last city in the list");
                        goingForward = false;
                        break;
                    }
                case 2:
                    if(goingForward)
                    {
                        if(myListIterator.hasPrevious())
                        {
                            myListIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(myListIterator.hasPrevious())
                    {
                        myListIterator.previous();
                        System.out.println("Previous city is "+myListIterator.previous());
                        break;
                    }
                    else
                    {
                        System.out.println("First City in the list");
                        goingForward = true;
                        break;
                    }
                case 3:
                    printMenu();
                    break;

            }
        }

    }
    public static void printMenu()
    {
        System.out.println("Available actions : \n select");
        System.out.println("0 - to Quit");
        System.out.println("1 - go to next city");
        System.out.println("2 - go to previous city");
        System.out.println("3 - Print Menu");
    }
}

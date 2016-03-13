package adarshjayakumar.com;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args)
    {
        LinkedList<String> myLinkedList = new LinkedList<String>();
        myLinkedList.add("Chicago");
        myLinkedList.add("Mountain View");
        myLinkedList.add("San Palo");
        myLinkedList.add("Las Vegas");
        myLinkedList.add("Los Angles");
        myLinkedList.add("Chicago");
        myLinkedList.add("Chicago");
        printLinkedList(myLinkedList);
        addInOrder(myLinkedList,"Denmark");
        printLinkedList(myLinkedList);

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
}

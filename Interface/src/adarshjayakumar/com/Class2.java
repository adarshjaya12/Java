package adarshjayakumar.com;

import java.util.LinkedList;

/**
 * Created by adarsh on 3/13/2016.
 */
public class Class2 implements IStorageMedium {

    private LinkedList<String> myLinkedList;

    public Class2()
    {
        myLinkedList = new LinkedList<String>();
    }

    @Override
    public String returnVariable(int indexValue) {
        return myLinkedList.get(indexValue);
    }

    @Override
    public void storeVariable(String myVariable) {
        myLinkedList.add(myVariable);
    }
}

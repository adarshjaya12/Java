package adarshjayakumar.com;

import java.util.ArrayList;

/**
 * Created by adarsh on 3/13/2016.
 */
public class Class1 implements IStorageMedium {

   private ArrayList<String> addVariables;

    public Class1()
    {
        this.addVariables = new ArrayList<String>();
    }

    @Override
    public void storeVariable(String myVariable) {
        this.addVariables.add(myVariable);
    }

    @Override
    public String returnVariable(int indexValue) {
        if(addVariables.get(indexValue) != null)
        {
            return addVariables.get(indexValue);
        }
        else
        {
            return "Nothing found";
        }
    }
}

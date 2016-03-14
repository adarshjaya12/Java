package adarshjayakumar.com;
// The interface will just specify 2 methods, one to return an ArrayList of values to be saved
// and the other to populate the object's fields from an ArrayList.
import java.util.ArrayList;
import java.util.List;

/**
 * Created by adarsh on 3/13/2016.
 */
public interface SInterface {
    List write();
    void read(List<String> savedValue);


}

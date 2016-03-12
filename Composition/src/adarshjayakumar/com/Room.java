package adarshjayakumar.com;

/**
 * Created by adarsh on 3/11/2016.
 */
public class Room {

    private TV myTv;
    private Laptop myLaptop;
    private Table myTable;

    public Room(TV myTv, Laptop myLaptop, Table myTable) {
        this.myTv = myTv;
        this.myLaptop = myLaptop;
        this.myTable = myTable;
    }

    public TV getMyTv() {
        return myTv;
    }

    public Laptop getMyLaptop() {
        return myLaptop;
    }

    public Table getMyTable() {
        return myTable;
    }
}

package adarshjayakumar.com;

public class Main {

    public static void main(String[] args) {

        Size tableSize = new Size(30,20,10);
        Table myTable = new Table(4,tableSize,"Wooden Peach");
        Laptop myLaptop = new Laptop("Acer Nitro",899,2.5);
        TV myTv = new TV("Samsung","Black","Smart", new Dimension(60,30,5));

        Room myRoom = new Room(myTv,myLaptop,myTable);

        myRoom.getMyLaptop().turnOnLaptop();
        myRoom.getMyTable().openDrawer();
        myRoom.getMyTv().onTV();
    }
}

package adarshjayakumar.com;

public class Main {

    public static void main(String[] args) {
	    Bank myBank = new Bank("Bank Of America");
        myBank.addNewBranch("Chicago");
        myBank.addNewBranch("Aurora");
        myBank.addNewBranch("Naperville");
        myBank.addNewBranch("Deowntown");
        myBank.printBranch();
        myBank.addCustomer("Aurora","Adarsh Jayakumar",39.9);
        myBank.addCustomer("Chicago","Abhinav Jayakumar",139.9);
        myBank.addCustomer("Chicago","Jayakumar",839.9);
        myBank.addCustomer("Chicago","Jayalatha",539.9);
        myBank.dummyPrint();


    }
}

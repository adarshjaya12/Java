package adarshjayakumar.com;

public class Main {

    public static void main(String[] args) {
	    Bank myBank = new Bank("Bank Of America");
        myBank.addNewBranch("Chicago");
        myBank.addCustomer("Chicago","Adarsh Jayakumar",39.9);
        myBank.addCustomer("Chicago","Abhinav Jayakumar",139.9);
        myBank.addCustomer("Chicago","Jayakumar",839.9);
        myBank.addCustomer("Chicago","Jayalatha",539.9);
        System.out.println("\n \n");
        myBank.printTransactionDetails("Chicago");
        /*myBank.addNewBranch("Chennai");
        myBank.addCustomer("Chennai","Adarsh Jayakumar",3000);
        myBank.addCustomer("Chennai","Abhinav Jayakumar",6000);
        myBank.addCustomer("Chennai","Jayalatha Jayakumar",13000);
        myBank.addCustomer("Chennai"," Jayakumar",23000);
        myBank.printBranch();*/

      //  myBank.dummyPrint();


    }
}

package adarshjayakumar.com;
// Bills Burger Company Application
//Process of selling hamburgs
public class Main {

    public static void main(String[] args) {

        Hamburg myHamburg = new Hamburg("Normal","Italian","Chicken Ranch",4.98);
        myHamburg.addHamburgAdditional1("Tomato",0.88);
        myHamburg.addHamburgAdditional2("Letuce",0.65);
        System.out.println("Your Total is "+myHamburg.reciept());

        HealthyBurger myHealthyBurger = new HealthyBurger("Beef",6.12);
        myHealthyBurger.addHealthyAddition1Item("Healthy Sauce",1.31);
        myHealthyBurger.addHealthyAddition2Item("Mushroom",1.54);
        System.out.println("Your total is "+myHealthyBurger.reciept());

        DeluxeHamburg myDealuxHamburg = new DeluxeHamburg();
        System.out.println("Your total is "+myDealuxHamburg.reciept());




    }
}

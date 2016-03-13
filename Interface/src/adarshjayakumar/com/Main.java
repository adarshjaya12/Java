package adarshjayakumar.com;

public class Main {

    public static void main(String[] args) {
        IStorageMedium myStorage;
        myStorage = new Class1();
        myStorage.storeVariable("Hello");
        myStorage.storeVariable("I AM");
        myStorage.storeVariable("Adarsh");
        myStorage.storeVariable("Jayakumar");
        System.out.println("The found variable is "+myStorage.returnVariable(1));
        IStorageMedium myStorage2;
        myStorage2 = new Class2();
        myStorage2.storeVariable("This is");
        myStorage2.storeVariable("Why");
        myStorage2.storeVariable("I love ypi");
        System.out.println("The found variable is "+myStorage2.returnVariable(1));



    }
}

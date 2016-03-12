package adarshjayakumar.com;

public class Main {

    public static void main(String[] args) {
    Printer myPrinter = new Printer(80,200,true);
        myPrinter.printingPage(61,true);
        System.out.println("Tonner Level is "+myPrinter.getTonerLevel());
    }
}

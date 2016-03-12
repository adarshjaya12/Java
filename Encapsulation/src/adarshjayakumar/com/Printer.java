package adarshjayakumar.com;

/**
 * Created by adarsh on 3/11/2016.
 */
public class Printer
{
    private double tonerLevel;
    private int numberOfPages;
    private boolean duplexPrinter;

    public Printer(double tonerLevel, int numberOfPages, boolean duplexPrinter) {
        if(this.tonerLevel > 0 && this.tonerLevel <100)
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = 100;
        this.numberOfPages = numberOfPages;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillUpToner(int tonnerInk)
    {
        if((this.tonerLevel+tonnerInk)> 100)
            System.out.printf("Ink Overflow");
        else
            System.out.println("Ink has been refilled \n Tonner level is "+getTonerLevel());

    }
    public void printingPage(int numberOfPages , boolean isDuplex)
    {
        if(isDuplex)
        {
            if(numberOfPages/2 > this.numberOfPages)
                System.out.println("Please insert some paper to print \n Insufficient Papers to print");
            else {
                System.out.println("page has been printed");
                this.numberOfPages = this.numberOfPages - Math.round(numberOfPages/2);
                System.out.println("Pages available = "+this.numberOfPages);
            }
        }
        else
        {
            if(numberOfPages > this.numberOfPages)
                System.out.println("Please insert some paper to print \n Insufficient Papers to print");
            else {
                System.out.println("page has been printed");
                this.numberOfPages = this.numberOfPages - numberOfPages;
            }

        }


        tonerLevel = tonerLevel - (int)Math.floor(numberOfPages/2);
    }

    public void getPageCount()
    {
        System.out.println("Number of pages Available "+getNumberOfPages());
    }
    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
}

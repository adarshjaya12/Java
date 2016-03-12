package adarshjayakumar.com;

/**
 * Created by adarsh on 3/11/2016.
 */
public class Hamburg {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;
    private String additional1Name;
    private double additional1Price;
    private String additional2Name;
    private double additional2Price;
    private String additional3Name;
    private double additional3Price;
    private String additional4Name;
    private double additional4Price;

    public Hamburg(String name,String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }



    public void addHamburgAdditional1(String additional1Name,double additional1Price)
    {
        this.additional1Name = additional1Name;
        this.additional1Price = additional1Price;
    }
    public void addHamburgAdditional2(String additional2Name,double additional2Price)
    {
        this.additional2Name = additional2Name;
        this.additional2Price = additional2Price;
    }
    public void addHamburgAdditional3(String additional3Name,double additional3Price)
    {
        this.additional3Name = additional3Name;
        this.additional3Price = additional3Price;
    }
    public void addHamburgAdditional4(String additional4Name,double additional4Price)
    {
        this.additional4Name = additional4Name;
        this.additional4Price = additional4Price;
    }

    public double reciept(){
        double hamburgPrice= this.price;
        System.out.println(this.name+" hamburger with bread type "+this.breadRollType+" price is "+this.price);
        if(this.additional1Name != null) {
            hamburgPrice += additional1Price;
            System.out.println("Item "+this.additional1Name+" of price "+this.additional1Price+" has been added");
        }
        if(this.additional2Name != null) {
            hamburgPrice += additional2Price;
            System.out.println("Item "+this.additional2Name+" of price "+this.additional2Price+" has been added");
        }
        if(this.additional3Name != null) {
            hamburgPrice += additional3Price;
            System.out.println("Item "+this.additional3Name+" of price "+this.additional3Price+" has been added");
        }
        if(this.additional4Name != null) {
            hamburgPrice += additional4Price;
            System.out.println("Item "+this.additional4Name+" of price "+this.additional4Price+" has been added");
        }
        return hamburgPrice;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }
}

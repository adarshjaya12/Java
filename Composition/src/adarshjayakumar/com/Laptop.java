package adarshjayakumar.com;

/**
 * Created by adarsh on 3/11/2016.
 */
public class Laptop {

    private String manufacture;
    private double price;
    private double weight;

    public Laptop(String manufacture, double price, double weight) {
        this.manufacture = manufacture;
        this.price = price;
        this.weight = weight;
    }

    public void turnOnLaptop()
    {
        System.out.println("Acer Nitro has been turned on");
    }
    public String getManufacture() {
        return manufacture;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }


}

package adarshjayakumar.com;

/**
 * Created by adarsh on 3/11/2016.
 */
public class HealthyBurger extends Hamburg{

    private String healthyAddition1Item;
    private double healthyAddition1Price;

    private String healthyAddition2Item;
    private double healthyAddition2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy","Italian Healthy Bread", meat, price);

    }

    public void addHealthyAddition1Item (String healthyAddition1Item,double healthyAddition1Price){
        this.healthyAddition1Item = healthyAddition1Item;
        this.healthyAddition1Price =healthyAddition1Price;
    }

    public void addHealthyAddition2Item (String healthyAddition2Item,double healthyAddition1Price){
        this.healthyAddition2Item = healthyAddition2Item;
        this.healthyAddition2Price =healthyAddition1Price;
    }

    @Override
    public double reciept() {
        double hamburgPrice =  super.reciept();
        if(this.healthyAddition1Item != null) {
            hamburgPrice += this.healthyAddition1Price;
            System.out.println("Item "+this.healthyAddition1Item+" of price "+this.healthyAddition1Price+" has been added");
        }
        if(this.healthyAddition2Item != null) {
            hamburgPrice += this.healthyAddition2Price;
            System.out.println("Item "+this.healthyAddition2Item+" of price "+this.healthyAddition2Price+" has been added");
        }
        return  hamburgPrice;
    }
}

package adarshjayakumar.com;

/**
 * Created by adarsh on 3/11/2016.
 */
public class TV {
    private String make;
    private String model;
    private String color;
    private Dimension dimension;

    public TV(String make, String model, String color, Dimension dimension) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.dimension = dimension;
    }

    public void onTV()
    {
        System.out.println("You have switched on the TV");
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Dimension getDimension() {
        return dimension;
    }
}

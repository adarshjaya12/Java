/**
 * Created by adarsh on 3/11/2016.
 */
public class Car extends Vehicle
{
    private String make;
    private String model;
    private String color;
    private boolean autoTransmission;
    private boolean electricCar;

    public Car(int doors, int seats,String make ,String model ,String color, boolean autoTransmission, boolean electricCar)
    {
        super(4, doors, seats);
        this.make = make;
        this.model = model;
        this.color = color;
        this.autoTransmission = autoTransmission;
        this.electricCar = electricCar;
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

    public boolean isAutoTransmission() {
        return autoTransmission;
    }

    public boolean isElectricCar() {
        return electricCar;
    }
}

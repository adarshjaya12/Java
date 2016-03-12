/**
 * Created by adarsh on 3/11/2016.
 */
public class MercedesCLA extends Car {

    private int cyclinders;
    private int cyclinderCapacity;
    private boolean backCamera;
    private boolean autoParking;

    public MercedesCLA(int doors, int seats, String make, String model, String color, boolean autoTransmission, boolean electricCar,int cyclinders
    ,int cyclinderCapacity, boolean backCamera,boolean autoParking) {
        super(doors, seats, make, model, color, autoTransmission, electricCar);
        this.autoParking = autoParking;
        this.cyclinderCapacity = cyclinderCapacity;
        this.cyclinders = cyclinders;
        this.backCamera = backCamera;

    }

    public void display()
    {
        System.out.println("Your car "+getMake()+" "+getModel()+"has "+getDoors()+" doors and"+getSeats()+" seats");
        System.out.println("The engine has "+getCyclinderCapacity()+ " and "+getCyclinders()+" cylinders" );
        System.out.println("Features :");
        System.out.println("Auto Parking "+isAutoParking());
        System.out.println("Back Camera "+isBackCamera());
        System.out.println("Auto Transmission "+isAutoTransmission());
        System.out.println("Electric Car"+isElectricCar());
    }
    public  void driveCar(int speed)
    {

        move(100);

    }

    @Override
    public void move(int speed) {
        super.move(speed);
    }

    public int getCyclinders() {
        return cyclinders;
    }

    public int getCyclinderCapacity() {
        return cyclinderCapacity;
    }

    public boolean isBackCamera() {
        return backCamera;
    }

    public boolean isAutoParking() {
        return autoParking;
    }
}

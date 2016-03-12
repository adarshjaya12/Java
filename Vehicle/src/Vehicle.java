/**
 * Created by adarsh on 3/11/2016.
 */
public class Vehicle {

    private int speed;
    private int wheel;
    private int doors;
    private int seats;

    public Vehicle( int wheel, int doors, int seats) {

        this.wheel = wheel;
        this.doors = doors;
        this.seats = seats;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWheel() {
        return wheel;
    }

    public int getDoors() {
        return doors;
    }

    public int getSeats() {
        return seats;
    }

    public void speed(int value)
    {
        System.out.println("Your driving at "+value);
    }
    public void move(int speed)
    {
        System.out.println("Vehicle is moving ");
        speed(speed);
    }
}

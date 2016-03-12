/**
 * Created by adarsh on 3/11/2016.
 */
public class Main {
    public static void main(String[] args)
    {
        MercedesCLA mycar = new MercedesCLA(4,4,"Mercedes","CLA 250","red",true,false,6,2500,true,true);
        mycar.driveCar(112);
        mycar.display();

    }
}

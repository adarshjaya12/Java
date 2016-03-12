package adarshjayakumar.com;

/**
 * Created by adarsh on 3/11/2016.
 */
public class DeluxeHamburg extends Hamburg{

    public DeluxeHamburg() {
        super("Delux", "Italico White", "Sausage & Bacon", 4.53);
        super.addHamburgAdditional1("Chips",1.12);
        super.addHamburgAdditional2("Drink",1.31);
    }
}

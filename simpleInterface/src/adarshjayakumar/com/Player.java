package adarshjayakumar.com;

import java.util.*;

/**
 * Created by adarsh on 3/13/2016.
 */
public class Player implements SInterface {

    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon ="Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void read(List<String> savedValue) {
        if(savedValue != null && savedValue.size() >0)
        {
            this.name = savedValue.get(0);
            this.hitPoints=Integer.parseInt(savedValue.get(1));
            this.strength = Integer.parseInt(savedValue.get(2));
            this.weapon = savedValue.get(3);

        }
    }

    @Override
    public List write() {
        List<String > value = new ArrayList<String>();
        value.add(0,this.name);
        value.add(1,""+this.hitPoints);
        value.add(2,""+this.strength);
        value.add(3,this.weapon);
        return value;
    }
}

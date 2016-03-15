package adarshjayakumar.com;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by adarsh on 3/14/2016.
 */
public class LeagueTable <T extends Team>{

    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public LeagueTable(String name) {
        this.name = name;
    }


    public boolean addTeam(T addTeam)
    {
        if(league.contains(addTeam))
        {
            System.out.println(addTeam.getTeamName()+" is already added to the league");
            return false;
        }
        league.add(addTeam);
        return true;


    }
    public void showLeagueTable()
    {
        Collections.sort(league);
        for(T t : league)
        {
            System.out.println(t.getTeamName()+ " : "+t.result());
        }
    }
}

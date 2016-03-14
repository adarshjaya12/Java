package adarshjayakumar.com;

import java.util.ArrayList;

/**
 * Created by adarsh on 3/14/2016.
 */
public class Team <T>{
    private String teamName;
    private int gamesPlayed = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;
    ArrayList<T> addPlayers;
    public Team(String teamName) {
        this.teamName = teamName;
        this.addPlayers = new ArrayList<>();

    }

    public int teamSize()
    {
        return addPlayers.size();
    }
    public boolean addPlayer(T player)
    {
        if(addPlayers.contains(player))
        {
            System.out.println("Player already added");
            return false;
        }
        else
        {
            addPlayers.add(player);
            return true;
        }
    }

    public String getTeamName() {
        return teamName;
    }
}


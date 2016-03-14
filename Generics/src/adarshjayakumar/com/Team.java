package adarshjayakumar.com;

import java.util.ArrayList;

/**
 * Created by adarsh on 3/14/2016.
 */
public class Team <T extends Player>{
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
    public void matchResult(Team opponent , int ourScore , int theirScore)
    {
        String message="";
        if(ourScore > theirScore)
        {
            won++;
            message =" Won against ";
        }
        else if(ourScore < theirScore)
        {
            lost++;
            message = " lost against ";
        }
        else if(ourScore == theirScore)
        {
            tied++;
            message = " Tied with ";
        }
        gamesPlayed++;
        if(opponent!= null)
        {
            System.out.println(this.getTeamName()+""+message+""+opponent.getTeamName());
            opponent.matchResult(null,theirScore,ourScore);
        }

    }

    public String getTeamName() {
        return teamName;
    }
    public int result()
    {
        return (won*2)+tied;
    }
}


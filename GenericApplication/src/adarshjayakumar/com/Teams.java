package adarshjayakumar.com;

/**
 * Created by adarsh on 3/14/2016.
 */
public class Teams {
    private String teamName;
    private int numberOfPlayers;
    private int gameWon;
    private int gameTied;
    private int gameLost;

    public Teams(String teamName, int numberOfPlayers, int gameWon, int gameTied, int gameLost) {
        this.teamName = teamName;
        this.numberOfPlayers = numberOfPlayers;
        this.gameWon = gameWon;
        this.gameTied = gameTied;
        this.gameLost = gameLost;
    }

    public int getResult()
    {
        return (gameWon * 2) + gameTied;
    }
    public String getTeamName() {
        return teamName;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }
}

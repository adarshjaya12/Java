package adarshjayakumar.com;

/**
 * Created by adarsh on 3/14/2016.
 */
public abstract class Player {
    private String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }
}

package adarshjayakumar.com;

public class Main {

    public static void main(String[] args) {
	    FootballPlayer johnBlake = new FootballPlayer("JohnBlake");
        SoccerPlayer hererra = new SoccerPlayer("Hererra");
        CricketPlayer raina = new CricketPlayer("Suresh Raina");
        Team chennai = new Team("Chennai Super Kings");
        chennai.addPlayer(johnBlake);
        chennai.addPlayer(hererra);
        chennai.addPlayer(raina);
        System.out.println(chennai.teamSize());
    }
}

package adarshjayakumar.com;

public class Main {

    public static void main(String[] args) {
	    FootballPlayer johnBlake = new FootballPlayer("John Blake");
        FootballPlayer mikelWarm = new FootballPlayer("Mikel Warm");
        FootballPlayer TonyShark = new FootballPlayer("Tony Shark");
        FootballPlayer VinDuo = new FootballPlayer("Vun Duo");
        Team<FootballPlayer> chennai = new Team<>("Chennai Super Kings");
        chennai.addPlayer(johnBlake);
        chennai.addPlayer(mikelWarm);
        chennai.addPlayer(TonyShark);
        chennai.addPlayer(VinDuo);
        System.out.println(chennai.teamSize());
        SoccerPlayer hererra = new SoccerPlayer("Hererra");
        Team<SoccerPlayer> mySoccerTeam = new Team<>("Manchester United");
        System.out.println(chennai.teamSize());
        Team<CricketPlayer> myCricketTeam = new Team<>("Rajkot Lions");
        CricketPlayer raina = new CricketPlayer("Suresh Raina");
        myCricketTeam.addPlayer(raina);
        

    }
}

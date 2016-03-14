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
        Team<SoccerPlayer> manUtd = new Team<>("Manchester United");
        Team<SoccerPlayer> rmfc = new Team<>("Real Madrid");
        Team<SoccerPlayer> fcb = new Team<>("Barcelona");
        Team<SoccerPlayer> chelsea = new Team<>("Chelsea");
        manUtd.matchResult(rmfc,3,1);
        manUtd.matchResult(chelsea,6,1);
        rmfc.matchResult(fcb,10,1);
        chelsea.matchResult(rmfc,1,11);
        System.out.println(manUtd.getTeamName()+" : "+manUtd.result());
        System.out.println(rmfc.getTeamName()+" : "+rmfc.result());
        System.out.println(chelsea.getTeamName()+" : "+chelsea.result());
        System.out.println(fcb.getTeamName()+" : "+fcb.result());

        Team<CricketPlayer> myCricketTeam = new Team<>("Rajkot Lions");
        CricketPlayer raina = new CricketPlayer("Suresh Raina");
        myCricketTeam.addPlayer(raina);


    }
}

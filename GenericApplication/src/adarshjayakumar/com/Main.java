package adarshjayakumar.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LeagueTable <Team<SoccerPlayer>> epl = new LeagueTable<>("English Premium League");
        Team<SoccerPlayer> manchesterUnited = new Team<>("Manchester United");
        Team<SoccerPlayer> chelsea = new Team<>("Chelsea");
        Team<SoccerPlayer> liverpool = new Team<>("Liverpool");
        Team<SoccerPlayer> manchesterCity = new Team<>("Manchester City");
        SoccerPlayer unitedPlayer1 = new SoccerPlayer("Wayne Rooney");
        SoccerPlayer unitedPlayer2 = new SoccerPlayer("Andre Herera");
        SoccerPlayer unitedPlayer3 = new SoccerPlayer("Juan Mata");
        SoccerPlayer unitedPlayer4 = new SoccerPlayer("Bastian Schawizniger");
        SoccerPlayer unitedPlayer5 = new SoccerPlayer("David Degea");

        manchesterUnited.addPlayer(unitedPlayer1);
        manchesterUnited.addPlayer(unitedPlayer2);
        manchesterUnited.addPlayer(unitedPlayer3);
        manchesterUnited.addPlayer(unitedPlayer4);
        manchesterUnited.addPlayer(unitedPlayer5);

        //SoccerPlayer  = new SoccerPlayer("");

        SoccerPlayer chelseaPlayer1 = new SoccerPlayer("Costa");
        SoccerPlayer chelseaPlayer2 = new SoccerPlayer("Fabregas");
        SoccerPlayer chelseaPlayer3 = new SoccerPlayer("Matic");
        SoccerPlayer chelseaPlayer4 = new SoccerPlayer("Pedro");
        SoccerPlayer chelseaPlayer5 = new SoccerPlayer("Oscar");

        chelsea.addPlayer(chelseaPlayer1);
        chelsea.addPlayer(chelseaPlayer2);
        chelsea.addPlayer(chelseaPlayer3);
        chelsea.addPlayer(chelseaPlayer4);
        chelsea.addPlayer(chelseaPlayer5);


        SoccerPlayer  liverpoolPlayer1 = new SoccerPlayer("Furminio");
        SoccerPlayer liverpoolPlayer2 = new SoccerPlayer("Henderson");
        SoccerPlayer  liverpoolPlayer3= new SoccerPlayer("Miller");
        SoccerPlayer  liverpoolPlayer4= new SoccerPlayer("Sturridge");
        SoccerPlayer  liverpoolPlayer5= new SoccerPlayer("Cuntinio");

        liverpool.addPlayer(liverpoolPlayer1);
        liverpool.addPlayer(liverpoolPlayer2);
        liverpool.addPlayer(liverpoolPlayer3);
        liverpool.addPlayer(liverpoolPlayer4);
        liverpool.addPlayer(liverpoolPlayer5);


        SoccerPlayer mancityPlayer1 = new SoccerPlayer("Aguero");
        SoccerPlayer mancityPlayer2 = new SoccerPlayer("Yaya Toure");
        SoccerPlayer mancityPlayer3 = new SoccerPlayer("Kompany");
        SoccerPlayer mancityPlayer4 = new SoccerPlayer("Sterling");
        SoccerPlayer mancityPlayer5 = new SoccerPlayer("Silva");

        manchesterCity.addPlayer(mancityPlayer1);
        manchesterCity.addPlayer(mancityPlayer2);
        manchesterCity.addPlayer(mancityPlayer3);
        manchesterCity.addPlayer(mancityPlayer4);
        manchesterCity.addPlayer(mancityPlayer5);
        System.out.println("Fixtures Result : \n");
        manchesterUnited.matchResult(manchesterCity,3,1);
        manchesterUnited.matchResult(chelsea,4,3);
        manchesterUnited.matchResult(liverpool,2,1);
        manchesterUnited.matchResult(manchesterCity,5,3);
        manchesterUnited.matchResult(chelsea,7,1);
        manchesterUnited.matchResult(liverpool,2,2);

        chelsea.matchResult(manchesterCity,2,1);
        chelsea.matchResult(liverpool,1,1);
        chelsea.matchResult(manchesterCity,2,4);
        chelsea.matchResult(liverpool,1,2);

        manchesterCity.matchResult(liverpool,1,2);
        manchesterCity.matchResult(liverpool,2,2);

        /*chelsea.matchResult(manchesterCity,3,1);
        chelsea.matchResult(manchesterUnited,4,3);
        chelsea.matchResult(liverpool,2,1);
        chelsea.matchResult(manchesterCity,5,3);
        chelsea.matchResult(manchesterUnited,7,1);
        chelsea.matchResult(liverpool,2,2);

        manchesterUnited.matchResult(manchesterCity,3,1);
        manchesterUnited.matchResult(chelsea,4,3);
        manchesterUnited.matchResult(liverpool,2,1);
        manchesterUnited.matchResult(manchesterCity,5,3);
        manchesterUnited.matchResult(chelsea,7,1);
        manchesterUnited.matchResult(liverpool,2,2);

        manchesterUnited.matchResult(manchesterCity,3,1);
        manchesterUnited.matchResult(chelsea,4,3);
        manchesterUnited.matchResult(liverpool,2,1);
        manchesterUnited.matchResult(manchesterCity,5,3);
        manchesterUnited.matchResult(chelsea,7,1);
        manchesterUnited.matchResult(liverpool,2,2);*/



        epl.addTeam(manchesterUnited);
        epl.addTeam(chelsea);
        epl.addTeam(liverpool);
        epl.addTeam(manchesterCity);
        epl.showLeagueTable();

        LeagueTable <Team<CricketPlayer>> ipl = new LeagueTable<>("English Premium League");
        Team<CricketPlayer> csk = new Team<>("Chennai Super kings");
        Team<CricketPlayer> kxip = new Team<>("Kings XI punjab");
        Team<CricketPlayer> rcb = new Team<>("Royal challengers Banglore");
        Team<CricketPlayer> mi = new Team<>("Mumbai Indians");

        CricketPlayer cskPlayer1 = new CricketPlayer("MS Dhoni");
        CricketPlayer cskPlayer2 = new CricketPlayer("Suresh Raina");
        CricketPlayer cskPlayer3 = new CricketPlayer("R Ashwin");
        CricketPlayer cskPlayer4 = new CricketPlayer("Brendon Mcculumm");
        CricketPlayer cskPlayer5 = new CricketPlayer("Dwayne Smith");
        csk.addPlayer(cskPlayer1);
        csk.addPlayer(cskPlayer2);
        csk.addPlayer(cskPlayer3);
        csk.addPlayer(cskPlayer4);
        csk.addPlayer(cskPlayer5);

        CricketPlayer kxipPlayer1 = new CricketPlayer("Yuvraj");
        CricketPlayer kxipPlayer2 = new CricketPlayer("Maxwel");
        CricketPlayer kxipPlayer3 = new CricketPlayer("Vijay");
        CricketPlayer kxipPlayer4 = new CricketPlayer("George Bailey");
        CricketPlayer kxipPlayer5 = new CricketPlayer("Miller");
        kxip.addPlayer(kxipPlayer1);
        kxip.addPlayer(kxipPlayer2);
        kxip.addPlayer(kxipPlayer3);
        kxip.addPlayer(kxipPlayer4);
        kxip.addPlayer(kxipPlayer5);

        CricketPlayer rcbPlayer1 = new CricketPlayer("Kholi");
        CricketPlayer rcbPlayer2 = new CricketPlayer("ABD");
        CricketPlayer rcbPlayer3 = new CricketPlayer("Gayle");
        CricketPlayer rcbPlayer4 = new CricketPlayer("Starc");
        CricketPlayer rcbPlayer5 = new CricketPlayer("Watson");
        rcb.addPlayer(rcbPlayer1);
        rcb.addPlayer(rcbPlayer2);
        rcb.addPlayer(rcbPlayer3);
        rcb.addPlayer(rcbPlayer4);
        rcb.addPlayer(rcbPlayer5);

        CricketPlayer miPlayer1 = new CricketPlayer("Sharma");
        CricketPlayer miPlayer2 = new CricketPlayer("Malinga");
        CricketPlayer miPlayer3 = new CricketPlayer("Rayudu");
        CricketPlayer miPlayer4 = new CricketPlayer("Harbajan");
        CricketPlayer miPlayer5 = new CricketPlayer("Sachin");
        mi.addPlayer(miPlayer1);
        mi.addPlayer(miPlayer2);
        mi.addPlayer(miPlayer3);
        mi.addPlayer(miPlayer4);
        mi.addPlayer(miPlayer5);
        System.out.println("Fixture Result : \n");
        csk.matchResult(kxip,1,0);
        csk.matchResult(kxip,1,0);
        csk.matchResult(rcb,1,0);
        csk.matchResult(rcb,0,1);
        csk.matchResult(mi,1,0);
        csk.matchResult(mi,0,1);
        kxip.matchResult(rcb,1,0);
        kxip.matchResult(rcb,0,1);
        kxip.matchResult(mi,1,0);
        kxip.matchResult(mi,0,1);
        rcb.matchResult(mi,1,0);
        rcb.matchResult(mi,0,1);


        ipl.addTeam(csk);
        ipl.addTeam(kxip);
        ipl.addTeam(rcb);
        ipl.addTeam(mi);
        ipl.showLeagueTable();






    }
}

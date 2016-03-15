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
        SoccerPlayer liverpoolPlayer2= new SoccerPlayer("Henderson");
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
        
        epl.addTeam(manchesterUnited);
        epl.addTeam(chelsea);
        epl.addTeam(liverpool);
        epl.addTeam(manchesterCity);
        epl.showLeagueTable();













    }
}

package Table;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static ArrayList<Team> teams= new ArrayList<>();
    public static void main(String[] args) {
        CricketPlayer sachin= new CricketPlayer("Sachin");
        BaseballPlayer patt= new BaseballPlayer("Patt");
        FootballPlayer messi= new FootballPlayer("Messi");
        FootballPlayer iniesta = new FootballPlayer("Iniesta");
        FootballPlayer xavi= new FootballPlayer("Xavi");
        Team barcelona= new Team("Barcelona");
        barcelona.addPlayer(messi);
        barcelona.addPlayer(iniesta);
        barcelona.addPlayer(xavi);
        FootballPlayer ronlado= new FootballPlayer("Ronlado");
        FootballPlayer kroos= new FootballPlayer("Kroos");
        Team realMadrid= new Team("Real Madrid");
        realMadrid.addPlayer(ronlado);
        realMadrid.addPlayer(kroos);
        barcelona.matchResult(realMadrid,2,1);
        barcelona.matchResult(realMadrid,0,3);
        barcelona.matchResult(realMadrid,5,2);
        barcelona.matchResult(realMadrid,4,7);
        barcelona.matchResult(realMadrid,0,2);

        teams.add(barcelona);
        teams.add(realMadrid);
        Collections.sort(teams);
        table();
        Team india = new Team("India");
        india.addPlayer(patt);


    }
    public static void table (){
        for(int i=0;i<teams.size();i++){
            System.out.println(teams.get(i).getName()+" : "+teams.get(i).ranking());
        }

    }
}

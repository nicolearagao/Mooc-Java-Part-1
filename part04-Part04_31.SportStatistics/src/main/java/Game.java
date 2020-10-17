/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nicole
 */
public class Game {
    String homeTeam;
    String visitorTeam;
    int homePoints;
    int visitorPoints;
    
    
    public Game(String home, String visitor,int hPoints,int vPoints){
        this.homeTeam = home;
        this.visitorTeam = visitor;
        this.homePoints = hPoints;
        this.visitorPoints = vPoints;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getVisitorTeam() {
        return visitorTeam;
    }

    public int getHomePoints() {
        return homePoints;
    }

    public int getVisitorPoints() {
        return visitorPoints;
    }
    
    @Override
   public String toString(){
       return homeTeam + visitorTeam + homePoints + visitorPoints;
   }
}

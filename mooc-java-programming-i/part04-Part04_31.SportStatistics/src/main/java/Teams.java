/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chad
 */
public class Teams {

    private String team1;
    private String team2;
    private int t1Score;
    private int t2Score;

    private int wins;

    public Teams(String teamname1, String teamname2, int team1score, int team2score){
        this.team1 = teamname1;
        this.team2 = teamname2;
        this.t1Score = team1score;
        this.t2Score = team2score;

        this.wins = 0;
    }
    public String getName(){
        return team1;
        
    }
    public int getWins(){
        return wins;
    }
    public String toString(){
        return this.team1 + ", " + this.team2 + ": SCORE- " + this.t1Score + "/" + this.t2Score;
                
    }

}

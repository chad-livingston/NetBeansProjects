/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chad
 */
public class Matchs {
    private String homeTeam;
    private String awayTeam;
    private int homeTeamScore;
    private int awayTeamScore;
    public Matchs(String homeTeam, String awayTeam, int homeTeamScore, int awayTeamScore){
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeTeamScore = homeTeamScore;
        this.awayTeamScore = awayTeamScore;
    }
    public String getTeamNames(){
        return homeTeam + "," + awayTeam;
    }
    public String toString(){
        return "Match: " + this.homeTeam + " VS " + this.awayTeam + " SCORE: " + this.homeTeamScore + " / " + this.awayTeamScore;
    }
}

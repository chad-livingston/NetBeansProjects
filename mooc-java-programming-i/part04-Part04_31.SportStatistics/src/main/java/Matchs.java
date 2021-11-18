/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Chad
 */
public class Matchs{
    private String name;
    private int wins;
    private int losses;
    
    public Matchs(String name) {
        this.name = name;
        this.wins = 0;
        this.losses = 0;
    }
    
    public String getName() {
        return name;
    }
    
    public int getWins() {
        return wins;
    }
    
    public int getLosses() {
        return losses;
    }
    
    public void addWin() {
        wins++;
    }
    
    public void addLoss() {
        losses++;
    }
    
    public int getGames() {
        return (wins + losses);
    }
}

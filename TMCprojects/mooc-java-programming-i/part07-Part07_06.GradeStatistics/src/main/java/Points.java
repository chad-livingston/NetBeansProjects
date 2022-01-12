
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chad
 */
public class Points {

    ArrayList<Integer> points;
    ArrayList<Integer> pass;

    public Points() {
        this.points = new ArrayList<>();
        this.pass = new ArrayList<>();
    }

    public void addPoints(int points) {
        this.points.add(points);
    }
    
    public double passPercentage(){
        return 100 * this.pass.size() / this.points.size();
    }
    
    public double averagePass(ArrayList<Integer> list){
        int sumPass = 0;
        for (Integer num : list){
            if (num >= 50){
                this.pass.add(num);
                sumPass += num;
            }
        }
        if (this.pass.size() == 0){
            return -1;
        }
        return sumPass / list.size();
    }
    public double averagePoints(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer num : list) {
            
            sum += num;
        }

        return sum / list.size();
    }
    public String toString(){
        if (averagePass(this.pass) == -1){
            return "Point average (all): " + averagePoints(this.points) + "\n"
                + "Point average (passing): -" + "\n"
                + "Pass percentage: " + passPercentage();
        } else {
            return "Point average (all): " + averagePoints(this.points) + "\n"
                + "Point average (passing): " + averagePass(this.points) + "\n"
                + "Pass percentage: " + passPercentage();
        }
    }

}

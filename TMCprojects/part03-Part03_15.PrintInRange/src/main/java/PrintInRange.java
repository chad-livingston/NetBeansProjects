
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numList = new ArrayList<>();
        
        printNumbersInRange(numList, 1, 5);
    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for (int num : numbers){
            if (num >= lowerLimit && num <= upperLimit){
                System.out.println(num);
            }
        }
    }
    
}

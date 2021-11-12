
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numList = new ArrayList<>();
        sum(numList);
    }
    public static int sum(ArrayList<Integer> numbers){
        int sum = 0;
        for (int num : numbers){
            sum += num;
        }
        return sum;
    }
}

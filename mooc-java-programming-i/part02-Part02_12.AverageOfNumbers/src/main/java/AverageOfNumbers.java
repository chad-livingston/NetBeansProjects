
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double count = 0;
        double sum = 0;
        double avg;

        while (true) {
            System.out.println("Give a number:");
            double num = Double.valueOf(scanner.nextLine());
            if (num == 0) {
                
                //System.out.println("The count is: " + count);
               // System.out.println("The sum is: " + sum);
                avg = (sum / count);
                System.out.println("Average of the numbers: " + avg);
                break;
            }
            if (num < 0 || num > 0) {
                count = count + 1;
                sum = num + sum;
            }
            
        }
    }

}


import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double count = 0;
        double sum = 0;
        double avg;

        while (true) {
            //System.out.println("Give a number:");
            double num = Double.valueOf(scanner.nextLine());
            if (num == 0 && count == 0){
                System.out.println("Cannot calculate the average");
            }
            if (num == 0) {

                //System.out.println("The count is: " + count);
                // System.out.println("The sum is: " + sum);
                avg = (sum / count);
                System.out.println(avg);
                break;
            }
            /*if (num < 0 || num > 0) {
                count = count + 1;
            }*/
            if (num > 0){
                count = count +1;
                sum = sum + num;
            }

        }
    }
}

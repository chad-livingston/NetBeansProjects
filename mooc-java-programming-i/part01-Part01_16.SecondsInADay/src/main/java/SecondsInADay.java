
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int numSecondsInDay = 60 * 60 * 24;
        System.out.println("How many days would you like to convert to seconds?");
        int numDays = Integer.valueOf(scanner.nextLine());
        System.out.println(numDays * numSecondsInDay);
    }
}

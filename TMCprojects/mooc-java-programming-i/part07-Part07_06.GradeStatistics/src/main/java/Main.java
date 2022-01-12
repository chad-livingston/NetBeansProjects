
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Points points = new Points();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            Integer num = Integer.valueOf(scanner.nextLine());
            if (num == -1){
                System.out.println(points);
                break;
            }
            if (num >= 0 && num <= 100){
                points.addPoints(num);
            }
        }
        

    }
}

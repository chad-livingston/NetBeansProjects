
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number?");
        int lastNum = Integer.valueOf(scanner.nextLine());
        int sum = 1;

        for (int i = 1; i <= lastNum; i++) {
            //System.out.println(i);
            System.out.println(sum);
            
            sum = sum * i;
            
        }
        System.out.println("Factorial:" + sum);
    }
}

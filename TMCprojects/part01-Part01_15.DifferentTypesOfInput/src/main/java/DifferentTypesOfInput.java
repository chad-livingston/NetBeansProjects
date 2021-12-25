
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String str = scan.nextLine();
        System.out.println("Give an integer:");
        int num = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double numD = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        Boolean bool = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + str);
        System.out.println("You gave the integer " + num);
        System.out.println("You gave the double " + numD);
        System.out.println("You gave the boolean " + bool);
    }
}


import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("Password?");
        String passGuess = scan.nextLine();
        String password =  "Caput Draconis";
        
        if (passGuess.equals(password)){
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    
        
    }
}

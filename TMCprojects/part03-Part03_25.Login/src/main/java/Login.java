
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] usernames = {"alex", "emma"};
        String[] password = {"sunshine", "haskell"};
        
        System.out.println("Enter username:");
        String userInput = scanner.nextLine();
        System.out.println("Enter password:");
        String passInput = scanner.nextLine();
        
        for (int i = 0; i < usernames.length; i++){
            if (userInput.equals(usernames[i]) && (passInput.equals(password[i]))){
                System.out.println("You have successfully logged in!");
            }
        }
    }
}

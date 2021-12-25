
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            String userInput = scanner.nextLine();
            
            
            if (userInput.equals("")){
                break;
            }
            String[] split = userInput.split(" ");
            System.out.println(split[0]);  
        }
    }
}

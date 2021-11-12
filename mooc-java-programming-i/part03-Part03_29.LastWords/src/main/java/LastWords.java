
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String userInput = scanner.nextLine();
            
            
            if (userInput.equals("")){
                break;
            }
            String[] split = userInput.split(" ");
            System.out.println(split[split.length - 1]);  
        }

    }
}

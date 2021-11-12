
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldestName = "";
        while (true){
            String userInput= scanner.nextLine();
            if (userInput.equals("")){
                break;
            }
            String[] split = userInput.split(",");
            
            for (int i = 0; i < split.length; i++){
                if (Integer.valueOf(split[1]) > oldest){
                    oldest = Integer.valueOf(split[1]);
                    oldestName = split[0];
                }
            }
        }
        System.out.println("Name of the oldest: " + oldestName);

    }
}

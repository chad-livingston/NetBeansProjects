
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longName = "";
        int nameLength = 0;
        int count = 0;
        int sum = 0;
        while (true){
            String userInput = scanner.nextLine();
            if (userInput.equals("")){
                break;
            }
            String[] split = userInput.split(",");
            
            for (int i = 0; i < split.length; i++){
                if (i % 2 == 0 || i == 0){
                    if(split[i].length() > nameLength){
                        nameLength = split[i].length();
                        longName = split[i];
                    }
                } else {
                    count++;
                    sum += Integer.valueOf(split[i]);
                }
            }
            
            
        }
        double avgBirthYr = (1.0 *sum) / count;
        System.out.println("Longest name: " + longName);
        System.out.println("Average of the birth years: " + avgBirthYr);

    }
}

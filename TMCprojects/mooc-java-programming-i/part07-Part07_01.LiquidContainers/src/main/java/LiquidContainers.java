
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxCapacityOfAContainer = 100;
         
        int firstContainerCurrentSize = 0;
        int secondContainerCurrentSize = 0;
        while (true) {
            
            System.out.println("First: " + firstContainerCurrentSize + "/" + maxCapacityOfAContainer);
            System.out.println("Second: " + secondContainerCurrentSize + "/" + maxCapacityOfAContainer);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
                
            }
            String[] inputParts = input.split(" ");
            String command = inputParts[0];
            int amount = Integer.valueOf(inputParts[1]);
            
            if (command.equals("add")){
                if (amount < maxCapacityOfAContainer && firstContainerCurrentSize < maxCapacityOfAContainer && amount > 0){
                    firstContainerCurrentSize += amount;
                }
                if (firstContainerCurrentSize > maxCapacityOfAContainer || amount > maxCapacityOfAContainer || amount == maxCapacityOfAContainer){
                    firstContainerCurrentSize = maxCapacityOfAContainer;
                }
                
            }
            if (command.equals("move")){
                if (amount > firstContainerCurrentSize){
                    secondContainerCurrentSize += firstContainerCurrentSize;
                    firstContainerCurrentSize = 0;
                    continue;
                }
                if (amount < maxCapacityOfAContainer && secondContainerCurrentSize < maxCapacityOfAContainer && amount > 0 && firstContainerCurrentSize > 0){
                    firstContainerCurrentSize -= amount;
                    secondContainerCurrentSize += amount;
                    if (firstContainerCurrentSize < 0){
                        firstContainerCurrentSize = 0;
                    }
                }
                if (secondContainerCurrentSize > maxCapacityOfAContainer || amount > maxCapacityOfAContainer || amount == maxCapacityOfAContainer){
                    firstContainerCurrentSize -= amount;
                    secondContainerCurrentSize = maxCapacityOfAContainer;
                    if (firstContainerCurrentSize < 0) {
                        firstContainerCurrentSize = 0;
                    }
                }
            }
            if (command.equals("remove")){
                if (secondContainerCurrentSize > 0 && amount > 0){
                    secondContainerCurrentSize -= amount;
                    if (secondContainerCurrentSize < 0){
                        secondContainerCurrentSize = 0;
                    }
                }
            }
            
            

        }
    }

}

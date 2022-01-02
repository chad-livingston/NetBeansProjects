
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();

        while (true) {
            System.out.println("First:" + container1.contains() + "/100");
            System.out.println("Second: " + container2.contains() + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] inputParts = input.split(" ");
            String command = inputParts[0];
            int amount = Integer.valueOf(inputParts[1]);
            
            if (command.equals("add")){
                container1.add(amount);
            }
            if (command.equals("move")){
                if (amount > container1.contains()){
                    container2.set(container2.contains() + container1.contains());
                    container1.set(0);
                    continue;
                }
                if (amount < 100 && container2.contains() < 100 && amount > 0 && container1.contains() > 0){
                    container1.set(container1.contains() + amount);
                    container2.set(container2.contains() - amount);
                    if (container1.contains() < 0){
                        container1.set(0);
                    }
                    
                }
                if (container2.contains() >= 100 || amount > 100){
                    container1.set(container1.contains() - amount);
                    container2.set(100);
                    if (container1.contains() < 0){
                        container1.set(0);
                    }
                }
            }
            if (command.equals("remove")){
                if (container2.contains() > 0 && amount > 0){
                    container2.remove(amount);
                    if (container2.contains() < 0){
                        container2.set(0);
                    }
                }
            }

        }
    }

}


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archive = new ArrayList<>();
        Archive newArch;
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.equals("")) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.equals("")){
                break;
            }
            newArch = new Archive(name, identifier);
            if (!(archive.contains(newArch))){
                archive.add(newArch);
            }
            
            
        }
        System.out.println("==Items==");
        for (Archive arch : archive){
            System.out.println(arch);
        }
        
    }
}

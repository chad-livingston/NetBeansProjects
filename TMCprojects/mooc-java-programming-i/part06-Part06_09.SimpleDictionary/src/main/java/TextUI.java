import java.util.Scanner;


public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary){
        this.scanner = scanner;
        this.dictionary = simpleDictionary;
    }
    public void start(){
        while (true){
            System.out.print("Command: ");
            String userInput = scanner.nextLine();
            if (userInput.equals("end")){
                System.out.println("Bye bye!");
                break;
            }
            if (userInput.equals("add")){
                System.out.print("Word: ");
                String wordInput = scanner.nextLine();
                System.out.print("Translation: ");
                String translationInput = scanner.nextLine();
                dictionary.add(wordInput, translationInput);
                continue;
            }
            if (userInput.equals("search")){
                System.out.print("To be translated: ");
                String toTranslate = scanner.nextLine();
                if (!dictionary.containsValue(toTranslate)){
                    System.out.println("Word " + toTranslate + " was not found");
                }else {
                    System.out.println("Translation: " + dictionary.translate(toTranslate));
                }

                continue;
            }
            System.out.println("Unknown command");
        }
    }
}

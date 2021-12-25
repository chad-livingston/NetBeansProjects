
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        int whereToInput = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int whereFromInput = Integer.valueOf(scanner.nextLine());
        for (int i = whereFromInput; i <= whereToInput; i++) {
            if (whereToInput < whereFromInput) {
                break;
            } else {
                System.out.println(i);
            }
        }
    }
}

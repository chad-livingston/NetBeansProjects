
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String num = scanner.nextLine();
            if (num.equals("end")) {
                break;
            }

            int convertnum = Integer.valueOf(num);
            if (convertnum == -1) {
                System.out.println(-1);
            } else {
                System.out.println(convertnum * convertnum * convertnum);
            }
        }
    }
}

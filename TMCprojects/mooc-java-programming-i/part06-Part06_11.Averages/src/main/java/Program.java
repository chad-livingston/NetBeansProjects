
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        GradeRegister register = new GradeRegister();
        Scanner scanner = new Scanner(System.in);
        
        UserInterface textUI = new UserInterface(register, scanner);
        textUI.start();

    }
}

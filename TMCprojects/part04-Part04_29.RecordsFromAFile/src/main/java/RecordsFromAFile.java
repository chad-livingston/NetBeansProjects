
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner readFile = new Scanner(Paths.get(file))) {
            while (readFile.hasNextLine()) {
                String line = readFile.nextLine();
                String[] split = line.split(",");
                String name = split[0];
                int age = Integer.valueOf(split[1]);
                if (age == 1) {
                    System.out.println(name + ", age: " + age + " year");
                } 
                if (age > 1 || age == 0) {
                    System.out.println(name + ", age: " + age + " years");
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

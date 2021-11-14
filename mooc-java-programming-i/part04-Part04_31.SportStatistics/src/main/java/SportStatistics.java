
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Filename:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String userIn = scan.nextLine();
        
        ArrayList<Teams> teamList = readTeamsFromFile(file);

        System.out.println("the list");
        for (Teams games : teamList){
            System.out.println(games);
        }

    }

    public static ArrayList<Teams> readTeamsFromFile(String file) {
        //ArrayList that stores team info
        ArrayList<Teams> teams = new ArrayList<>();
        //read the file line by line

        try (Scanner readFile = new Scanner(Paths.get(file))) {
            while (readFile.hasNextLine()) {
                String line = readFile.nextLine();
                String[] split = line.split(",");

                String name1 = split[0];
                String name2 = split[1];
                int scoreT1 = Integer.valueOf(split[2]);
                int scoreT2 = Integer.valueOf(split[3]);
                teams.add(new Teams(name1, name2, scoreT1, scoreT2));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return teams;
    }

}

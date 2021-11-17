
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        ArrayList<Matchs> games = readMatchsFromFile(file);
        System.out.println("Match Listing:");
        for (Matchs match : games){
            System.out.println(match);
        }
    }
    public static ArrayList<Matchs> readMatchsFromFile(String file){
        ArrayList<Matchs> games = new ArrayList<>();
        try (Scanner readMatchsFromFile = new Scanner(Paths.get(file))){
            while (readMatchsFromFile.hasNextLine()){
            String line = readMatchsFromFile.nextLine();
            String[] split = line.split(";");
            String homeTeam = split[0];
            String awayTeam = split[1];
            int homeTeamScore = Integer.valueOf(split[2]);
            int awayTeamScore = Integer.valueOf(split[3]);
            
            games.add(new Matchs(homeTeam, awayTeam, homeTeamScore, awayTeamScore));
            }
            
        } catch (Exception e){
            
            System.out.println("Error: " + e.getMessage());
        }
        
        return games;
    }
}

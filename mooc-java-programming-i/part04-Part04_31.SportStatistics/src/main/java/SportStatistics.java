
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File: ");
        String file = scanner.nextLine();
        System.out.println("Team: ");
        String team = scanner.nextLine();

        ArrayList<Matchs> teams = new ArrayList();

        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {

                String[] row = fileReader.nextLine().split(",");

                String teamOneName = row[0];
                String teamTwoName = row[1];
                int teamOneScore = Integer.parseInt(row[2]);
                int teamTwoScore = Integer.parseInt(row[3]);

                //Check if teams exist, create if not
                if (!ifTeamExists(teamOneName, teams)) {
                    teams.add(new Matchs(teamOneName));
                }
                if (!ifTeamExists(teamTwoName, teams)) {
                    teams.add(new Matchs(teamTwoName));
                }

                // Now add result
                if (teamOneScore > teamTwoScore) {
                    addOutcome(teamOneName, teamTwoName, teams);
                } else {
                    addOutcome(teamTwoName, teamOneName, teams);
                }

            }
        } catch (Exception e) {
            System.out.println("Error reading file.");
        }

        if (!ifTeamExists(team, teams)) {
            System.out.println("Games: 0");
            System.out.println("Wins: 0");
            System.out.println("Losses: 0");
        } else {
            for (Matchs each : teams) {
                if (each.getName().equals(team)) {
                    System.out.println("Games: " + each.getGames());
                    System.out.println("Wins: " + each.getWins());
                    System.out.println("Losses: " + each.getLosses());
                }
            }
        }
    }

    public static boolean ifTeamExists(String newTeamName, ArrayList<Matchs> teams) {
        for (Matchs each : teams) {
            if (each.getName().equals(newTeamName)) {
                return true;
            }
        }
        return false;
    }

    public static void addOutcome(String winningTeam, String losingTeam, ArrayList<Matchs> teams) {
        for (Matchs each : teams) {
            if (each.getName().equals(winningTeam)) {
                each.addWin();
            }
            if (each.getName().equals(losingTeam)) {
                each.addLoss();
            }
        }
    }
}

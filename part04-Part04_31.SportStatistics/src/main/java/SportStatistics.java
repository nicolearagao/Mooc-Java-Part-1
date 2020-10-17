
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();
        
       
        ArrayList<Game> gameInfo = readRecordsFromFile(file);
        
        int totalGames = 0;
        int wins = 0;
        int losses = 0;
      
        for(Game g : gameInfo){
         String home= g.getHomeTeam();
         String visitor = g.getVisitorTeam();
         
         if(visitor.equals(team) || home.equals(team)){
             totalGames++;
         }
     }
       
        
        for(Game g : gameInfo){
            String home = g.getHomeTeam();
            String visitor = g.getVisitorTeam();
            int homePoints = g.getHomePoints();
            int visitorPoints = g.getVisitorPoints();
            
            if(home.equals(team)){
                if(homePoints > visitorPoints){
                    wins++;
                }else {
                    losses++;
                }
            }
            
            if(visitor.equals(team)){
                if(visitorPoints > homePoints){
                    wins++;
                }else{
                    losses++;
                }
            }
        }
        System.out.println("Games: " +totalGames);
        System.out.println("Wins: " +wins);
        System.out.println("Losses: " +losses);

    }

    public static ArrayList<Game> readRecordsFromFile(String file) {
        ArrayList<Game> information = new ArrayList<>();
        try ( Scanner read = new Scanner(Paths.get(file))) {
            while (read.hasNextLine()) {
                String info = read.nextLine();

                if (info.isEmpty()) {
                    continue;
                }

                String[] parts = info.split(",");
                String homeTeam = parts[0];
                String visitorTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitorPoints = Integer.valueOf(parts[3]);

                information.add(new Game(homeTeam, visitorTeam, homePoints, visitorPoints));
            }

        } catch (Exception e) {

        }
        return information;

    }

}

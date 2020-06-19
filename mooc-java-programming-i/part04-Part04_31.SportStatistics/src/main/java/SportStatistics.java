
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String searchFor = scan.nextLine();
        
        int count = 0;
        int win = 0;
        int loss = 0;
        try (Scanner fname = new Scanner(Paths.get(file))){
            
            while(fname.hasNextLine()){
                String line = fname.nextLine();
                String[] p = line.split(",");
                
                String hTeam = p[0];
                String vTeam = p[1];
                int hPoint = Integer.valueOf(p[2]);
                int vPoint = Integer.valueOf(p[3]);
                
                if(hTeam.equals(searchFor)){
                    count++;
                    
                    if(hPoint > vPoint) {
                        win++;
                    } else {
                        loss++;
                    }
                } else if(vTeam.equals(searchFor)) {
                    count++;
                    if(vPoint > hPoint) {
                        win++;
                    } else {
                        loss++;
                    }
                }
            }
            System.out.println("Games: " + count);
            System.out.println("Wins: " + win);
            System.out.println("Losses: " + loss);

        } catch (Exception e) {
        }
    }

}

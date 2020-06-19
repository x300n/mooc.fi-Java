
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private Scanner scanner;
    private Statistics stats;
    
    

    public UserInterface(Statistics stats, Scanner scanner) {
        this.scanner = scanner;
        this.stats = stats;
    }
    
    
    
    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        
        while(true) {
                        
            int grade = Integer.valueOf(scanner.nextLine());
            
            if(grade == -1) {
                break;
            }
            
            if(grade >= 0 && grade <= 100)
                stats.addGrade(grade);                        
        }
        
        int[] grade;
        grade = stats.gradeDis();
        
        System.out.println("Point average (all): " + stats.pointAverages());
        System.out.println("Point average (passing): " + stats.pointAveragesPassing());
        System.out.println("Pass percentage: " + stats.passPercentage());
        System.out.println("Grade distribution:");
        
        for(int i = 5; i >= 0; i--) {
            String stars= "";
            
            for(int j=1 ; j <= grade[i]; j++) {
                stars += "*";
            }
            System.out.println(i +": " + stars);
        }
    }
    
}

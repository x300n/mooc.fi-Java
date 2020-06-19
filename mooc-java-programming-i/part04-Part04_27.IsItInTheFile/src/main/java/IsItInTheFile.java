
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        int x = 0;
        
        try (Scanner fname = new Scanner(Paths.get(file))){
            
            while(fname.hasNextLine()){
                String line = fname.nextLine();
                
                if(line.contains(searchedFor)) {
                    System.out.println("Found!");
                    x = 1;
                    break;
                }  
                
            }
            
            if(x == 0) {
                System.out.println("Not found.");
            }
            
           
            
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
            
        }

    }
}

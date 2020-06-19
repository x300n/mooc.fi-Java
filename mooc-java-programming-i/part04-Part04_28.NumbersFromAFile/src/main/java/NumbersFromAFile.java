
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int count = 0;
        
        try (Scanner fname = new Scanner(Paths.get(file))){
            
            while(fname.hasNextLine()){
                
                int number = Integer.valueOf(fname.nextLine());
                
                if(number >= lowerBound && number <= upperBound){
                    count++;
                }
            }
            
            System.out.println("Numbers: " + count);
            
        } catch (Exception e) {
        }
        

    }

}

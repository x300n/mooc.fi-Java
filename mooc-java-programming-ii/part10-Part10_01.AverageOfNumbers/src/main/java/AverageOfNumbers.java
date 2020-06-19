
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lst = new ArrayList<>();
        
        
        
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true) {
            
            String value = scanner.nextLine();
            if(value.equals("end")) {
                break;
            }
            
            lst.add(value);
        }
        
        double avg = lst.stream()
                .mapToInt(v -> Integer.valueOf(v))
                .average()
                .getAsDouble();
        
        System.out.println("average of the numbers: " + avg);
    }
    
    
}

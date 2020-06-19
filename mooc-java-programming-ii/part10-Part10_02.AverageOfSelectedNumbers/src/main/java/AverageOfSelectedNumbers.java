
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();        
        
        System.out.println("Input numbers, type \"end\" to stop.");
        
        while(true) {
            String s = scanner.nextLine();
            
            if(s.equals("end")) {
                break;
            }
            
            if(Integer.valueOf(s) > 0) {
                positive.add(Integer.valueOf(s));
            } else if(Integer.valueOf(s) < 0) {
                negative.add(Integer.valueOf(s));
            }
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String op = scanner.nextLine();
        
        if(op.equals("n")) {
            double avgN = negative.stream()
                    .mapToDouble(d -> Double.valueOf(d))
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + avgN);
        } else if(op.equals("p")) {
            double avgP = positive.stream()
                    .mapToDouble(d -> Double.valueOf(d))
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + avgP);
        }
    }
}

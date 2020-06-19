
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int c = 0;
        while(true) {
            
            int n = Integer.valueOf(scanner.nextLine());

            
            if(n == 0) {
                if(sum == 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                }

                break;
            }
                
            
            if(n > 0) {
                sum += n;
                c++;
            }
            
            if(sum == 0) {
                System.out.println("Cannot calculate the average");
            }   
        }
        
        System.out.println(1.0 * sum / c);

    }
}

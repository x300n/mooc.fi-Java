
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int total = 0;
        int sum = 0;
        while (true) {

            System.out.println("Give a number:");
            int num = scanner.nextInt();
            
            if ( num != 0) {
                total += 1;
                sum += num;
                continue;
            } else if (num == 0 ){
                double avg = (double)sum/total;
                System.out.println("Average of the numbers: " + avg);
                break;
            }
            
        }

    }
}


import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int total = 0;
        int sum = 0;
        while (true) {
            int num = scanner.nextInt();
  
            if ( num > 0) {
                total += 1;
                sum += num;
                continue;
            } else if (num < 0 ) {
                continue;
            }else if (total == 0 && num <= 0 ){
                System.out.println("Cannot calculate the average");
                break;
            } else if (num == 0) {
                double avg = (double)sum/total;
                System.out.println(avg);
                break;
            }
        }

    }
}

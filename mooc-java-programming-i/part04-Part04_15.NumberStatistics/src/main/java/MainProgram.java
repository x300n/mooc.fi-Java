
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        
        
        while(true) {
            System.out.println("Enter numbers:");
            int n = scanner.nextInt();
            
            if(n == -1) {
                break;
            }
            if(n % 2 == 0) {
                even.addNumber(n);
            } else {
                odd.addNumber(n);
            }
            
            statistics.addNumber(n);
        }
        
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
    }
}

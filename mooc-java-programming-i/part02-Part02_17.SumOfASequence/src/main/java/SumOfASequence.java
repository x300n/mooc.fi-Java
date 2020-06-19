
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number? ");
        int x = scanner.nextInt();
        int y = 1;
        
        int count = 0;
        while (y <= x) {
            
            count += y;
            y++;
     
        }
        
        System.out.println("The sum is " + count);

    }
}

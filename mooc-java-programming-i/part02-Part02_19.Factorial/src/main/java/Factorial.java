
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number: ");
        int x = scanner.nextInt();
        int y = 1;
        int fact = x;
        
        if ( x == 0) {
            System.out.println("Factorial: 1");
        }
        
        while (x != 1) {
            fact = fact * (x - 1);
            x--;
        }
        
        
        System.out.println("Factorial: " + fact);

    }
}

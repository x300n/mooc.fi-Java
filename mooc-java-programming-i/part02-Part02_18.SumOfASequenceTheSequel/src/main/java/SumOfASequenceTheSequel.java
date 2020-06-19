
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number? ");
        int x = scanner.nextInt();
        System.out.println("Last number? ");
        int y = scanner.nextInt();
        int count = 0;
        
        while (x <= y) {
            count += x;
            x++;
        }
        System.out.println("The sum is " + count);
    }
}

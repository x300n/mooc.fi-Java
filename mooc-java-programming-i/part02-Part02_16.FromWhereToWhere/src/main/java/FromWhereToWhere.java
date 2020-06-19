
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to? ");
        int x = scanner.nextInt();
        System.out.println("Where from? ");
        int y = scanner.nextInt();
        
        while (y <= x) {
            System.out.println(y);
            y++;
        }

        // Write your program here
    }
}

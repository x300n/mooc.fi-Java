
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Give a number:");
            int n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Unsuitable number");
                continue;
            } else if (n > 0) {
                System.out.println(Math.pow(n, 2));
                continue;
            } else if (n == 0) {
                break;
            }
        }

    }
}

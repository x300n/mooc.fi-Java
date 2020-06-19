
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        while (x <= 100) {
            System.out.println(x);
            x++;
        }

    }
}

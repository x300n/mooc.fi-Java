
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Carry on?");
        String str = scanner.nextLine();
        
        while (!str.equals("no")) {
            System.out.println("Carry on?");
            str = scanner.nextLine();
        }

    }
}


import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        
        System.out.println("Give a string:");
        String str = scan.nextLine();
        
        System.out.println("Give an integer:");
        int number = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double frac = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean value = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + str);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + frac);
        System.out.println("You gave the boolean " + value);
    }
}

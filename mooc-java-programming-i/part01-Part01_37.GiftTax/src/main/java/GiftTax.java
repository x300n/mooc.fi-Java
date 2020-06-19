
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int gift = scan.nextInt();
        double[] taxValue = new double[] {100, 1700, 4700, 22100, 142100};
        double[] taxRate = new double[] {0.08, 0.1, 0.12, 0.15, 0.17};
        
        if ( gift < 5000) {
            System.out.println("No tax!");
        } else if ( gift >= 5000 && gift < 25000) {
            System.out.println("Tax: " + (taxValue[0] + (gift - 5000)*taxRate[0]));
        } else if ( gift >= 25000 && gift < 55000 ) {
            System.out.println("Tax: " + (taxValue[1] + (gift - 25000)*taxRate[1]));
        } else if ( gift >= 55000 && gift < 200000 ) {
            System.out.println("Tax: " + (taxValue[2] + (gift - 55000)*taxRate[2]));
        } else if ( gift >= 200000 && gift < 1000000 ) {
            System.out.println("Tax: " + (taxValue[3] + (gift - 200000)*taxRate[3]));
        } else if ( gift >= 1000000 ) {
            System.out.println("Tax: " + (taxValue[4] + (gift - 1000000)*taxRate[4]));
        }
    }
}

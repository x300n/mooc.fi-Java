
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String n = scanner.nextLine();
            
            if(n.equals("end")) {
                break;
            }
            int num;
            num = Integer.valueOf(n);
            System.out.println(num*num*num);
            
        }
        
        
        
        

    }
}

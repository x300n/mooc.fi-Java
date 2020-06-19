
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int c = 0;
        
        while(true){
            String s = scanner.nextLine();
            
            if(s.equals("end")){
                break;
            }
            
            c += 1;
        }
        
        System.out.println(c);

    }
}

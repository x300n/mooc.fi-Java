
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        
        while(true) {
            
            String str = scanner.nextLine();
            
            if(str.equals("")){
                break;
            } else {
                String[] text = str.split(",");
                
                if(oldest < Integer.valueOf(text[1])) {
                    oldest = Integer.valueOf(text[1]);
                }
            }
        }
        System.out.println("Age of the oldest: " + oldest);

    }
}

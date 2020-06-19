
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String name = "";
        
        while(true) {
           
            
            String str = scanner.nextLine();
            
            if (str.equals("")){
                break;
            } else {
                String[] text = str.split(",");
                if(oldest < Integer.valueOf(text[1])) {
                    oldest = Integer.valueOf(text[1]);
                    name = text[0];
                }
                
            }
            
        }
        
        System.out.println("Name of the oldest: " + name);


    }
}

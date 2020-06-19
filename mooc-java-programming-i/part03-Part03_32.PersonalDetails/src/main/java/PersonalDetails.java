
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int sum = 0;
        int count = 0;
        
        while(true) {
           
            
            String str = scanner.nextLine();
            
            if (str.equals("")){
                break;
            } else {
                String[] text = str.split(",");
                if(text[0].length() > name.length()){
                    name = text[0];
                }
                
                sum += Integer.valueOf(text[1]);
                count += 1;
                
            }
            
        }
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + 1.0 * sum / count);


    }
}

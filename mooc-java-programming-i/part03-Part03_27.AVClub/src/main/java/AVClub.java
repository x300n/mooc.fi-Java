
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            
            String str = scanner.nextLine();
            if(str.equals("")){
                break;
            } else {
                String[] strSplitted = str.split(" ");
                for(int i = 0 ; i < strSplitted.length ; i++) {
                    if(strSplitted[i].contains("av")) {
                        System.out.println(strSplitted[i]);
                    }
                }
            }
        }
        


    }
}

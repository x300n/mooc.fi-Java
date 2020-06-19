
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            
            String str = scanner.nextLine();
            if(str.equals("")){
                break;
            } else {
                String[] strSplitted = str.split(" ");
                System.out.println(strSplitted[strSplitted.length - 1]);
            }
        }
    }
}

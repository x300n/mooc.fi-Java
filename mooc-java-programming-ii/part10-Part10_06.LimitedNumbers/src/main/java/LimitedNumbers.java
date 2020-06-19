
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lst = new ArrayList<>();
        while(true) {
            int n = Integer.valueOf(scanner.nextLine());
            
            if(n < 0) 
                break;

            lst.add(n);    
        }
        
        lst.stream()
                .filter(n -> n >= 1 && n <= 5)
                .forEach(n -> System.out.println(n));
    }
}

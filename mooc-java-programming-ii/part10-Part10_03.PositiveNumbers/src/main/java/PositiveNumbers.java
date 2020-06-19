
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> lst = new ArrayList<>();
        while(true) {
            if(scanner.nextLine().equals("end"))
                break;
            
            lst.add(Integer.valueOf(scanner.nextLine()));
        }
        
        positive(lst);

    }
    
    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> p = numbers.stream()
                .filter(n -> n > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        return p;
    }

}

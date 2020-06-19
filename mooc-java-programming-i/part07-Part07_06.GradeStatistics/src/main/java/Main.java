
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics stat = new Statistics(new ArrayList<>());
        
        UserInterface ui = new UserInterface(stat, scanner);
        ui.start();
    }
}


import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner filename = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String fn = filename.next();
        
        try (Scanner scanner = new Scanner(Paths.get(fn))) {

            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BookRecommender> br = new ArrayList<>();

        while(true) { 
            
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            
            if(name.equals("")) {
                break;
            } 
            
            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            br.add(new BookRecommender(name, age));
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println(br.size()+" books in total.");
        System.out.println("");
        System.out.println("Books:");
        
        
        Comparator<BookRecommender> comparator = Comparator
                .comparing(BookRecommender::getAge)
                .thenComparing(BookRecommender::getName);
        
        Collections.sort(br,comparator);
        
        for (BookRecommender b: br) {
            System.out.println(b);
        }
    }

}

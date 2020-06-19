
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    }
    public static List<Book> readBooks(String file){
        List<Book> lst = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                    .map(line -> line.split(","))
                    .filter(line -> line.length >= 4)
                    .map(line -> new Book(line[0], Integer.valueOf(line[1]), Integer.valueOf(line[2]), line[3]))
                    .forEach(line -> lst.add(line));
            
        } catch (IOException e) {
            System.out.println("Message: " + e);
        }
        
        return lst;
    }

}


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        ArrayList<Literacy> literacyList = new ArrayList<>();
        
        
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(l -> l.split(","))
                    .map(a -> new Literacy(a[3], Integer.valueOf(a[4]), a[2].replace("(%)","").trim(),
                            Double.parseDouble(a[5])))
                            .forEach(r -> literacyList.add(r));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
 
        literacyList.stream().sorted((p1, p2) -> {
            return Double.compare(p1.getRank(), p2.getRank());
        }).forEach(p -> System.out.println(p));
    }
    
}


import java.util.*;



public class MainProgram {

    public static void main(String[] args) {
        Map<String, String> names = new HashMap<>();
        names.put("1", "first");
        names.put("2", "second");

        System.out.println(returnSize(names));

    }

    public static int returnSize(Map m) {
        return m.size();
    }
}

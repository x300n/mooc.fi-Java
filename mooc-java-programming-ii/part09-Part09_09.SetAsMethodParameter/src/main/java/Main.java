import java.util.*;


public class Main {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("first");
        names.add("first");
        names.add("second");
        names.add("second");
        names.add("second");

        System.out.println(returnSize(names));

    }

    public static int returnSize(Set s) {
        return s.size();
    }

}

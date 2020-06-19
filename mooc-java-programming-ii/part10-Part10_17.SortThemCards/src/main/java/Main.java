
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        BySuitInValueOrder comparator = new BySuitInValueOrder();
        Card first = new Card(4, Suit.SPADE);
        Card second = new Card(2, Suit.HEART);
        System.out.println(comparator.compare(first, second));
    }
}

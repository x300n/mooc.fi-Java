
public class MainProgram {

    public static void main(String[] args) {
Money a = new Money(1, 0);
Money b = new Money(1, 50);
Money c = new Money(-3, 5);
Money d = new Money(2, 0);

System.out.println(a.lessThan(b));  
System.out.println(b.lessThan(c));  
System.out.println(c.lessThan(d));

    }
}

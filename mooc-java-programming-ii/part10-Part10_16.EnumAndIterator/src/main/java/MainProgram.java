
public class MainProgram {

    public static void main(String[] args) {
        Employees t = new Employees();
        Person h = new Person("Arto", Education.PHD);
        Person x = new Person("ff", Education.BA);
        
        t.add(h);
        t.add(x);
        t.print(Education.PHD);
        
    }
}

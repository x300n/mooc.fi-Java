import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("Title: ");
            String title = scanner.nextLine();
            
            if(title.isEmpty()){
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.print("Pages: ");
            int py = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, py));
        }
        
        System.out.println();
        
        System.out.println("What information will be printed? ");
        String info = scanner.nextLine();
        
        if(info.equals("everything")) {
            for(Book b: books){
                System.out.println(b);
            }
        } else if(info.equals("name")) {
            for(Book b: books) {
                System.out.println(b.getTitle());
            }
        }
        
        

    }
}

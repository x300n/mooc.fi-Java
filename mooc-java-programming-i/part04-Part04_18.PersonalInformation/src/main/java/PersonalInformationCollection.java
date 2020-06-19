
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("First name: ");
            String fn = scanner.nextLine();
            
            if(fn.isEmpty()){
                break;
            }
            
            System.out.print("Last name: ");
            String ln = scanner.nextLine();
            
            System.out.print("Identification number: ");
            String in = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(fn, ln, in));
            
        }
        System.out.println("");
        for(PersonalInformation p : infoCollection){
                System.out.println(p.getFirstName() + " " + p.getLastName());
            }

    }
}

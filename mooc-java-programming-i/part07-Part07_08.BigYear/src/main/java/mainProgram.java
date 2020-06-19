
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();
        
        while(true) {
            System.out.print("? ");
            String command = scan.nextLine();
            
            if(command.equals("Quit")) {
                break;
            }
            
            if(command.equals("Add")) {

                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String nameLatin = scan.nextLine();
                birds.add(new Bird(name, nameLatin));

            } else if(command.equals("Observation")) {
                System.out.print("Bird? ");
                String bird = scan.nextLine();
                int observations = 0;
                
                for(Bird b: birds) {
                    if(b.getName().equals(bird)) {
                        b.setObservations(1);
                        observations++;
                    }
                }
                
                if(observations == 0) {
                    System.out.println("Not a bird!");
                }
            }

            if(command.equals("All")) {
                for(Bird b: birds) {
                    System.out.println(b);
                }
            } else if(command.equals("One")) {
                System.out.println("Bird? ");
                String bird = scan.nextLine();
                for(Bird b: birds) {
                    if(b.getName().equals(bird)) {
                        System.out.println(b);
                    }
                }
            }
        }

    }

}


import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: "+first+"/100");
            System.out.println("Second: "+second+"/100");     
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            try {
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);


                if(command.equals("add") && amount > 0) {
                    
                    first += amount;
                    if(first > 100) {
                        first = 100;
                    }
                    
                } else if(command.equals("move") && amount > 0) {
                    int helper = first;
                    first -= amount;

                    if(first >= 0) {
                        second += amount;
                        if(second > 100) {
                            second = 100;
                        }
                    } else if (first < 0) {
                        first = 0;
                        second += helper;
                        if(second > 100 ) {
                            second = 100;
                        }             
                    }              
                } else if(command.equals("remove") && amount > 0) {
                    
                    second -= amount;
                    if(second < 0) {
                        second = 0;
                    }
                }    
            } catch (Exception e) {
                continue;
            }
        }
    }

}

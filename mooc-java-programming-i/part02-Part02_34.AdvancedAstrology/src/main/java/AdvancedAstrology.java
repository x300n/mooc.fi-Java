
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        
        int it = 0;
        
        while (it < number) {
            System.out.print("*");
            it++;
        }
        System.out.print("\n");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        
        int it = 0;
        
        while(it < number) {
            System.out.print(" ");
            it++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int it = 1;
        int i = size;
        while(it <= size) {
            printSpaces(i - 1);
            printStars(it);
            it++;
            i--;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        
        int it = 1;
        int i = height;
        int baseH = 0;
        int baseW = 3;
        
        while(it <= height*2) {
            printSpaces(i - 1);
            printStars(it);   
            it +=2;
            i--;
        }
        
        while(baseH < 2) {
            printSpaces(height - 2);
            printStars(baseW);
            baseH++;
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}

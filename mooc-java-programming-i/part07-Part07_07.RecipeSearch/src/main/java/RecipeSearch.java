
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class RecipeSearch {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();
        
        System.out.print("File to read: ");
        String location = scanner.nextLine();
        
        try (Scanner file = new Scanner(Paths.get(location))){
            
            String name = "";
            int time = 0;
            ArrayList<String> ingredients = new ArrayList<>();
            
            while(file.hasNextLine()) {
                String row = file.nextLine();

                if(!row.isEmpty() 
                        && Character.isUpperCase(row.charAt(0))) {
                    name = row;
                } else if(row.matches("^\\d+")) {
                    time = Integer.valueOf(row);
                } else if (!row.isEmpty() 
                        && Character.isLowerCase(row.charAt(0))) {
                    ingredients.add(row);
                    
                } else if (row.isEmpty()) {
                    recipes.add(new Recipe(name, time, ingredients));
                    
                    name = "";
                    time = 0;
                    ingredients = new ArrayList<>();
                }
            }
            
            recipes.add(new Recipe(name, time, ingredients));
            

        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        
        
        System.out.println("");
        System.out.println("Commands:\n" +
                           "list - lists the recipes\n" +
                           "stop - stops the program\n" +
                           "find name - searches recipes by name\n" +
                           "find cooking time - searches recipes by cooking time\n" +
                           "find ingredient - searches recipes by ingredient");
        
        while(true) {
            System.out.println("");
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            
            if(command.equals("stop"))
                break;
            
            else if (command.equals("list"))
                list(recipes);
            
            else if (command.equals("find name"))
                findName(recipes, scanner);
            
            else if (command.equals("find cooking time"))
                findCookingTime(recipes, scanner);
            
            else if (command.equals("find ingredient"))
                findIngredient(recipes, scanner);
        }
    }
    
    public static void list(ArrayList<Recipe> recipes) {
        System.out.println("");
        System.out.println("Recipes:");
        
        recipes.forEach((r) -> {
            System.out.println(r);
        });
    }
    
    public static void findName(ArrayList<Recipe> recipes, Scanner scanner) {
        System.out.print("Searched word: ");
        String searched = scanner.nextLine();
        
        System.out.println("");
        System.out.println("Recipes:");
        
        for(Recipe r: recipes) {
            if(r.getName().contains(searched)) {
                System.out.println(r);
            }
        }
    }
    
    public static void findCookingTime(ArrayList<Recipe> recipes, Scanner scanner) {
        System.out.print("Max cooking time: ");
        int maxCookingTime = Integer.valueOf(scanner.nextLine());
        
        System.out.println("");
        System.out.println("Recipes:");
        
        for(Recipe r: recipes) {
            if(r.getTime() <= maxCookingTime) {
                System.out.println(r);
            }
        }
    }
    
    public static void findIngredient(ArrayList<Recipe> recipes, Scanner scanner){
        System.out.print("Ingredient: ");
        String ingredient = scanner.nextLine();
        
        System.out.println("");
        System.out.println("Recipes:");
        
        for(Recipe r: recipes) {
            if(r.getIngredients().contains(ingredient)) {
                System.out.println(r);
            }
        }
    }
}

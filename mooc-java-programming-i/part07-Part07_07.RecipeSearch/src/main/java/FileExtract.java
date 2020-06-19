
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class FileExtract {

    public ArrayList<Recipe> createRecipesFromFile() {
        
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
        
        
        return recipes;
    }
    
}

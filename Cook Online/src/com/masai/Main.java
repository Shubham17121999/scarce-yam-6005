package com.masai;

import java.util.Arrays;

//Define classes for User, Recipe, and Admin
import java.util.*;

//Define RecipeManagementSystem class


//Main class to run the application
public class Main {
	public static void main(String[] args) {
	 RecipeManagementSystem rms = new RecipeManagementSystem();
     Scanner scanner = new Scanner(System.in);
     
     // Example usage
     System.out.println("Welcome to the Recipe Management System!");
     System.out.print("Do you want to register as a user or admin? (user/admin): ");
     String userType = scanner.nextLine().toLowerCase();
     
     if (userType.equals("user")) {
         System.out.print("Enter a username: ");
         String username = scanner.nextLine();
         System.out.print("Enter a password: ");
         String password = scanner.nextLine();
         rms.registerUser(username, password);
         System.out.println("User registered successfully!");
     } else if (userType.equals("admin")) {
         System.out.print("Enter an admin username: ");
         String adminUsername = scanner.nextLine();
         System.out.print("Enter an admin password: ");
         String adminPassword = scanner.nextLine();
         rms.registerUser(adminUsername, adminPassword);
         System.out.println("Admin registered successfully!");
     } else {
         System.out.println("Invalid choice.");
         return;
     }
     
     System.out.print("Enter your username: ");
     String loginUsername = scanner.nextLine();
     System.out.print("Enter your password: ");
     String loginPassword = scanner.nextLine();
     rms.loginUser(loginUsername, loginPassword);
     
     while (true) {
         System.out.println("\nSelect an option:");
         System.out.println("1. View recipes");
         System.out.println("2. Like a recipe");
         if (rms.getLoggedInUser() instanceof Admin) {
             System.out.println("3. Add a recipe");
         }
         System.out.println("4. Exit");
         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();
         scanner.nextLine(); // Consume the newline
         
         switch (choice) {
             case 1:
                 rms.viewRecipes();
                 break;
             case 2:
                 System.out.print("Enter the name of the recipe you want to like: ");
                 String recipeToLike = scanner.nextLine();
                 rms.likeRecipe(recipeToLike);
                 break;
             case 3:
                 if (rms.getLoggedInUser() instanceof Admin) {
                     System.out.print("Enter the name of the recipe: ");
                     String recipeName = scanner.nextLine();
                     System.out.print("Enter ingredients (comma-separated): ");
                     String ingredientInput = scanner.nextLine();
                     List<String> ingredients = Arrays.asList(ingredientInput.split(","));
                     System.out.print("Enter preparation steps (one per line, type 'done' to finish):\n");
                     List<String> preparationSteps = new ArrayList<>();
                     while (true) {
                         String step = scanner.nextLine();
                         if (step.equalsIgnoreCase("done")) {
                             break;
                         }
                         preparationSteps.add(step);
                     }
                     rms.addRecipe(recipeName, ingredients, preparationSteps);
                 } else {
                     System.out.println("Only admins can add recipes.");
                 }
                 break;
             case 4:
                 System.out.println("Thank you for using the Recipe Management System!");
                 return;
             default:
                 System.out.println("Invalid choice.");
         }
     }
 }
}

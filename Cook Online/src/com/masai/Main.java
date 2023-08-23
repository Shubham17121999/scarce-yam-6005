package com.masai;


//Define classes for User, Recipe, and Admin


//Define RecipeManagementSystem class


//Main class to run the application
public class Main {
 public static void main(String[] args) {
     RecipeManagementSystem rms = new RecipeManagementSystem();
     
     // Example usage
     rms.registerUser("customer1", "password");
     rms.loginUser("customer1", "password");
     rms.viewRecipes();
     
     // Add more interactions based on the requirements
 }
}

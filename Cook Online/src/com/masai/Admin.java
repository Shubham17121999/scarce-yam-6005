package com.masai;

import java.util.List;

class Admin extends User {
    public Admin(String username, String password) {
        super(username, password);
    }
    
    // Additional methods specific to admin functionality
    
    public void generateReports(List<Recipe> recipes) {
        System.out.println("\nGenerating Reports:");
        System.out.println("Recipe Popularity Report:");
        for (Recipe recipe : recipes) {
            System.out.println("- Recipe: " + recipe.getName());
            System.out.println("  Likes: " + recipe.getLikes());
        }
        System.out.println("\nEnd of Report");
    }
}


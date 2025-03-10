package org.example.tracker.utils;

public class Print {

    public void printMenu() {
        System.out.println("\n=== Fitness Tracker Menu ===");
        System.out.println("1. Log Workout");
        System.out.println("2. View Workouts");
        System.out.println("3. Get AI Recommendations");
        System.out.println("4. Edit Profile");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    public boolean invalidInput(){
        System.out.print("Please enter a valid option: ");
        return false;
    }

}

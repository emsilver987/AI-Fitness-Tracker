package org.example.tracker.utils;
import org.example.tracker.utils.MenuSelection;

import java.awt.*;


public class Print {
    public static void printMainMenu() {
        MenuSelection menuSelection = new MenuSelection();
        System.out.println("\n=== Fitness Tracker Menu ===");
        System.out.println("1. Workouts");
        System.out.println("2. Profile");
        System.out.println("3. AI Recommendations");
        System.out.println("10. Exit");
        System.out.print("Choose an option: ");
        menuSelection.mainMenuSelection();
    }

    public static void printWorkouts(){
        MenuSelection menuSelection = new MenuSelection();
        System.out.println("\n=== Workouts ===");
        System.out.println("1. Log Workout");
        System.out.println("2. View Workouts");
        menuSelection.workoutMenuSelection();
    }

    public static void printProfile(){
        MenuSelection menuSelection = new MenuSelection();
        System.out.println("\n=== Profile ===");
        System.out.println("1. Create Profile");
        System.out.println("2. View Profile");
        System.out.println("3. List Add Profile(Admin)");//Should not be seen from user perspective
        menuSelection.profileMenuSelection();
    }

    public static boolean invalidInput(){
        System.out.print("Please enter a valid option: ");
        return false;
    }

}

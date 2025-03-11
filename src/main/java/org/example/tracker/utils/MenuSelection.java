package org.example.tracker.utils;
import org.example.tracker.ai.ReviewWorkout;
import org.example.tracker.services.UserProfile;
import org.example.tracker.services.WorkoutService;

import java.util.Scanner;
import static org.example.tracker.utils.Print.*;

public class MenuSelection {

    public void mainMenuSelection() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> printWorkouts();
            case 2 -> printProfile();
            case 3 -> ReviewWorkout.getRecommendations();
            default -> invalidInput();
        }
    }
    public void workoutMenuSelection() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        WorkoutService workoutService = new WorkoutService();
        switch (choice) {
            case 1 -> workoutService.logWorkout();
            case 2 -> workoutService.viewWorkouts();
            default -> invalidInput();
        }
    }
    public void profileMenuSelection() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> UserProfile.createUserProfile();
            case 2 -> {
                System.out.println("Enter Username: ");
                String username = scanner.nextLine();
                UserProfile.loadUserProfile(username);
            }
            case 3 -> UserProfile.listAllUserProfiles();
            default -> invalidInput();
        }
    }
}

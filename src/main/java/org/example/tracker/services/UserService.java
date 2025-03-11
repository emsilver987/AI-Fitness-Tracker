package org.example.tracker.services;
import org.example.tracker.models.User;

import java.util.Scanner;

import static org.example.tracker.Main.workoutHistory;

public class UserService {

    public void createProfile() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Your Current Body Weight: ");
        double bodyWeight = scanner.nextDouble();

        System.out.print("Enter Your Current Body Fat Percentage: ");
        double bodyfatpercentage = scanner.nextDouble();

        System.out.print("Enter Workout Goal(Strength, Size, or Endurance): ");
        String goal = scanner.nextLine();
        scanner.nextLine();

        User user = new User(name, bodyWeight, bodyfatpercentage, workoutHistory, goal);
        System.out.println("Profile Created successfully!");
        UserProfile.saveUserProfile(user);
    }
}

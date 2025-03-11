package org.example.tracker.services;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import org.example.tracker.models.User;
import org.example.tracker.utils.Adapter;

import java.lang.reflect.Type;
import java.util.Scanner;

import static org.example.tracker.Main.workoutHistory;

public class UserProfile {
    private static final String PROFILE_DIR = "profiles";

    static {
        File directory = new File(PROFILE_DIR);
        if (!directory.exists()) {
            directory.mkdir();
        }
    }

    public static User createUserProfile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your profile name: ");
        String name = scanner.nextLine();

        if (checkUserProfileExists(name)){
            User user = loadUserProfile(name);
            return user;
        }

        System.out.print("Enter your body weight (in lbs): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your body fat percentage: ");
        double bodyFat = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter your goal (Strength/Hypertrophy/Fat Loss): ");
        String goal = scanner.nextLine();

        User user = new User(name, weight, bodyFat, workoutHistory, goal);
        UserProfile.saveUserProfile(user);
        return user;
    }

    public static void saveUserProfile(User user) {
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(java.time.LocalDate.class, new Adapter())
                .setPrettyPrinting()
                .create();

        String filename = PROFILE_DIR + "/user_" + user.getName() + ".json";

        try (FileWriter writer = new FileWriter(filename)) {
            gson.toJson(user, writer);
            System.out.println("User profile for " + user.getName() + " saved successfully!");
        } catch (IOException e) {
            System.out.println("Failed to save user profile.");
            e.printStackTrace();
        }
    }

    public static User loadUserProfile(String username) {
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(java.time.LocalDate.class, new Adapter())
                .create();

        String filename = PROFILE_DIR + "/user_" + username + ".json";

        if (!checkUserProfileExists(username)) {
            System.out.println("User profile for " + username + " not found.");
            return null;
        }

        try (FileReader reader = new FileReader(filename)) {
            Type userType = new TypeToken<User>() {}.getType();
            return gson.fromJson(reader, userType);
        } catch (IOException e) {
            System.out.println("Failed to load user profile.");
            e.printStackTrace();
            return null;
        }
    }

    public static boolean checkUserProfileExists(String username) {
        String filename = PROFILE_DIR + "/user_" + username + ".json";
        return Files.exists(Paths.get(filename));
    }

    public static void listAllUserProfiles() {
        File directory = new File(PROFILE_DIR);
        File[] files = directory.listFiles((dir, name) -> name.endsWith(".json"));

        if (files == null || files.length == 0) {
            System.out.println("No saved user profiles found.");
        } else {
            System.out.println("Saved User Profiles:");
            for (File file : files) {
                System.out.println("- " + file.getName().replace("user_", "").replace(".json", ""));
            }
        }
    }
}

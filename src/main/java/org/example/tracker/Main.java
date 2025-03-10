package org.example.tracker;
import org.example.tracker.ai.reviewWorkout;
import org.example.tracker.models.Workout;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Workout> workoutHistory = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> logWorkout();
                case 2 -> viewWorkouts();
                case 3 -> reviewWorkout.getRecommendations();
                case 4 -> running = false;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
        System.out.println("Thanks for using the Fitness Tracker!");
    }

    private static void printMenu() {
        System.out.println("\n=== Fitness Tracker Menu ===");
        System.out.println("1. Log Workout");
        System.out.println("2. View Workouts");
        System.out.println("3. Get AI Recommendations");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }

    private static void logWorkout() {
        System.out.print("Enter workout type (Push/Pull/Legs/Cardio): ");
        String type = scanner.nextLine();

        System.out.print("Enter workout name (e.g., Bench Press): ");
        String name = scanner.nextLine();

        System.out.print("Enter sets: ");
        int sets = scanner.nextInt();

        System.out.print("Enter reps: ");
        int reps = scanner.nextInt();

        System.out.print("Enter weight (0 if cardio): ");
        double weight = scanner.nextDouble();
        scanner.nextLine();

        Workout workout = new Workout(type, name, sets, reps, weight, LocalDate.now());
        workoutHistory.add(workout);

        System.out.println("Workout logged successfully!");
    }

    private static void viewWorkouts() {
        if (workoutHistory.isEmpty()) {
            System.out.println("No workouts logged yet!");
        } else {
            System.out.println("\n--- Workout History ---");
            for (Workout workout : workoutHistory) {
                System.out.println(workout);
            }
        }
    }
}

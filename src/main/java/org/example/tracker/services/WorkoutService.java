package org.example.tracker.services;
import java.util.Scanner;
import java.time.LocalDate;
import static org.example.tracker.Main.workoutHistory;

public class WorkoutService {
    Scanner scanner = new Scanner(System.in);

    public void logWorkout() {
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

        org.example.tracker.models.Workout workout = new org.example.tracker.models.Workout(type, name, sets, reps, weight, LocalDate.now());
        workoutHistory.add(workout);

        System.out.println("Workout logged successfully!");
    }

    public void viewWorkouts() {
        if (workoutHistory.isEmpty()) {
            System.out.println("No workouts logged yet!");
        } else {
            System.out.println("\n--- Workout History ---");
            for (org.example.tracker.models.Workout workout : workoutHistory) {
                System.out.println(workout);
            }
        }
    }
}

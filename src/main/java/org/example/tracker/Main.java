package org.example.tracker;
import org.example.tracker.ai.ReviewWorkout;
import org.example.tracker.models.Workout;
import org.example.tracker.services.UserService;
import org.example.tracker.services.WorkoutService;
import java.util.ArrayList;
import java.util.Scanner;
import org.example.tracker.utils.Print;

public class Main {
    public static ArrayList<Workout> workoutHistory = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            Print print = new Print();
            WorkoutService workout = new WorkoutService();
            UserService user = new UserService();

            print.printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> workout.logWorkout();
                case 2 -> workout.viewWorkouts();
                case 3 -> ReviewWorkout.getRecommendations();
                case 4 -> user.createProfile();
                case 5 -> running = false;
                default -> print.invalidInput();
            }
        }
        System.out.println("Thanks for using the Fitness Tracker!");
    }
}

package org.example.tracker;
import org.example.tracker.models.Workout;
import java.util.ArrayList;
import java.util.Scanner;
import static org.example.tracker.utils.Print.printMainMenu;

public class Main {
    public static ArrayList<Workout> workoutHistory = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            printMainMenu();
        }
        System.out.println("Thanks for using the Fitness Tracker!");
    }
}

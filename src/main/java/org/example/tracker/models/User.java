package org.example.tracker.models;
import java.time.LocalDate;
import java.util.ArrayList;

public class User {
    String name;
    double bodyWeight;
    double bodyfatPercentage;
    ArrayList<Workout> workoutHistory;
    String goal;

    public User(String name, double bodyWeight, double bodyfatPercentage, ArrayList<Workout> workoutHistory, String goal) {
        this.name = name;
        this.bodyWeight = bodyWeight;
        this.bodyfatPercentage = bodyfatPercentage;
        this.workoutHistory = workoutHistory;
        this.goal = goal;
    }

    public String getName() {return name;}
    public double getBodyWeight() {return bodyWeight;}
    public double getBodyfatPercentage() {return bodyfatPercentage;}
    public ArrayList<Workout> getWorkoutHistory() {return workoutHistory;}
    public String getGoal() {return goal;}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== User Profile ===\n");
        sb.append("Name: ").append(name).append("\n");
        sb.append("Body Weight: ").append(bodyWeight).append(" lbs\n");
        sb.append("Body Fat Percentage: ").append(bodyfatPercentage).append(" %\n");
        sb.append("Goal: ").append(goal).append("\n");
        sb.append("\n--- Workout History ---\n");

        if (workoutHistory.isEmpty()) {
            sb.append("No workouts logged yet!\n");
        } else {
            for (Workout workout : workoutHistory) {
                sb.append(workout.toString()).append("\n");
            }
        }
        return sb.toString();
    }

}

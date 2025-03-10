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
        return "404 Not yet Implemented";
    }
}

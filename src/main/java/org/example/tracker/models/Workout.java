package org.example.tracker.models;

import java.time.LocalDate;

public class Workout {
    // Fields
    private String type;         // e.g., Push, Pull, Legs, Cardio
    private String name;         // e.g., Bench Press, Deadlift
    private int sets;            // Number of sets
    private int reps;            // Number of reps per set
    private double weight;       // Weight used (0 if cardio)
    private LocalDate date;      // Date of the workout

    public Workout(String type, String name, int sets, int reps, double weight, LocalDate date) {
        this.type = type;
        this.name = name;
        this.sets = sets;
        this.reps = reps;
        this.weight = weight;
        this.date = date;
    }

    public String getType() { return type; }
    public String getName() { return name; }
    public int getSets() { return sets; }
    public int getReps() { return reps; }
    public double getWeight() { return weight; }
    public LocalDate getDate() { return date; }

    public double getVolume() {
        return sets * reps * weight;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %d sets of %d reps at %.2f lbs on %s",
                type, name, sets, reps, weight, date.toString());
    }
}

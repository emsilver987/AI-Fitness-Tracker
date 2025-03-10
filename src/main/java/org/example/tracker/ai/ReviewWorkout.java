package org.example.tracker.ai;
import org.example.tracker.models.Workout;
import static org.example.tracker.Main.workoutHistory;

public class ReviewWorkout {

    public static void getRecommendations() {
        if (workoutHistory.isEmpty()) {
            System.out.println("No workouts logged yet! Log some workouts to get recommendations.");
            return;
        }

        System.out.println("\n--- AI Recommendations ---");
        double totalVolume = workoutHistory.stream().mapToDouble(Workout::getVolume).sum();
        double avgVolume = totalVolume / workoutHistory.size();

        if (avgVolume < 1000) {
            System.out.println("Recommendation: Increase your volume for strength gains!");
        } else if (avgVolume < 2000) {
            System.out.println("Recommendation: Maintain your current routine for steady progress.");
        } else {
            System.out.println("Recommendation: Consider incorporating more rest days.");
        }
    }
}

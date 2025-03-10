package org.example.tracker.utils;
import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.tracker.models.User;
import java.io.FileReader;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class UserProfile {

    public static void saveUserProfile(User user) {
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(java.time.LocalDate.class, new Adapter())
                .setPrettyPrinting()
                .create();

        try (FileWriter writer = new FileWriter("user_profile.json")) {
            gson.toJson(user, writer);
            System.out.println("User profile saved successfully!");
        } catch (IOException e) {
            System.out.println("Failed to save user profile.");
            e.printStackTrace();
        }
    }
    public static User loadUserProfile() {
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(java.time.LocalDate.class, new Adapter())
                .create();

        try (FileReader reader = new FileReader("user_profile.json")) {
            Type userType = new TypeToken<User>() {}.getType();
            return gson.fromJson(reader, userType);
        } catch (IOException e) {
            System.out.println("No saved user profile found. Please create a new one.");
            return null;
        }
    }
}

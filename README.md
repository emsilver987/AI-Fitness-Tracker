# 🏋️‍♂️ AI Fitness Tracker
A Java-based console application that helps you log workouts, track progress, and get AI-powered recommendations based on your fitness goals. This project demonstrates the use of object-oriented programming (OOP), JSON data handling with Gson, and a simple AI algorithm for personalized workout suggestions.

---

## 📋 **Table of Contents**
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Future Improvements](#future-improvements)
- [Contributing](#contributing)
- [License](#license)

---

## 🚀 **Features**
- **Log Workouts:** Save details like type, sets, reps, weight, and date.  
- **Track Progress:** View all logged workouts and calculate volume.  
- **AI Recommendations:** Get workout suggestions based on your history and goals.  
- **Profile Management:** Save and load user profiles with body weight, body fat, and goals.  
- **Persistent Storage:** Uses JSON to save user profiles and workout history.

---

## 🛠 **Installation**

### 1. **Clone the Repository**
```bash
git clone [https://github.com/yourusername/AIFitnessTracker.git]
cd AIFitnessTracker
```

### 2. **Install Maven Dependencies**
Make sure you have Maven installed. Run:
```bash
mvn clean install
```

### 3. **Run the Application**
You can run the main class using:
```bash
mvn exec:java -Dexec.mainClass="org.example.tracker.Main"
```

---

## 🖥 **Usage**

### **Main Menu Options:**
1. **Log Workout:** Enter details like type, sets, reps, and weight.  
2. **View Workouts:** Display all logged workouts.  
3. **Get AI Recommendations:** Suggests adjustments based on logged workouts.  
4. **Edit Profile:** Change your weight, body fat, or goals.  
5. **Exit:** Save data and exit the program.  

---

### **Example Interaction:**
```
=== Fitness Tracker Menu ===
1. Log Workout
2. View Workouts
3. Get AI Recommendations
4. Edit Profile
5. Exit
Choose an option: 1

Enter workout type (Push/Pull/Legs/Cardio): Push
Enter workout name: Bench Press
Enter sets: 4
Enter reps: 8
Enter weight: 185
Workout logged successfully!
```

---

## 📂 **Project Structure**
```
AIFitnessTracker/
├── src/main/java/org/example/tracker/
│   ├── models/            # Data models (User, Workout)
│   ├── services/          # Business logic (UserService, WorkoutService)
│   ├── utils/             # Utility classes (UserProfile, LocalDateAdapter)
│   ├── Main.java          # Main entry point
├── user_profile.json      # Saved user profile data
├── pom.xml                # Maven configuration
└── README.md              # Documentation
```

---

## 🛠 **Technologies Used**
- **Java 17**: Core programming language.  
- **Maven**: Dependency management and build tool.  
- **Gson**: For JSON serialization and deserialization.  
- **OOP Principles**: Classes, inheritance, encapsulation.  
- **AI Techniques**: Simple rule-based AI for workout recommendations.

---

## 📈 **Future Improvements**
- **GUI:** Create a JavaFX-based graphical interface.  
- **Advanced AI:** Implement decision trees or linear regression for smarter recommendations.  
- **Database:** Replace JSON with SQLite for better data management.  
- **API Integration:** Fetch workout routines from external APIs.

---

## 🤝 **Contributing**
Contributions are welcome! Please follow these steps:
1. **Fork the repository.**  
2. **Create a new branch:** `git checkout -b feature-branch`  
3. **Commit your changes:** `git commit -m 'Add new feature'`  
4. **Push to the branch:** `git push origin feature-branch`  
5. **Create a Pull Request.**

---

## 📜 **License**
This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for more information.

---

## 💬 **Contact**
For questions or feedback, open an issue or reach out at emsilver987@gmail.com or esilvert@purdue.edu

---

Enjoy tracking your fitness journey with **AI Fitness Tracker**! 💪🤖

package com.fittracker;
public class FitTrackApp {
    public static void main(String[] args) {

        // User creation
        UserProfile user = new UserProfile("Naman",21,70,1000);
        user.printProfile();

        // Workouts
        Workout cardio = new CardioWorkout(40);
        Workout strength = new StrengthWorkout(50);

        // Polymorphism in calorie calculation
        cardio.startWorkout();
        cardio.calculateCalories(user.getWeight());
        cardio.stopWorkout();

        strength.startWorkout();
        strength.calculateCalories(user.getWeight());
        strength.stopWorkout();

        double totalCaloriesBurned=cardio.getCaloriesBurned()+strength.getCaloriesBurned();

        // Operators for progress tracking
        double remainingCalories =user.getDailyCalorieGoal()-totalCaloriesBurned;

        System.out.println("\n--- Daily Progress of Naman ---");
        System.out.println("Amount of Caloried burned - " + totalCaloriesBurned);
        System.out.println("The remaining calories to target - " + remainingCalories);
    }
}

package com.fittracker;
class CardioWorkout extends Workout {

    CardioWorkout(int duration) {
        super("Cardio",duration);
    }

    @Override
    void calculateCalories(double weight) {
        // simple formula
        caloriesBurned=duration*weight*0.08;
    }
}

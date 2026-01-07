package com.fittracker;
class StrengthWorkout extends Workout {

    StrengthWorkout(int duration) {
        super("Strength",duration);
    }

    @Override
    void calculateCalories(double weight) {
        caloriesBurned=duration*weight*0.05;
    }
}

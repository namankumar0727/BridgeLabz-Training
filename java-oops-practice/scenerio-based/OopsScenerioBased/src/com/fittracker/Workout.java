package com.fittracker;
abstract class Workout implements ITrackable {

	// in minutes
    protected String type;
    protected int duration;          
    protected double caloriesBurned;
    private boolean active;          

    //Constructors
    Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    @Override
    public void startWorkout() {
        active = true;
        System.out.println(type + " workout started.");
    }

    @Override
    public void stopWorkout() {
        active = false;
        System.out.println(type + " workout stopped.");
    }

    // Polymorphic method
    abstract void calculateCalories(double weight);

    public double getCaloriesBurned() {
        return caloriesBurned;
    }
}

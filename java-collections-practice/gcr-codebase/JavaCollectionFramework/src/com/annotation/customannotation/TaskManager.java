package com.annotation.customannotation;
public class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Rahul")
    public void completeTask() {
        System.out.println("Task completed");
    }
}

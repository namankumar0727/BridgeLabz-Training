package com.trafficmanager;
public class VehicleQueue {
    private String[] queue;
    private int front, rear, size;

    public VehicleQueue(int capacity) {
        queue = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(String vehicle) {
        if (size == queue.length) {
            System.out.println("Queue Overflow!");
            return;
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = vehicle;
        size++;
        System.out.println("Vehicle " + vehicle + " added to queue.");
    }

    public String dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow!");
            return null;
        }
        String vehicle = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return vehicle;
    }
}

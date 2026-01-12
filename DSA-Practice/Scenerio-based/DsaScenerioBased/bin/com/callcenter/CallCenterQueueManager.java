package com.callcenter;
import java.util.*;

public class CallCenterQueueManager {

    private Queue<Customer> normalQueue;
    private PriorityQueue<Customer> vipQueue;
    private HashMap<String, Integer> callCountMap;

    public CallCenterQueueManager() {
        normalQueue = new LinkedList<>();

        vipQueue = new PriorityQueue<>(
                (c1, c2) -> c1.getName().compareTo(c2.getName())
        );

        callCountMap = new HashMap<>();
    }

    public void addCall(Customer customer) {
        if (customer.isVIP()) {
            vipQueue.offer(customer);
        } else {
            normalQueue.offer(customer);
        }

        callCountMap.put(
                customer.getCustomerId(),
                callCountMap.getOrDefault(customer.getCustomerId(), 0) + 1
        );

        System.out.println("Call added successfully.");
    }

    public void handleNextCall() {
        Customer nextCustomer;

        if (!vipQueue.isEmpty()) {
            nextCustomer = vipQueue.poll();
        } else if (!normalQueue.isEmpty()) {
            nextCustomer = normalQueue.poll();
        } else {
            System.out.println("No calls in queue.");
            return;
        }

        System.out.println("Handling call from: " + nextCustomer);
    }

    public void displayCallCounts() {
        System.out.println("\nCall Count This Month:");
        for (Map.Entry<String, Integer> entry : callCountMap.entrySet()) {
            System.out.println("Customer ID: " + entry.getKey() +
                               " → Calls: " + entry.getValue());
        }
    }
}

package com.eventmanager;
class EventManager {

    // Quick Sort entry method
    public static void quickSort(Ticket[] tickets, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(tickets, low, high);

            quickSort(tickets, low, pivotIndex - 1);
            quickSort(tickets, pivotIndex + 1, high);
        }
    }

    // Partition logic
    private static int partition(Ticket[] tickets, int low, int high) {
        double pivot = tickets[high].getPrice(); // pivot = last element
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (tickets[j].getPrice() <= pivot) {
                i++;
                swap(tickets, i, j);
            }
        }

        swap(tickets, i + 1, high);
        return i + 1;
    }

    // Swap two tickets
    private static void swap(Ticket[] tickets, int i, int j) {
        Ticket temp = tickets[i];
        tickets[i] = tickets[j];
        tickets[j] = temp;
    }

    public static void displayTickets(Ticket[] tickets) {
        for (Ticket t : tickets) {
            t.display();
        }
    }
}

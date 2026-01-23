package com.tailorshop;
class InsertionSortOrders {

    public static void sortOrders(Order[] orders, int n) {

        for (int i = 1; i < n; i++) {
            Order key = orders[i];
            int j = i - 1;

            // Sort by deadline (ascending)
            while (j >= 0 && orders[j].deadline > key.deadline) {
                orders[j + 1] = orders[j];
                j--;
            }

            orders[j + 1] = key;
        }
    }
}

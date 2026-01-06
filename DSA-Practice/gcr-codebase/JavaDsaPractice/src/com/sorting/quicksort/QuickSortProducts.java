package com.sorting.quicksort;
class QuickSortProducts {

    // Main Quick Sort method
    public static void quickSort(double[] prices, int low, int high) {

        if (low < high) {
            // Partition the array
            int pivotIndex = partition(prices, low, high);

            // Sort left subarray
            quickSort(prices, low, pivotIndex - 1);

            // Sort right subarray
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    // Partition method (pivot = last element)
    private static int partition(double[] prices, int low, int high) {

        double pivot = prices[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] <= pivot) {
                i++;

                // Swap prices[i] and prices[j]
                double temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // Place pivot at correct position
        double temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }
}

package com.sorting.heapsort;
class HeapSortSalaries {

    // Main Heap Sort method
    public static void heapSort(int[] salaries) {

        int n = salaries.length;

        // 1️⃣ Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // 2️⃣ Extract elements one by one
        for (int i = n - 1; i > 0; i--) {

            // Swap root with last element
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Heapify reduced heap
            heapify(salaries, i, 0);
        }
    }

    // Heapify subtree rooted at index i
    private static void heapify(int[] salaries, int heapSize, int i) {

        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check left child
        if (left < heapSize && salaries[left] > salaries[largest]) {
            largest = left;
        }

        // Check right child
        if (right < heapSize && salaries[right] > salaries[largest]) {
            largest = right;
        }

        // If root is not largest
        if (largest != i) {
            int temp = salaries[i];
            salaries[i] = salaries[largest];
            salaries[largest] = temp;

            // Recursively heapify affected subtree
            heapify(salaries, heapSize, largest);
        }
    }
}

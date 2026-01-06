package com.sorting.bubblesort;
class BubbleSortStudents {

    // Bubble Sort method
    public static void bubbleSort(int[] marks) {

        int n = marks.length;
        boolean swapped;

        // Traverse the array
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {

                    // Swap
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swap occurred, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}

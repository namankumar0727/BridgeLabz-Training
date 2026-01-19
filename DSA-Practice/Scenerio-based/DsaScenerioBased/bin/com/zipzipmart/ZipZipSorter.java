package com.zipzipmart;
class ZipZipSorter {

    // Merge Sort entry point
    public static void mergeSort(SalesRecord[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    // Merge two sorted halves
    private static void merge(
            SalesRecord[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        SalesRecord[] L = new SalesRecord[n1];
        SalesRecord[] R = new SalesRecord[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Stable comparison: date → amount
        while (i < n1 && j < n2) {
            if (L[i].getDate().isBefore(R[j].getDate()) ||
               (L[i].getDate().isEqual(R[j].getDate()) &&
                L[i].getAmount() <= R[j].getAmount())) {

                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    public static void display(SalesRecord[] records) {
        for (SalesRecord r : records) {
            r.display();
        }
    }
}

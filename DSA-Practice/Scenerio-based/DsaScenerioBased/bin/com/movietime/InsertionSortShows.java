package com.movietime;
class InsertionSortShows {

    public static void sortShows(ShowTime[] shows, int n) {
        for (int i = 1; i < n; i++) {
            ShowTime key = shows[i];
            int j = i - 1;

            while (j >= 0 && shows[j].time > key.time) {
                shows[j + 1] = shows[j];
                j--;
            }
            shows[j + 1] = key;
        }
    }
}

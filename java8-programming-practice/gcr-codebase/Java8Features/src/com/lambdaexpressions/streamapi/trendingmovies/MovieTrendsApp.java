package com.streamapi.trendingmovies;
import java.util.*;
import java.util.stream.*;

public class MovieTrendsApp {
    public static void main(String[] args) {

        List<Movie> movies = List.of(
            new Movie("Movie A", 8.9, 2024),
            new Movie("Movie B", 9.1, 2023),
            new Movie("Movie C", 8.5, 2024),
            new Movie("Movie D", 9.3, 2022),
            new Movie("Movie E", 8.8, 2023),
            new Movie("Movie F", 9.0, 2024),
            new Movie("Movie G", 8.2, 2021),
            new Movie("Movie H", 9.4, 2023)
        );

        List<Movie> top5TrendingMovies =
                movies.stream()
                      .filter(movie -> movie.getReleaseYear() >= 2022).sorted(
                          Comparator.comparingDouble(Movie::getRating).reversed())
                      .limit(5)
                      .collect(Collectors.toList());

        top5TrendingMovies.forEach(System.out::println);
    }
}


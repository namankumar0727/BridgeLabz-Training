package com.songvault;

import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class SongVault<T extends Media> {

    // Regex patterns
    private static final Pattern TITLE =
            Pattern.compile("Title:\\s*(.+)");
    private static final Pattern ARTIST =
            Pattern.compile("Artist:\\s*(.+)");
    private static final Pattern DURATION =
            Pattern.compile("Duration:\\s*(.+)");
    private static final Pattern GENRE =
            Pattern.compile("Genre:\\s*(.+)");

    public static void main(String[] args) {

        File folder = new File("answers");

        List<Song> songList = new ArrayList<>();
        Map<String, List<Song>> genreMap = new HashMap<>();
        Set<String> uniqueArtists = new HashSet<>();

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Songs folder not found");
            return;
        }

        for (File file : folder.listFiles()) {

            if (!file.getName().endsWith(".txt")) continue;

            String title = null;
            String artist = null;
            String duration = null;
            String genre = null;

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {

                String line;
                while ((line = br.readLine()) != null) {

                    Matcher m;

                    m = TITLE.matcher(line);
                    if (m.matches()) {
                        title = m.group(1);
                        continue;
                    }

                    m = ARTIST.matcher(line);
                    if (m.matches()) {
                        artist = m.group(1);
                        continue;
                    }

                    m = DURATION.matcher(line);
                    if (m.matches()) {
                        duration = m.group(1);
                        continue;
                    }

                    m = GENRE.matcher(line);
                    if (m.matches()) {
                        genre = m.group(1);
                    }
                }

                //  VALIDATION (prevents null songs)
                if (title == null || artist == null || duration == null || genre == null) {
                    System.out.println("Skipping invalid song file: " + file.getName());
                    continue;
                }

                Song song = new Song(title, artist, duration, genre);
                songList.add(song);

                genreMap
                        .computeIfAbsent(genre, k -> new ArrayList<>())
                        .add(song);

                uniqueArtists.add(artist);

            } catch (Exception e) {
                System.out.println("Error reading file: " + file.getName());
            }
        }

        // 🔹 All Songs
        System.out.println("\nAll Songs:");
        songList.forEach(System.out::println);

        // 🔹 Songs by Genre
        System.out.println("\nSongs by Genre:");
        genreMap.forEach((g, s) ->
                System.out.println(g + " → " + s.size() + " songs"));

        // 🔹 Unique Artists
        System.out.println("\nUnique Artists:");
        uniqueArtists.forEach(System.out::println);

        // 🔹 Streams: Filter + Sort (NULL-SAFE)
        System.out.println("\nRock Songs (sorted by title):");
        songList.stream()
                .filter(s -> "Rock".equalsIgnoreCase(s.getGenre()))
                .sorted(Comparator.comparing(Song::getTitle))
                .forEach(System.out::println);
    }
}

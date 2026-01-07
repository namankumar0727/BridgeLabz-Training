package com.inputstreamreader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class InputStreamReaderToFile {

    public static void main(String[] args) {

        String filePath = "output.txt"; // file to write input

        try {
            // Read input from console (byte → character stream)
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            // Write to file
            FileWriter fw = new FileWriter(filePath, true); // append mode

            System.out.println("Enter text (type 'exit' to stop):");

            String line;

            // Read input until user types "exit"
            while (true) {
                line = br.readLine();

                if (line.equalsIgnoreCase("exit")) {
                    break;
                }

                fw.write(line + System.lineSeparator());
            }

            // Close resources
            fw.close();
            br.close();

            System.out.println("Input successfully written to file.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

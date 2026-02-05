package com.resumeanalyzer;

import java.io.*;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ResumeReader {

    public static String readResume(File file) throws Exception {

        if (file.getName().endsWith(".txt")) {
            return readTxt(file);
        } else if (file.getName().endsWith(".pdf")) {
            return readPdf(file);
        } else {
            throw new UnsupportedOperationException("Unsupported file format");
        }
    }

    private static String readTxt(File file) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append(" ");
            }
        }
        return content.toString();
    }

   
    private static String readPdf(File file) throws IOException {
        try (PDDocument document = Loader.loadPDF(file)) {
            PDFTextStripper stripper = new PDFTextStripper();
            return stripper.getText(document);
        }
    }
}

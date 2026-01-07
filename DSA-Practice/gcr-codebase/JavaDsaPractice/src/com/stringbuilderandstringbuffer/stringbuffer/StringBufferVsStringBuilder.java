package com.stringbuilderandstringbuffer.stringbuffer;
public class StringBufferVsStringBuilder {

    public static void main(String[] args) {

        int iterations = 1_000_000;
        String text = "hello";

        // -------- StringBuffer Test --------
        StringBuffer stringBuffer = new StringBuffer();
        long startBuffer = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(text);
        }

        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;

        // -------- StringBuilder Test --------
        StringBuilder stringBuilder = new StringBuilder();
        long startBuilder = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }

        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;

        // -------- Results --------
        System.out.println("Time taken by StringBuffer   : " + bufferTime + " ns");
        System.out.println("Time taken by StringBuilder  : " + builderTime + " ns");

        if (builderTime < bufferTime) {
            System.out.println("StringBuilder is faster than StringBuffer.");
        } else {
            System.out.println("StringBuffer is faster than StringBuilder.");
        }
    }
}

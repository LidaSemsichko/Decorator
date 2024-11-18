package com.example.lab10;

public class TimedDocument extends DocumentDecorator{
    public TimedDocument(Document document) {
        super(document);
    }
    public String parse(String path) {
        long start = System.nanoTime();

        String result = super.parse(path);

        long end = System.nanoTime();
        long duration = end - start;
        double inSeconds = duration * 1_000_000_000;
        System.out.println("Time taken in seconds: " + inSeconds);
        return result;
    }
}

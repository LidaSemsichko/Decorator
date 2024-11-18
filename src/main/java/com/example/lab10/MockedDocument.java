package com.example.lab10;

public class MockedDocument extends DocumentDecorator {
    public MockedDocument() {
        super(null);
    }
    public String parse(String path) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        return "Parse";
    }
}
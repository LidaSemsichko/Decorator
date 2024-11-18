package com.example.lab10;

public class DocumentDecorator implements Document{
    private Document document;

    public DocumentDecorator(Document document){
        this.document = document;
    }
    @Override
    public String parse(String path) {
        // Add additional functional
        return document.parse(path);
    }
}

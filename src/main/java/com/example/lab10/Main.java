package com.example.lab10;

public class Main {
    public static void main(String[] args) {
        Document document2 = new SmartDocument();
        document2 = new CachedDocument(document2);
        System.out.println(document2.parse("abc10")); 
        System.out.println(document2.parse("abc11"));
    }
}

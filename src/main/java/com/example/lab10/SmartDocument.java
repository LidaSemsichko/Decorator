package com.example.lab10;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class SmartDocument implements Document {
    public String parse(String filePath) {
        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath("C:\\Users\\user\\Desktop\\OOP\\Decorator");
        tesseract.setLanguage("eng");
        try {
            return tesseract.doOCR(new File(filePath));
        } catch (TesseractException e) {
            e.printStackTrace();
            return "";
        }
    }
}
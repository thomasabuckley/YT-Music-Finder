package com.thomasbuckley.extractor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Writer {
	private String filename;
	
	public Writer(String filename) {
		this.filename = filename;
	}
	
	public Writer() {
		this.filename = "Music Links";
	}
	
    public void writeToFile(ArrayList<String> listOfLinks) {
        FileWriter writer;
        try {
            writer = new FileWriter(filename);
            listOfLinks.forEach(a -> {
                try {
                    String temp = "\r\n - Link: " + a;
                    //display to console
                    System.out.println(temp);
                    //save to file
                    writer.write(temp);
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            });
            writer.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}

package com.cartorgon.j11f;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FilesPoCMain {	
	public static final void main(final String[] args) {		
			writeToFile();
			readFromFile();
	}
	
	private static final void writeToFile() {
	  try {
      System.out.println("Writing string in file...");      
      Files.writeString(Paths.get("C:/", "tmp", "outData.txt"), "This is another\n", StandardOpenOption.APPEND);
      System.out.println("Done !!");
    } catch (final Exception excp) {
      excp.printStackTrace();
    }
	}
	
	private static final void readFromFile() {
    try {
      System.out.println("Reading string from file...");
      System.out.println(Files.readString(Paths.get("C:/", "tmp", "outData.txt")));
      System.out.println("Done !!");
    } catch (final Exception excp) {
      excp.printStackTrace();
    }
  }
}
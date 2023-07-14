package com.cartorgon.j11f;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FilesPoCMain {	
	public static final void main(final String[] args) {		
		try {
			System.out.println("Writing string in file...");			
			Files.writeString(Paths.get("C:/", "tmp", "outData.txt"), "This is another\n", StandardOpenOption.APPEND);
			System.out.println("Done !!");
		} catch (final Exception excp) {
			excp.printStackTrace();
		}		
	}
}
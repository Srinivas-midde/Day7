package com.capgemini.files.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NoOfLines {
	

	public static int count(File file) throws IOException {
		int lines=0;
		
		BufferedReader reader = new BufferedReader(new FileReader(file));
		
		while(reader.readLine() != null)
			lines++;
		reader.close();
		
		return lines;
	}
	
	

}

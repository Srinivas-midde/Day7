package com.capgemini.files.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GrepPattern {
	public static String findString(File file, String word) throws FileNotFoundException, IOException {
		int lineCount=0;
		String lines=null;
		int flag=0;
		try (BufferedReader reader = new BufferedReader( new FileReader(file))) {
			String s=null;
			while ((s = reader.readLine()) != null) {
				lineCount++;
				if(s.contains(word)) 
				{
					lines = "Line number " + lineCount +" : " + s;
					System.out.println(lines);
					lines = lines + "\n"; 
					flag = 1;
				}
			}
			if(flag == 1)
				return lines;
			else
				return "String not found";
	}

}
}


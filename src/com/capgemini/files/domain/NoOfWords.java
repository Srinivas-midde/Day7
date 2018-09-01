package com.capgemini.files.domain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NoOfWords {

	public static int count(File file) {
//		int count = 0;
//		try (BufferedReader reader = new BufferedReader( new FileReader(file))) {
//
//			String s=null;
//			while ((s = reader.readLine()) != null) {
//				int ct=1;
//				for(int i = 0; i < s.length();i++)
//				{
//					if(s.charAt(i)==' ')
//					{
//						ct++;
//					}
//				}
//				count = count + ct;
//			}
//			return count;
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		int count = 0;

		try (Scanner sc = new Scanner(new FileInputStream(file))) {
			while (sc.hasNext()) {
				sc.next();
				count++;
			}
			return count;
		} catch (FileNotFoundException e) {
					System.out.println("FileNotFoundException");
		}
		

		return -1;
	}
}


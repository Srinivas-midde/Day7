package com.capgemini.files.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.files.domain.GrepPattern;

class GrepTest {

	@Test
	void testPatternSearch() throws FileNotFoundException, IOException {
		File file = new File(
				"C:\\Users\\smiddeku\\Documents\\workspace-sts-3.9.5.RELEASE\\sample.txt");

		assertEquals("String not found", GrepPattern.findString(file,"import"));
	}

	
	@Test
	void testPatternSearch1() throws FileNotFoundException, IOException {
		File file = new File(
				"C:\\Myfolder\\Date.java");

		assertEquals("Line number 2 : import java.util.Scanner;\n", GrepPattern.findString(file,"import"));
	}

}

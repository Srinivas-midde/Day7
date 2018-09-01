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


}

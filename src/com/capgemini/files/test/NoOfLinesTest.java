package com.capgemini.files.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.files.domain.NoOfLines;

class NoOfLinesTest {

	@Test
	void testLines() throws IOException {
		
		File file =new File("C:\\Myfolder\\date.java") ;
		 assertEquals(56, NoOfLines.count(file));
	}

}

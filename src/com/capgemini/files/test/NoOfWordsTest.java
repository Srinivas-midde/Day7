package com.capgemini.files.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
//import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.files.domain.NoOfWords;

class NoOfWordsTest {

	@Test
	void test()   {
		
		File file = new File("C:\\Users\\smiddeku\\Documents\\workspace-sts-3.9.5.RELEASE\\sample.txt");
		
		assertEquals(4, NoOfWords.count(file));
		
	}

}

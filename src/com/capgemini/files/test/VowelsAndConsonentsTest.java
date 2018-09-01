package com.capgemini.files.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.files.domain.VowelsAndConsonants;

class VowelsAndConsonentsTest {

	@Test
	void testVowelsAndConsonants() throws IOException {
		File file = new File("C:\\\\Users\\\\smiddeku\\\\Documents\\\\workspace-sts-3.9.5.RELEASE\\\\sample.txt");

		assertEquals("Number of vowels = 19\nNumber of consonants = 19",
				VowelsAndConsonants.findVowelAndConsonant(file));
	}

}

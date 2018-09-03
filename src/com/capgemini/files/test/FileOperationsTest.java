package com.capgemini.files.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.files.domain.FileOperations;

class FileOperationsTest {

	@Test
	void testReverse() {
		assertEquals(true, FileOperations.reverse("C:\\Users\\smiddeku\\Documents\\workspace-sts-3.9.5.RELEASE\\Sample.txt","C:\\Users\\smiddeku\\Documents\\workspace-sts-3.9.5.RELEASE\\ReverseOutput.txt"));
		assertEquals(true, FileOperations.convert("C:\\Users\\smiddeku\\Documents\\workspace-sts-3.9.5.RELEASE\\Sample.txt","C:\\Users\\smiddeku\\Documents\\workspace-sts-3.9.5.RELEASE\\ConvertOutput.txt"));
		assertEquals(true, FileOperations.compare("C:\\Users\\smiddeku\\Documents\\workspace-sts-3.9.5.RELEASE\\Sample.txt","C:\\Users\\smiddeku\\Documents\\workspace-sts-3.9.5.RELEASE\\WordCountTest.txt"));
	}

}

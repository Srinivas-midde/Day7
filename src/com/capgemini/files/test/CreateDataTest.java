package com.capgemini.files.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.files.domain.CreateData;

class CreateDataTest {

	@Test
	void testBinaryInteger() {
		File file = new File("C:\\\\Users\\\\smiddeku\\\\Documents\\\\workspace-sts-3.9.5.RELEASE\\\\CreateData.dat");
		assertEquals(1,CreateData.write(file));
	}
}

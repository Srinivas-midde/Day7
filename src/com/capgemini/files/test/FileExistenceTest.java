package com.capgemini.files.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileExistenceTest {

	@Test
	void testExistence() {
		
		File file = new File("C:\\Myfolder");
		assertEquals(true, file.exists());
		assertEquals(false, file.isFile());
	}

}

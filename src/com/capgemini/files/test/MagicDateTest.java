package com.capgemini.files.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.capgemini.files.domain.MagicDate;

class MagicDateTest {

	@Test
	void testCheckIfMagicDate() {
		MagicDate date1=new MagicDate() ;
		assertEquals("magic",date1.checkIfMagicDate(LocalDate.of(30,6,5))) ;
	}

}

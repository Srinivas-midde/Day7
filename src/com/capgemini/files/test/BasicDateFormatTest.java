package com.capgemini.files.test;

import static org.junit.jupiter.api.Assertions.*;

//import java.sql.Date;

import org.junit.jupiter.api.Test;

import com.capgemini.files.domain.BasicDateFormat;

class BasicDateFormatTest {

	@Test
	void testbasic() {

		//Date d1 = new Date(19970602);
		String date="02061997";
		assertEquals("02/06/1997", BasicDateFormat.convert1(date));
		
	}
	
	@Test
	void testformat() {

		//Date d1 = new Date(19970602);
		String date="02061997";
		assertEquals("02 jun,1997", BasicDateFormat.convert2(date));
		
	}

}

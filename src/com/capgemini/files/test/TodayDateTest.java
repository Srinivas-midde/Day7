package com.capgemini.files.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.files.domain.TodayDate;

class TodayDateTest {

	@Test
	void testformat() {

		assertEquals("SATURDAY,SEPTEMBER 1,2018", TodayDate.format());
	}

}

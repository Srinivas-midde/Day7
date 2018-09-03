package com.capgemini.files.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.time.LocalDate;

//import org.junit.experimental.theories.internal.Assignments;
import org.junit.jupiter.api.Test;

import com.capgemini.files.domain.Assignment;

class AssignmentTest {

	@Test
	void testAssignments() {
		File f1= new File("C:\\Users\\smiddeku\\Desktop\\file1.txt");
		File f2= new File("C:\\Users\\smiddeku\\Desktop\\file2.txt");
		File f3= new File("C:\\Users\\smiddeku\\Desktop\\file3.txt");
		File f4= new File("C:\\Users\\smiddeku\\Desktop\\file4.txt");
		
		boolean x= f1.isFile() && f2.isFile() && f3.isFile() && f4.isFile();
		assertEquals(true, x );
		
		
		Assignment assign1 = new Assignment(f1, LocalDate.of(2014, 9, 25));
		Assignment assign2 = new Assignment(f2, LocalDate.of(2014, 9, 24));
		Assignment assign3 = new Assignment(f3, LocalDate.of(2014, 9, 18));
		Assignment assign4 = new Assignment(f4, LocalDate.of(2014, 9, 20));
		assertEquals(true, Assignment.add(assign1));
		assertEquals(true, Assignment.add(assign2));
		assertEquals(true, Assignment.add(assign3));
		assertEquals(true, Assignment.add(assign4));
//		assign.show();
		assertEquals(true, Assignment.remove(assign1));
		
		Assignment.show();
		System.out.println("\n");
		
		
		assertEquals(assign3, Assignment.search());
		
		
		
	}

}
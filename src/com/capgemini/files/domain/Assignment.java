package com.capgemini.files.domain;

import java.io.File;
import java.time.LocalDate;
import java.util.LinkedList;

//import org.junit.experimental.theories.internal.assignment;

public class Assignment {

		private File file;
		private LocalDate lastDate;

		private static LinkedList<Assignment> linked = new LinkedList<>();

		public Assignment() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Assignment(File file, LocalDate dueDate) {
			super();
			this.file = file;
			this.lastDate = dueDate;
		}
		
//		if(!file.isFile())
//			return -1;
		
//		try {
//			if(file.isFile())
//				continue;
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}

		public static boolean add(Assignment assign) {
			if (linked.add(assign)) {
				return true;
			}
			return false;
		}

		public static boolean remove(Assignment assign) {
			if (linked.remove(assign)) {
				return true;
			}
			return false;

		}

		public static void show() {
			for (Assignment assignment : linked) {
				System.out.println(assignment);
			}
		}

		public static Assignment search() {
			int result = 0;
			Assignment early = linked.getFirst();
			//System.out.println(result);

			for (Assignment assignment : linked) {
				if (early.equals(assignment)) {
					continue;
				}
				result = assignment.lastDate.compareTo(early.lastDate);
				//System.out.println(result);
				if (result < 0) {
					early = assignment;
				}
			}
			System.out.println(early);
			return early;
		}

		@Override
		public String toString() {
			return "assignment [assignmentName=" + file + ", dueDate=" + lastDate + "]";
		}

	}

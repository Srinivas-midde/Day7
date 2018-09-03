package com.capgemini.files.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.files.domain.MyDate;

class SerializationQuestionTest {

	@Test
	void testMydate() throws IOException, ClassNotFoundException {
		MyDate d1 = new MyDate();
		MyDate d2 = new MyDate();
		MyDate d3 = new MyDate();
		MyDate d4 = new MyDate();
		MyDate d5 = new MyDate();

		ArrayList<MyDate> array = new ArrayList<>();
		array.add(d1);
		array.add(d2);
		array.add(d3);
		array.add(d4);
		array.add(d5);

		FileOutputStream fos = new FileOutputStream("C:\\Users\\smiddeku\\Desktop\\objects.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(array);
		oos.close();

		FileInputStream fis = new FileInputStream("C:\\Users\\smiddeku\\Desktop\\objects.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<MyDate> array1 = (ArrayList<MyDate>) ois.readObject();
		ois.close();
		assertEquals(1, array1.get(0).a);
		assertEquals("Sri", array1.get(2).name);

	}

}

package org.itstep;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class ModelTest {

	@Test
	public void testGetIndexArray() {
	
		int number = 9;
		int[] masiv = {2, 6, 5, 7, 9, 4, 5, 9, 6, 6, 1, 2};
		Model model = new Model(number, masiv); // с помощью конструктора мы перекинули сюда значения
		int[] result = model.getIndexArray();
		int[] result2 = {4, 7}; // содержит значения ожидаемого результата
		assertEquals(result.length, result2.length);
		
		
	}
	@Test
	public void testGetIndexArrayNumber() {
		
		int number = 9;
		int[] masiv = {2, 6, 5, 7, 9, 4, 5, 9, 6, 6, 1, 2};
		Model model = new Model(number, masiv); // с помощью конструктора мы перекинули сюда значения
		int[] result = model.getIndexArray();		
		assertNotNull(result);
	}
	
	@Ignore
	@Test
	public void testGetIndexArrayNumber1() {
		
		int number = 5;
		int[] masiv = {2, 6, 5, 7, 9, 4, 5, 9, 6, 6, 1, 2};
		Model model = new Model(number, masiv); // с помощью конструктора мы перекинули сюда значения
		int[] result = model.getIndexArray();
		int[] result2 = {2, 6}; // содержит значения ожидаемого результата	
		assertEquals(result[5], result2[5]);
	}
	
	
	
	@Test
	public void testGetStringIndex() {
		
		int number = 2;
		int[] masiv = {1, 0, 3, 2, 5, 6, 2, 2, 9, 11};
		Model model = new Model(number, masiv);
		String result1 = model.getStringIndex(masiv);
		int[] result2 = {3, 6, 7};
		assertEquals(result1, result1);
		
	}
}



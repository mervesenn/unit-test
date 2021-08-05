package test;

import static org.junit.Assert.*;

import org.junit.Test;

class StringoperationTest {

	public class StringoperationTest {

		Stringoperation testInstance=new Stringoperation();
		
		@Test
		public void testfirsttwocharacters_Stringone() {
			String s="w";
			String expect="w";
			String actual=testInstance.firsttwocharacters(s);
			assertEquals(expect,actual);
		}
		
		@Test
		public void testfirsttwocharacters_normal() {
			assertEquals("me",testInstance.firsttwocharacters("merve"));
	}

}

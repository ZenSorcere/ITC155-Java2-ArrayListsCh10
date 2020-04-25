//*******************************************************************
// Double List - Ch10, Ex4, p718 - JUnit Test Cases
//  
// Write a method doubleList that takes an ArrayList of Strings as a
// parameter and that replaces every string with two of that string.
// For example, if the list stores the values {"how", "are", "you?"}
// before the method is called, it should store the values
// {"how", "how", "are", "are", "you?", "you?"} after the method
// finishes executing.
// 
// By: Michael Gilson
// Date: 4/24/2020
//*******************************************************************

// imports needed for running Junit tests and ArrayList construction
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;



class doubleListTest {

	@Test
	void test() {
		
	// Create two test ArrayLists--list1 has elements, while list2 is empty.
		ArrayList<String> list1 = new ArrayList<>();
		list1.addAll(Arrays.asList("even", "odd", "ev", "o"));
		
		ArrayList<String> list2 = new ArrayList<>();
		
	// Call the doubleItems method for each test ArrayList.
		doubleList.doubleItems(list1);
		doubleList.doubleItems(list2);
		
	// Tests to verify size of test ArrayLists after passing method to them are correct. 	
		assertEquals(8, list1.size());
		assertEquals(0, list2.size());
		
	// Tests to verify output of methods are correct by calling the toString method.
		assertEquals("[even, even, odd, odd, ev, ev, o, o]", list1.toString());
	    assertEquals("[]", list2.toString());
	}



	

}

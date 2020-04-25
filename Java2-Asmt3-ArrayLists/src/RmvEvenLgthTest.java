//*******************************************************************
// Remove Even Length - Ch10, Ex3, p718 - Junit Test Cases
//  
// Write a method removeEvenLength that takes an ArrayList of Strings
// as a parameter and that removes all of the strings of even length
// from the list.
// 
// By: Michael Gilson
// Date: 4/24/2020
//*******************************************************************

// imports needed for running Junit tests and ArrayList construction
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

class RmvEvenLgthTest {

	@Test
	void test() {
		
	// Create two test ArrayLists--list1 has elements, while list2 is empty.
		ArrayList<String> list1 = new ArrayList<>();
		list1.addAll(Arrays.asList("even", "odd", "ev", "o"));
		
		ArrayList<String> list2 = new ArrayList<>();
		
		
	// Call the removeEvenLengths method for each test ArrayList.
		RmvEvenLgth.removeEvenLength(list1);
		RmvEvenLgth.removeEvenLength(list2);
		
	// Tests to verify size of test ArrayLists after passing method to them are correct.	
		assertEquals(2, list1.size());
		assertEquals(0, list2.size());
		
	// Tests to verify output of methods are correct by calling the toString method.	
		assertEquals("[odd, o]", list1.toString());
		assertEquals("[]", list2.toString());
		
		
		
		
		
		
	}

}

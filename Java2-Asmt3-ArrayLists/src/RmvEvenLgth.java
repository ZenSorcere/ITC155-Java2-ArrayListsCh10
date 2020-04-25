//*******************************************************************
// Remove Even Length - Ch10, Ex3, p718
//  
// Write a method removeEvenLength that takes an ArrayList of Strings
// as a parameter and that removes all of the strings of even length
// from the list.
// 
// By: Michael Gilson
// Date: 4/22/2020
//*******************************************************************

// Imports necessary libraries for ArrayList uses.
import java.util.ArrayList;
import java.util.Arrays;


public class RmvEvenLgth {

	public static void main(String[] args) {
		
	// Set up Test ArrayLists with varying length strings
		ArrayList<String> list1 = new ArrayList<>();
		list1.addAll(Arrays.asList("even", "odd", "ev", "o"));
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.addAll(Arrays.asList("Did", "you", "solve", "it", "or", "what?"));
		
		ArrayList<String> list3 = new ArrayList<>();
		list3.addAll(Arrays.asList("This", "is", "a", "test"));
		
		ArrayList<String> list4 = new ArrayList<>();
		
	// Runs removeEvenLength method on Test ArrayLists
		removeEvenLength(list1);
		removeEvenLength(list2);
		removeEvenLength(list3);
		removeEvenLength(list4);	
	} // End main
	
	// Method that takes an ArrayList as a parameter
	public static void removeEvenLength (ArrayList<String> list) {
		
	// A for loop to run through the ArrayList starting from the end of the
	//   ArrayList. Checks length of each string, and if it's even, removes
	//   it from the ArrayList (which is why we started at the end).
		for (int i = list.size()-1; i >=0; i--) {
			String s = list.get(i);
			if (s.length() % 2 == 0) {
				list.remove(i);
			} // End if statement
		} // End for loop
		
	// Displays final ArrayList result
		System.out.println(list);
	} // End Method
} // End class
	
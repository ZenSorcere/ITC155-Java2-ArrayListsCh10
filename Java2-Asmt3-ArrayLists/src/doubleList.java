//*******************************************************************
// Double List - Ch10, Ex4, p718
//  
// Write a method doubleList that takes an ArrayList of Strings as a
// parameter and that replaces every string with two of that string.
// For example, if the list stores the values {"how", "are", "you?"}
// before the method is called, it should store the values
// {"how", "how", "are", "are", "you?", "you?"} after the method
// finishes executing.
// 
// By: Michael Gilson
// Date: 4/22/2020
//*******************************************************************

// Imports necessary libraries for ArrayList uses.
import java.util.ArrayList;
import java.util.Arrays;

public class doubleList {

	public static void main(String[] args) {
		
	// Set up Test ArrayLists with varying length strings
		ArrayList<String> list1 = new ArrayList<>();
		list1.addAll(Arrays.asList("even", "odd", "ev", "o"));
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.addAll(Arrays.asList("Did", "you", "solve", "it", "or", "what?"));
		
		ArrayList<String> list3 = new ArrayList<>();
		list3.addAll(Arrays.asList("This", "is", "a", "test"));
		
		ArrayList<String> list4 = new ArrayList<>();
		
	// Runs doubleItems method on Test ArrayLists
		doubleItems(list1);
		doubleItems(list2);
		doubleItems(list3);
		doubleItems(list4);
	} // End main
	
	// A for loop to run through the ArrayList starting from the end of the
	//   ArrayList. Creates a String copy of each item, and adds it the same
	//   index, doubling each item. the value if i iterates down to the next
	//   index, ensuring each item is doubled.
	public static void doubleItems (ArrayList<String> list) {
		for (int i = list.size() -1; i >=0; i--) {
			String s = list.get(i);
			list.add(i, s);
		} // End for loop
	// Displays final ArrayList result
		System.out.println(list);
		
	} // End method
} // End class
	
	

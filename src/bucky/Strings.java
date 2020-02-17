package bucky;

 
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Stack;

public class Strings {

	public static void main(String[] args) {
		/////////////////////////////////
		//startsAndEndsWith();
		//System.out.println(recursion(5));
		
		//arrayList();
		//linkedLists();
		//stringConvert();
		//collectionMethods();
		//addAllMethod();
		//stacks();
		//hashSet();
		//////////////////////////////////
		
		/*Clock me = new Clock(1,2);
		System.out.println(me.toMilitary());  */
		
		//Files
		FileCreate file = new FileCreate();
        
		file.openFile();
		file.readFile();
		file.closeFile();
		
		//Exception Handling
		//ExceptionHandling ex = new ExceptionHandling();
	
	}
	
	 
	private static void startsAndEndsWith() {
		String[] str = {"chunk", "funk", "baconator", "furry"};
		//The starts with method selects strings that starts with a particular letter
		for(String s: str) {
			if(s.startsWith("fu"))
			System.out.println(s + " starts with 'fu'");
		}
		
		
		
		//The starts with method selects strings that starts with a particular letter
		for(String s: str) {
			if(s.endsWith("unk"))
			System.out.println(s + " ends with 'unk'");
		}
	}
	
	/* concat() concatenates strings
	 * trim() removes all white spaces
	 * replace() replaces a part of a string with another string
	 * indexOf() finds the index, a letter of a string is at
	 * 
	 * */

	private static long recursion(long i) {
		//Recursion is when a method calls itself. Factorial is the example of this
		if(i <= 1) {
			return 1;
		}else 
		return i * recursion(i-1);
		
	}
	
	private static void arrayList(){
		//the arraylist is used to store a group of data types, just like the array but unlike the array its dynamic.
		
		String[] has = {"peter", "john", "wisdom", "kodjovi"};
		
		List<String> array = new ArrayList<String>();
		
		for(String w: has) {
			array.add(w);
		}
		
		String[] haste = {"peter", "kodjovi"};
		List<String> arra = new ArrayList<String>();
		
		for(String v: haste) {
			arra.add(v);
			
		}
		System.out.println("Demonstrating methods of ArrayList Class\n");
	//Checking to see if data was assigned correctly
		for(int i = 0; i < array.size(); i++) {
		 System.out.printf("%s ", array.get(i));
		}
		
		
		editlist(array, arra);
		System.out.println();
		
		for(int i = 0; i < array.size(); i++) {
			 System.out.printf("%s ", array.get(i));
			}
		System.out.println();
			
		 
		
	}
	
	//Creating a method editlist to iterate through the first array list. If it comes across a word also present
	// in the arra list it will remove it from the array list.
	private static void editlist(Collection<String> l1, Collection<String> l2) {
		Iterator<String> it = l1.iterator();
		while(it.hasNext()) {
			if(l2.contains(it.next())) {
				it.remove();
			}
		}
	}
 
	private static void linkedLists() {
		//for this project, a list of items are going to be combined, removed and reversed.
		String[] things = { "men", "red", "bed", "yes", "coco", "getLost"};
		List<String> item = new LinkedList<String>();
		
		//Creating an enhanced for loop to assign values of the array to the list item
		for(String b: things) {
			item.add(b);
		}
		
		String[] things2 = { "great", "man", "of", "the", "emperor" };
		List<String> item2 = new LinkedList<String>();
		
		for(String d: things2) {
			item2.add(d);
		}
		System.out.println("Demonstrating Properties of LinkedList\n");
		
		printMe(item);
		merge(item, item2);
		printMe(item);
		removeItems(item, 2, 5);
		reverseItems(item);
	}
	
	//linkedlists methods called
	//printing out items from the item list
	private static void printMe(List<String> l) {
		
		for(String c: l) {
			System.out.printf("%s ", c);
			
		}
		
	}
	
	//adding items from item2 to item
	private static void merge(List<String> l1, List<String> l2) {
		
		
		/*for(String s: l2) {
			l1.add(s);
		}*/
		//the addAll() method can also be used
		
	}
	
	
	//removing items for item from the index 2 t0 4
	public static void removeItems(List<String> l, int k, int j) {
		l.subList(k, j).clear();
	}
	
	//printing out the reverse of items in item
	private static void reverseItems(List<String> l) {
		System.out.println();
	    ListIterator<String> list = l.listIterator(l.size());
	    while(list.hasPrevious()){
		System.out.printf("%s ", list.previous());
	 }
	   System.out.println();
	}
	
	private static void stringConvert() {
		// Some methods are available for arrays and others for list so sometimes there is the need to convert these
		// into the other. Here is how.
		String[] objects = { "Kwesi", "John", "Peter", "Paul"};
		//Converting to list 
		LinkedList<String> list = new LinkedList<String>(Arrays.asList(objects));
		// This will also work; LinkedList<String> list = Arrays.asList(objects);
		
		list.add("Logan");
		list.addFirst("Judas");
		
		//Converting back to an array
		objects = list.toArray(new String[list.size()]);
		
		//Printing out array of String
		System.out.println("Demonstrating Array Conversion\n");
		for(String j: objects) {
		
		System.out.printf("%s ", j);
		}
		System.out.println();
	}
	
	
	//Methods can be used on the collection class, eg, Collection.sort() episode 9
	
	private static void collectionMethods() {
		//Creating a list of items
		List<Character> charA = new LinkedList<Character>();
		charA.add('c');
		charA.add('m');
		charA.add('k');
		
		// using the sort() method
		System.out.println("List:");
		output(charA);
		Collections.sort(charA);
		
		System.out.println("Sorted List: ");
		output(charA);
		
		//reversing items of charA
		Collections.reverse(charA);
		System.out.println("Reversed List: ");
		output(charA);
		
		//Copying items from another list to a new list
		Character[] cat = new Character[charA.size()];
		List<Character> charB = Arrays.asList(cat);
		Collections.copy(charB, charA);
		
		System.out.println("Copied List:");
		output(charB);
		
		//filling an array with a letter
		Collections.fill(charA, 'x');
		System.out.println("Filled List: ");
		output(charA);
  
	}
	
	//Creating the output method. To print out all results
	private static void output(List<Character> list) {
		for(Character v: list)
			System.out.printf("%s ", v);
		System.out.println();
	}
	
	private static void addAllMethod() {
		//addAll() from the collection class is used to copy items of a string into a list
		String[] gotham = { "petre", "salt", "onion"};
		ArrayList<String> gotpork = new ArrayList<String>();
		
		Collections.addAll(gotpork, gotham);
		
		// Printing out copied list
		for(String pi: gotpork)
			System.out.printf("%s ", pi);
	}
	
	
	private static void stacks() {
		//the stack class
		Stack<String> stack = new Stack<String>();
		//adding method in the stack class
		stack.push("myrad");
		printStack(stack);
		stack.push("myra");
		printStack(stack);
		stack.push("myrrh");
		printStack(stack);
		
		//Removing objects
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		
	}
	
	private static void printStack(Stack<String> s) {
		if(s.isEmpty())
		     System.out.println("Stack is now empty!");
		else
			System.out.printf("%s TOP\n", s);
	}
	
	
	private static void hashSet() {
		//hashset is used for eliminating duplicate items in a array
		String[] kite = {"rhombus", "parallelogram", "square", "box", "square"};
		List<String> kit = Arrays.asList(kite);
		//Printing out items of the list
		System.out.printf("%s ", kit);
		System.out.println();
		Set<String> set = new HashSet<String>(kit);
		//Printing out items of the set
		System.out.printf("%s ", set);
	
	}
	
	
	/*NOTES
	 * 
	 *Collections.disjoint() compares two lists and returns true if there is an item in common
	 *Collections.frequency() checks a string against a list, if there is an occurrence it prints the number of time 
	 *it occurs
	 * 
	 * Using the PriorityQueue class; name.offer()[addElement], name.peek[selectsElementWithHighestPriority], name.poll[deletesElementWithHighestPriority]
	 * 
	 * */
	
	
	
	
	
	
	
	
	
	
}

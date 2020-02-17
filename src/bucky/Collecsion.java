package bucky;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
 
class StringLength implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		int st1 = s1.length();
		int st2 = s2.length();
		if(st1 > st2)
			return 1;
		if(st1 < st2)
			return -1;
		
		return 0;
	}
	
}
class Person implements Comparable<Person>{
	//Using  own objects in  sets and maps
	int id;
	String name;
	public Person(int id, String name) {
		this.name = name;
		this.id = id;
	}
	
	public String toString() {
		//return "(ID: " + id + ", Name: "+ name + ")";
		return name;
	}
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Person person) {
		 //defining its natural order
		//return -.compareTo(person.name);
		
		//in case you want items to sort by length
		int len = name.length();
		int len1 = person.name.length();
		if(len> len1)
			return -1;
		else if(len<len1)
			return 1;
		return name.compareTo(person.name);
		//0 cant be returned in this case because it eliminates all strings of equal lengths
	}
	
	
	
}
public class Collecsion {

	public static void main(String[] args) {
		 //lists();
         //List test
		 /*List<Integer> arrayList = new ArrayList<>();
		 List<Integer> linkedList = new LinkedList<>();
		 
		 testList("ArrayList", arrayList);
		 testList("LinkedList", linkedList);*/
		 //hashmap();
		 //Map test
		 /*Map<Integer, String> hashmap = new HashMap<>();
		 Map<Integer, String> linkedmap = new LinkedHashMap<>();
		 Map<Integer, String> treemap = new TreeMap<>();

		 testMap(hashmap);*/
		 //set();
		
		 //object();
		 //sort();
	     //sort2();
		 queue();
		
	}

	private static void lists() {
		//Creating lists, used in java 9
		//List<String> obj = List.of("Mouse", "Cat", "Sheep");
		List<String> obj = new ArrayList<String>();
		obj.add("Cat");
		obj.add("Goat");
		obj.add("Sheep");
		obj.add("Mouse");
		for(String s: obj) 
		   System.out.println(s);
		//Methods of lists
		/*obj.contains("Lion");
		obj.get(2);
		obj.size();
		obj.indexOf("Mouse");
		obj.add(2,"Meat");
		obj.set(3,"Kin");
		obj.remove(2);
		*/
		Iterator ob = obj.iterator();
		
		while(ob.hasNext()) {
			System.out.println(ob.next());
		}
		//When making modifications to a list in a loop, the iterator method is advisable
		/*while(ob.hasNext()) {
			if(((String) ob.next()).endsWith("ob"))
				ob.remove();
		}*/
		/*for(String s: obj) {
			if(s.endsWith("t"))
				obj.remove(s);
		}*/
		//it is advisable when removing items to remove from the end.
	 
	}
	

	
	//this tests the speed of both linkedlist and arraylist
	private static void testList(String type, List<Integer> list) {
		
		//Populating both lists
		for(int i=0; i<1E5; i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		//Adding items at the end of the list
		/*for(int i=0; i<1E5; i++) {
			list.add(i);
		}*/
		//adding items elsewhere in a list
		for(int i=0; i<1E5; i++) {
			list.add(0,i);
		}
		long end = System.currentTimeMillis();
		
		//Printing out results
		System.out.println("Time " + (end-start) + " in ms for " + type);
	}
	
	
	private static void hashmap() {
		HashMap<Integer, String> map = new HashMap<>();
		//Populating hashmaps
		map.put(3, "Three");
		map.put(8, "Eight");
		map.put(6, "Six");
		map.put(9, "Nine");
		map.put(4, "Four");
		map.put(7, "Seven");
		
		//iteration through hashmaps Hashmaps do not keep its order
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ": " + value);
		}
		
	}
	
	//Testing kinds of maps
	private static void testMap(Map<Integer, String> map) {
		//Populating maps
		map.put(3, "Three");
		map.put(8, "Eight");
		map.put(6, "Six");
		map.put(9, "Nine");
		map.put(4, "Four");
		map.put(7, "Seven");
		
		/*Hashmaps do not guaranteely maintain natural order
		Linkedmaps maintain the order the elements were added
		Treemaps sorts the item in the natural order*/
		
		//Printing out items
		for(Integer me: map.keySet()) {
			String value = map.get(me);
			System.out.println(me + ": " + value);
		}
	}
	
	private static void set() {
		//sets eliminates duplicates, there exist 3 types 
		//HashSet, the most lightweight, does not keep items in natural order
		Set<String> hashset = new HashSet<>();
		//LinkedHashSet, items are doubly-linked, are in the order added in
		Set<String> linkedHashSet = new LinkedHashSet<>();
		//TreeSet, order items in the natural order
		Set<String> treeSet = new TreeSet();
		
		//populating items in sets
		hashset.add("Mouse");
		hashset.add("Cat");
		hashset.add("Dog");
		hashset.add("Lion");
		
		//iterating through the sets
		for(String s: hashset) {
			System.out.println(s);
		}
		
		/////////intersection & difference/////////Finding the intersecting or uncommon items between two sets
		Set<String> hashset1 = new HashSet<>();
		
		hashset1.add("Mouse");
		hashset1.add("Cat");
		hashset1.add("Rat");
		hashset1.add("Tiger");
		
		//set to find the intersecting items
		Set<String> interdiff = new HashSet<>(hashset);
		//finding intersecting items
		//interdiff.retainAll(hashset1);
		//finding difference in items
		interdiff.removeAll(hashset1);
		
		//printing out results
		System.out.println(interdiff);
		
	}
	
	private static void object() {
		//Creating objects of self defined class
		Person p1 = new Person(1, "Dog");
		Person p2 = new Person(2, "Goat");
		Person p3 = new Person(3, "Yon");
		Person p4 = new Person(1, "Dog");
		
		//creating map
		Map<Integer, Person> map = new LinkedHashMap<>();
		
		map.put(1, p4);
		map.put(2, p3);
		map.put(3, p2);
		map.put(1, p1);
		
		for(Integer i: map.keySet()) {
			System.out.println(map.get(i));
		}
		
		//creating set
		Set<Person> set = new LinkedHashSet<>();
		
		set.add(p4);
		set.add(p3);
		set.add(p2);
		set.add(p1);
		
		System.out.println(set);
		
		//It will be observed both the map and the set will not display the expected properties,eg, not duplicates in sets
		//the solution is using equal and hashcode on you class 
	}
	
	
	private static void sort() {
		//Sorting List Items
		///STRINGS///
		List<String> list = new ArrayList<>();
		
		list.add("Mouse");
		list.add( "Cat");
		list.add( "Zebra");
		list.add("Elephant");
		
		System.out.println("Original List of String");
		System.out.println(list);
		
		//Collections.sort is used to sort in ascending order(natural order);
		Collections.sort(list);
		
		System.out.println("Sorted List in ascending order");
		System.out.println(list);
		
		//To sort in descending order, a new class is created implementing the class Comparator, or an object of comparator
		//This is used as a second parameter to the collections.sort
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				 return -s1.compareTo(s2);
			}
 
			
			
		});
		
		System.out.println("Sorted List in descending order");
		System.out.println(list);
		
		//Sorting the string based on string length
		Collections.sort(list, new StringLength());
		
		System.out.println("Sorted List based on length");
		System.out.println(list);
		
		///INTEGERS///
		List<Integer> integer = new ArrayList<>();
		
		integer.add(3);
		integer.add(57);
		integer.add(33);
		integer.add(1);
		
		System.out.println("Original Integer List");
		System.out.println(integer);
		//sorting in ascending order
		Collections.sort(integer);
		
		System.out.println("Sorted Integer in ascending order");
		System.out.println(integer);
		
		//Sorting in descending
		Collections.sort(integer, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				 return -o1.compareTo(o2);
			}
			
		});
		
		System.out.println("Sorted List in descending order");
		System.out.println(integer);
		
		///OBJECTS///
		//Note: creating equals and hashcode method in the class to be used as objects, in this case Person class
		//solves the problem and sorts it in natural order.
		List<Person> person = new ArrayList<>();
		
		person.add(new Person(2, "Laugh"));
		person.add(new Person(2, "Happy"));
		person.add(new Person(2, "Baa"));
		person.add(new Person(2, "Ass"));
		
		System.out.println("Original objects list");
		System.out.println(person);
		
		//Collections.sort cannot be used here without the second parameter added
		Collections.sort(person, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				 return -o1.getName().compareTo(o2.getName());
			}
			
		});
		
		System.out.println("Sorted objects in descending order");
		System.out.println(person);
	}
	
	private static void sort2() {
		//Tree maps and tree sets are sorted by default but when using own objects, it is neccessary to implement the class
		//comparable in order to define how everything should be sorted. Not just specifying hashcode and equals method
		//TreeSet and TreeMaps implement SortedSet and SortedMap respectively
		SortedSet<Person> set = new TreeSet<>();
		set.add(new Person(3, "Xenon"));
		set.add(new Person(3, "Neon"));
		set.add(new Person(3, "Rubidium"));
		set.add(new Person(3, "Neno"));
		
		System.out.println(set);
		//elements cannot be added to the treemap or tree set unless a natural order is defined on it
		//in this case, the person class has no natural order defined to it
		//this is solved by implementing the interface comparable on your class and defining its natural order
		
		 
		
	}
	
	private static void queue() {
		///Queues follow the first in first in first out (fifo) protocol. Meaning you can only add at the end and
		///remove at the beginning. It is an interface implemented by LinkedList, ArrayBlockingQueue, LinkedBlockingQueueetc.
		//ArrayBlockingQueue and LinkedBlockingQueue is useful in that it is bounded whilst linkedlist is not
		Queue<Integer> queue = new ArrayBlockingQueue<Integer>(3);
		
		//printing out an empty array throws a no such element exception
		//System.out.println(queue.element());
		
		//Adding elements in a queue
		queue.add(45);
		queue.add(78);
		queue.add(42);
		//throws illegal state exception if you try to add more than the specified limit.
		try{
		queue.add(65);
		}catch(IllegalStateException e) {
			System.out.println("Tried to print out more than the specified limit");
		}
		
		//printing out elements 
		//element method prints out first element
		System.out.println(queue.element());
		
		//iterating through queues
		for(Integer a: queue) {
			System.out.println(a);
		}
		
		//removing items, note that you can only remove from the first element
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		//throws no such element exception when you try to remove more than the values in the queue.
		try{
		System.out.println(queue.remove());
		}catch(NoSuchElementException e) {
			System.out.println("Tried to remove more than specified limit");
		}
		
		/////////////////////Methods with no exceptions//////////////////////////
		
        Queue<Integer> queue1 = new ArrayBlockingQueue<Integer>(3);
		
		//Using peek instead of null to print out queues which are empty returns null instead
		//System.out.println(queue.peek());
		
		//Adding elements in a queue
		queue1.offer(45);
		queue1.offer(78);
		queue1.offer(42);
		//using offer method to add more than specified limit do not throw an exception unlike add
		queue1.offer(65);
		  
		//removing items, note that you can only remove from the first element
		System.out.println(queue1.poll());
		System.out.println(queue1.poll());
		System.out.println(queue1.poll());
		
		//using poll to remove more than number of elements in the queue only returns null
		System.out.println(queue1.poll());
		
		////////////Methods from subinterface BlockingQueue/////
		 
		 
	}
	
	
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		// Vector in Collections Framework 
		// Vector is a legacy class introduced in Java 1.0 which implements List interface
		// Its default capacity is 10 and initial capacity is 10
		
		// Creation of Vector
		// Vector offers 4 different constructors for creating an object of it 
		Vector<Integer> ob = new Vector<>(); // type 1 - Default creation (Capacity = 10) 
		/*
		
		Vector<Integer> v1 = new Vector<>(50); // Pre-defined capacity 
		
		// Custom capacity and explicit growth increment
		Vector<Integer> v2 = new Vector<>(20,5); // 20->Capacity , 5-> slots to increment , Here, It grows by adding exactly 5 slots instead of doubling.
		
		// Created directly from an existing Collection
		List<Integer> src = Arrays.asList(10,20);
		Vector<Integer> v3 = new Vector<>(src);
		
		*/
		// Default capacity : No. of elements that the internal array can store when no elements are added
		System.out.println(ob.capacity());
		// Addition of an element into the vector 
		// ob.add(element) -  Adds an element at the end of the vector 
		// ob.add(index, element) - inserts an element at the specified index 
		// ob.addAll(Collection) - Adds a collection of elements at the end 
		// ob.add(index,collection) - Adds collection of elements starting from the specified index 
		ob.add(1);
		System.out.println(ob);
		// Initial capacity - The number of elements that an internal array can store when atleast one element present in the vector 
		System.out.println(ob.capacity());
		// Size - No. of actual elements in the vector 
		System.out.println(ob.size());
		
		//Adding a collection of elements 
		Integer arr[] = {10,20,30,40,50};
		
		// Converting array of elements to list 
		// Arrays.asList() is used to quickly convert an array of objects into a fixed-size List
		//but it does not work with primitive data types (like int[], char[], or double[]) ,
		/*
		If you pass a primitive array (like int[]) into Arrays.asList(arr), 
		
		Java treats the entire array as a single object.Instead of creating a list of numbers, 
		it creates a list containing one single element: the array itself (List<int[]>).[[10,20,30,40,50]]
		*/
		ob.addAll(Arrays.asList(arr));
		System.out.println(ob);
		// Adding an element at specific index 
		ob.add(2,1000);
		System.out.println(ob);
		
		// Adding a collection of elements starting from specific index 
		ob.addAll(5,Arrays.asList(11,22,33));
		System.out.println(ob);
		
		// Creation of a vector by passing a list of elements
		Vector<Integer> ob1 = new Vector<>(Arrays.asList(10,20,30,40));
		System.out.println(ob1);
		// when ever, we create a Vector by passing the values, capacity and size will be same 
		/*
		System.out.println(ob1.capacity()); 
		System.out.println(ob1.size()); 
		ob1.add(50);*/
		/* Execute this for understanding capacity resizing
		System.out.println(ob1.capacity()); 
		System.out.println(ob1.size()); 
		*/
		
		// Retrieval of elements from the List 
		// ob.get(index) retrieves an element present at specific index 
		System.out.println("The element at 3rd index "+ ob.get(3));
		
		// Updating value( element ) at specific index
		ob.set(3,200);
		System.out.println("Vector after Updating: "+ob);
		
		// Removing elements from the list 
		// remove(int index) - if you pass value of int (primitive datatype), It consider it as index and removes value at that specific index , If index is out of bounds, It throws error 
		ob.remove(1);
		System.out.print("Vector after removing element at 1st index : "+ob);
		// remove(Object ) - To remove a specific element from the Vector , You must pass it as object like Integer obj.
		// Integer.valueOf(int value) - takes a primitive int value and returns an Integer object representing that same value. This process is called explicit boxing or caching.
		ob.remove(Integer.valueOf(10));
		
		// Removing all the elements and make the vector empty
		//ob.clear();
		System.out.print(ob);
		ob.add(30);
		ob.add(30);
		ob.add(30);
		ob.add(40);
		ob.add(40);
		ob.add(30);
		ob.add(33);
		ob.add(50);
		System.out.println(ob);
		// Removing all the elements from the host list which matches any element int the passed collection of elements
		ob.removeAll(Arrays.asList(30,33,40,50));
		System.out.println("After Removing all the matched elements: "+ ob);
		
		// Verification of elements in the list 
		// .contains(element) - Returns true if the passed element is present in the host vector, otherwise false
		System.out.println(ob.contains(1000));
		System.out.println(ob.contains(3));
		// .containsAll(collection) - Returns true if each and every element of the passed collection is present in the host vector, otherwise false
		System.out.println(ob.containsAll(Arrays.asList(1000,200)));
		System.out.println(ob.containsAll(Arrays.asList(1000,200,3)));
	}
}

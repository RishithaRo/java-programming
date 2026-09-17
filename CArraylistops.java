//ArrayList
//ArrayList is a class that implements List interface
//ArrayList is a part of collections framework and it was introduced in Java 1.2 version 
//When we create an ArrayList, Its default capacity is 0, if we add any element, Then its intial capacity will be 10
import java.util.*;
public class CArraylistops {
	public static void main(String[] args) {
		// Creation of ArrayList
		ArrayList<Integer> ob = new ArrayList<>();
		// System.out.println(ob.capacity()); This will not work because ArrayList do not have a method called capacity()
		System.out.print(ob.size());
		/*
		Iterable<Integer> ob1 = new ArrayList<>();
		Collection<Integer> ob2 = new ArrayList<>();
		List<Integer> ob3 = new ArrayList<>();
		// We can also create an ArrayList by providing size 
		ArrayList<Integer> ob4 = new ArrayList<>(50);
		// creating ArrayList by providing list of elements
		ArrayList<Integer> ob5 = new ArrayList<>(List.of(10,20));
		*/
		// ArrayList is not synchronized, not ThreadSafe
		// Array list is faster than Vector => ArrayList is having better performance than Vector
		//All the methods in ArrayList are same as Vector
		/*
		 	Addition of elements into the ArrayList
		 	ob.add(element)
		 	ob.addAll(collection)
		 	ob.add(index,element)
		 	ob.addAll(index,collection)
		 */
		/*
		 *	Retrieval of elements from the ArrayList
		 	ob.get(index)
		 */
		/*
		 	Updating value at specific index
		 	ob.set(index, newValue)
		 */
		/*
		 	Removal of elements 
		 	ob.remove(index);
		 	ob.remove(Object);
		 	ob.clear();
		 	ob.removeAll(collection);
		 */
		/*
		 	Verification of element/ elements
		 	ob.contains(element);
		 	ob.containsAll(collection);
		 */
		
		// Vector is 100% resizing where as ArrayList is 50% resizing
		// As ArrayList is not synchronized when its created, To make it synchronized manually, we can use
		Collections.synchronizedList(ob);
		/*
		 		When to use ArrayList vs Vector ?
		 		Use ArrayList for better performance in standard single-threaded applications, 
		 		and 
		 		only use Vector if you specifically need a legacy, built-in thread-safe collection for multi-threaded environments
		 */
		/*
		 		When to use Vector and ArrayList ?
		 			It is better to use them only when we need to - store data, Retrieve data .
		 		When not to use Vector and ArrayList ?
		 			It is better to avoid using ArrayList and Vector if we need frequent insertions / Deletions at the beginning/middle of the List.
		 			As both ArrayList and vector are built using Array internally, Insertions and deletions are not efficient as it involves shifting of elements
		 */
	}
}

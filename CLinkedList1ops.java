// PART 1 - In List Point of view
import java.util.*;
// LinkedList
// LinkedList is a class that implements 2 interfaces ,  They are List interface and Deque interface
// Collection -> List --> LinkedList							-> Extends , --> implements
// Collection -> Queue -> Deque -->LinkedList class 
// LinkedList internally uses doubly LinkedList
/*
 		Implementation of LinkedList
 		- There is no concept of Arrays in LinkedList
 		- we implement LinkedList by creating objects of Node class
 		- Each node has 
 				-- prev (Stores address of previous node)
 				-- item	(Stores the actual value)
 				-- next (Stores address of next node) 
 		- A LinkedList is a combination of multiple node objects
 		- For a first node of linkedlist, There will be no nodes before it, so prev = null ; similarly, There will be no nodes after it, next also null
 		- Whenever you create an object for LinkedList class, It would be created with 3 variables. They are size , first, last,
 			size - counts total no.of nodes in LL
 			first - Stores address that points to firstNode of LL
 			last - Stores address that points to lastNode of LL
 			you cannot access them directly because they are marked transient and have package-private visibility inside the java.util package.
 			By default, when no nodes are added, size = 0, first = null, last = null 
 */
// All operations which are performed on Vector and ArrayList can be performed on LinkedList

public class CollLLPractice {
	public static void main(String[] args) {
		// Creation of LinkedList
		
		// 1. ob (LinkedList) - Cannot fail compilation because it has access to everything, all the methods in List, Queue, Deque 
		LinkedList<Integer> ob = new LinkedList<>();
		ob.add(10);
		System.out.println(ob);
		/*
				// 2. ob1 (Collection) - Fails if you try to get an element by an index
					Collection<Integer> ob1 = new LinkedList<>();
					//ob1.get(0);	// The method get(int) is undefined for Collection , it works only for .size() , .clear(), .add() ..... which are present only in Collection
					
				// 3. ob2 (List) - Fails if you try to use double-ended queue operations like pop(), only The operations in List point of view can be executed
					List<Integer> ob2 = new LinkedList<>();
					//ob2.pop(); 
					
				// 4. ob3 (Queue) - Fails if you try to look up an element by an index, only The operations in Queue point of view can be executed
					Queue<Integer> ob3 = new LinkedList<>();
					//ob3.get(0); // The method get(int) is undefined for the type Queue<Integer>
					
				// 5. ob4 (Deque) - Fails if you try to access an element by its positional index , 
					// The operations which are only related to Queue and Deque point of view are executed 
					Deque<Integer> ob4 = new LinkedList<>();
					//System.out.print(ob4.get(2)); //The method get(int) is undefined for the type Deque<Integer>
					
				//Iterable -  Can execute looping and iteration (for-each, iterator(), forEach()); cannot execute any data management (add, remove, size, get).
					Iterable<Integer> ob5 = new LinkedList<>();
					//ob5.addAll(Arrays.asList(10,20,30));
					 
		 */
		List<Integer> sample = new LinkedList<>(Arrays.asList(10,20,30));
		/*
		 		Ways of creating a LL
		 		 -- LinkedList can be created only in two ways
		 		 		1) Creating an object for LinkedList class
		 		 			LinkedList<Integer> ob = new LinkedList<>();
		 		 		2) By passing collection of elements
		 		 			LinkedList<Integer> ob = new LinkedList<>(collection of elements);
		 		 ** We cannot create a LinkedList by providing size because if we want to create n number of nodes, 
		 		 we need to define the prev and next part for each node , It is not possible if the data is unknown.

		 		 			
		 */
		// Operations on LinkedList as per list point of view
		// Addition of elements into the LL
		ob.add(20);
		ob.addAll(Arrays.asList(40,50,60));
		ob.add(2,30);
		ob.addAll(2,Arrays.asList(1000,2000));
		System.out.println(ob);
		
		// Retrieval of elements from the LinkedList
		System.out.println(ob.get(7));
		
		// Updating elements
		/* The .set() method validates the index, 
		  	optimizes the search by traversing either forward from the first node or backward from the last node to reach the target, 
		  	and updates that node's value with new passed value without creating any newnode
		 */
		ob.set(1, 2000);
		System.out.println(ob);
		
		// Removal of elements
		ob.remove(1);
		ob.remove(Integer.valueOf(1000));
		ob.removeAll(Arrays.asList(50,60));
		System.out.println(ob);
		ob.clear();
		System.out.println(ob);
		
		ob.add(10);
		// Verification of element
		System.out.println(ob.contains(10)); // Autoboxing is done here, Java automatically wraps into object and then checks for equality
		System.out.println(ob.containsAll(Arrays.asList(10,20)));
		
		// LinkedList is not synchronized by default, To make it synchronized manually,
		Collections.synchronizedList(ob);
		
		// There are also some other methods, That are to be discussed in part 2
		// LinkedList allows duplicate values and null Values
		// It follows insertion order
		// LinkedList also allows random access of elements but with traversing through the list with time complexity O(n) 
		
		/*
		 		LinkedList is good at ?
		 		 - Frequent insertion / Deletion of elements
		 		For retrieval and storing data, ArrayList is good than LinkedList .
		 */
		
	}
}

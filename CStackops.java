// Stack
import java.util.*;
// Stack is a class which extends vector class inside collection interface
// Collections Framework -> Collection -> List --> Vector -> Stack
// Stack follows same internal implementation as Vector , uses arrays with 100% resizing capacity
// Stack is also a legacy class which is already introduced in Java 1.0 version
// Vector rotating in anti-clock wise direction ~ ~ Stack
// Stack follows LIFO - Last in First out principle
// All the methods which are inside vector can be used in Stack also
// Stack provides mainly 5 special methods - .push(element) , .pop() , .peek() , .empty() , .search(element) 
public class CollStackPractice {
	public static void main(String[] args) {
		/* The main difference between Vector and Stack is Vector has 4 different ways
		   for creation where as Stack can be created only in one way i.e., Default creation
		 */
		// Creation of Stack
		Stack<Integer> ob = new Stack<>();
		// Default capacity and initial Capacity of a Stack is 10
		// Stack follows insertion order and it is Synchronized same as vector
		// All Vector, ArrayList and Stack allows null values
		System.out.println(ob.capacity());
		
		// There are some special methods available in Stack
		// .push(element) - It puts an item onto the top of the stack and returns the pushed element
		// Addition of elements into the Stack
		ob.push(10);
		System.out.println(ob);
		
		// Retrieval of Elements from the Stack
		// .peek() - Looks at the top element of the stack and returns the top element without removing it
		System.out.println("Top Element: "+ob.peek());
		
		/*
		  		Does Stack offer random access of elements ?
		  		Yes, it offers random access using get(index) method as it extends vector class.
		  		But if we are dealing with Stack concept,As it follows LIFO principle, To follow that, we shouldn't use get() method.
		  		We can retrieve only the top element of the Stack using peek() method.
		 */
		
		// Updation of elements in the Stack
		/*
			 Yes, you can update elements using the set(index, element) method because it extends the Vector class. 
			 But if we are dealing with the Stack concept, we shouldn't do it.
		 */
		
		// Removal Of element from the Stack
		
		// .pop() - Removes and returns the top element from the stack
		// If the stack is empty, There will be no top element in the stack, 
		// If we call .pop() on an empty stack, It throws EmptyStackException
		
		System.out.println("Removed Element: "+ ob.pop());
		// ob.pop();
		
		 // Verification of elements
		/* .search(Object) - 
		 		Searches for an item and returns its 1-based position from the top of the stack. 
		 		If the item is at the very top, it returns 1. If it is not found, it returns -1
		 */
		ob.push(20);
		ob.push(30);
		ob.push(10);
		System.out.println("Position of element 10 in the stack :"+ob.search(Integer.valueOf(10)));
		System.out.println("Position of element 1000 in the stack :"+ob.search(Integer.valueOf(1000)));
		
		// Checking if the Stack is empty
		// .empty() - It checks if the Stack is empty, Returns true if the stack is empty, Other wise returns false . 
		// It is similar to .isEmpty() method used by Vector
		if(ob.empty()) {
			System.out.print("No Elements in Stack");
		}else {
			System.out.print("Atleast one element present in the Stack broh");
		}
    /* What stack is good at ?
        Undo / Redo: 
          It tracks your recent actions using two stacks. When you press Undo, the last action is popped from the undo stack 
          and pushed to the redo stack.
        Browser History: 
          It manages your "Back" and "Forward" buttons. 
          When you click Back, the current website is popped from the history stack so you can view the previous page.
    */
    /* What Stack is not good at ?
        Stack is not good at searching or modifying elements in the middle because you cannot access them without popping everything on top first.
        Stack is not good at searching even it provides .search(element) method, because, 
          It is slow: The search() method checks elements one by one from top to bottom, taking O(n) time in the worst case.
          It breaks the design: Stacks are meant only for accessing the top element. But here, we go to each element and checks for equality using .equals() method 
          internally and returns the top-down position.
     */
	}
}

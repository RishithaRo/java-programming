// All the common methods which can be used on object of any class inside the List interface is discussed
import java.util.*;
public class CollListcommonMeth {
	public static void main(String[] args) {
		List<Integer> ob = new Vector<>();
		ob.addAll(Arrays.asList(10,20,30,40,50,60,10,20));
		// 1. indexOf(Object o): Searches from the start and returns the index of the first occurrence of the element (-1 if missing).
		System.out.println(ob.indexOf(10));
		System.out.println(ob.indexOf(1));
		
		// 2. lastIndexOf(Object o): Searches from the end backward and returns the index of the last occurrence of the element (-1 if missing).
		System.out.println(ob.lastIndexOf(10));
		System.out.println(ob.lastIndexOf(1));
		
		// 3. contains(Object o): Returns a boolean indicating if the specific element exists in the list.
		System.out.println(ob.contains(10));
		System.out.println(ob.contains(1));
		
		// 4. containsAll(Collection<?> c): Returns a boolean indicating if the list contains all elements of the provided collection.
		System.out.println(ob.containsAll(Arrays.asList(10,20)));
		System.out.println(ob.containsAll(Arrays.asList(10,20,1)));
		
		// 5. isEmpty(): Checks if the list has zero elements (size == 0) , Returns boolean
		System.out.println(ob.isEmpty());
		
		// 6. size(): Returns the total count of elements currently in the list.
		System.out.println(ob.size());
		
		// 7. subList(int fromIndex, int toIndex)
		//      Returns a live window/view of the list between the specified indexes (inclusive of fromIndex, exclusive of toIndex). Changes to the sublist affect the main list.
		List<Integer> live = ob.subList(2,8);
		System.out.println("Before Removing: "+ob);
		//live.remove(Integer.valueOf(40));
		live.remove(2);
		System.out.println(ob);
		
		// 8. toArray(): Converts the collection into a basic object array (Object[]).
		Object[] arr = ob.toArray();
	
		// 9. toArray(T[] a): Converts the collection into a type-safe array (e.g., String[]) of the runtime type specified.
		// pass an empty required type array as blue print 
		Integer arr1 [] = ob.toArray(new Integer[0]);
		
		// And some advanced methods like iterator() , listIterator() , listIterator(int index) 
		
	}
}

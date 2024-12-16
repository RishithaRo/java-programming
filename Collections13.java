import java.util.*;
public class Collections13
{
  public static void main(String args[])
  {
    Stack<Integer> ob = new Stack<>();
    ob.push(10);
    ob.push(20);
    ob.push(30);
    ob.push(40); // To add an element into the stack at the top 
    System.out.println(ob);
    ob.pop(); //It removes and returns the top element of the stack (last insereted element in list)
    System.out.println("After popping "+ ob);
    System.out.println(ob.isEmpty()); //It returns true if the list is empty otherwise false
    System.out.println(ob.peek());
    System.out.println(ob);
    System.out.println(ob.search(10)); 
    /* It returns the poition of the element from the top of the stack 
    if the element is present in the stack.otherwise It returns -1
    */
    int num = 65;
    int x = ob.search(num);
    System.out.println(x);
  }
}

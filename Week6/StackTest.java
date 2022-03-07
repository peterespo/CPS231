import java.util.Iterator;
import java.util.Stack;

public class StackTest {
    public static void main(String args[])
    { 
        Stack<Integer> even_stack = new Stack<Integer>();  
       even_stack.push(2);  
       even_stack.push(4);  
       even_stack.push(6);  
       even_stack.push(8);  
       even_stack.push(10);  
       System.out.println("The element removed from stack: " + even_stack.pop());  
        Iterator<Integer> itr=even_stack.iterator();  
        System.out.println("The contents of the stack are:");
        while(itr.hasNext())
        {  
              System.out.print(itr.next() + " ");  
        }  
    }  

}

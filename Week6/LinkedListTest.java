import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListTest {
    public static void main(String args[])
    {  
        //linked list of String objects
        LinkedList<String> linkedlist_num = new LinkedList<String>();  
        linkedlist_num.add("one");
        linkedlist_num.add("two");
        linkedlist_num.add("three");
        linkedlist_num.add("four");
        linkedlist_num.add("five");
        //iterate over the linked list to display contents
        Iterator<String> itr=linkedlist_num.iterator();  
        System.out.println("The contents of the linked list are:");
        while(itr.hasNext())
        {  
              System.out.println(itr.next());  
        }  
    }  
 
}

import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueueTest {
    public static void main(String args[])
    {  
        PriorityQueue<String> color_queue = new PriorityQueue<String>();  
        color_queue.add("red");  
        color_queue.add("green");  
        color_queue.add("blue");  
        color_queue.add("cyan"); 
        color_queue.add("magenta"); 
        color_queue.add("yellow"); 
        System.out.println("Priority Queue elements:");
        System.out.println("head:"+color_queue.peek());  
        System.out.println("Other elements in Priority Queue:");  
        Iterator<String> itr=color_queue.iterator();  
        while(itr.hasNext())
        {  
            System.out.print(itr.next() + " ");  
        }  
       System.out.println("\n");
       color_queue.remove();  
       System.out.println("After removing element, new head:"+color_queue.element());
       System.out.println("\n");
       color_queue.poll();  
       System.out.println("After removing another element, Priority Queue :");  
        Iterator<String> itr2=color_queue.iterator();  
        while(itr2.hasNext())
        {  
            System.out.print(itr2.next() + " ");  
        }  
    }  

}

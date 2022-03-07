import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeue {
    public static void main(String[] args) 
    {  
        //Creating Deque and adding elements  
        Deque<Integer> deque = new ArrayDeque<Integer>();  
       deque.add(10);  
       deque.add(20);  
       deque.add(30);
       System.out.println("Deque Elements:");
        //Traversing elements  
        for (Integer num : deque) {  
           System.out.println(num);  
        }
    }  

}
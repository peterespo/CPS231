import java.util.Iterator;
import java.util.*;

public class ArrayListTest {
    public static void main(String args[])
    {  
        //Creating arraylist of String objects
        ArrayList<String> color_list = new ArrayList<String>();  
        //populate the arraylist with add method
        color_list.add("Red");
        color_list.add("Green");
        color_list.add("Blue");
        color_list.add("Cyan");
        color_list.add("Magenta");
        color_list.add("Yellow");
        //Traverse the list through Iterator  
        Iterator<String> itr=color_list.iterator();  
        System.out.println("The contents of the arraylist are:");
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        }  
    }  
 
}
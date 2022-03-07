import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
    public static void main(String args[]) {
        Vector<String> subject_vector=new Vector<String>();  
        subject_vector.add("English");  
        subject_vector.add("Hindi");  
        subject_vector.add("Maths");  
        subject_vector.add("Science");  
        Iterator<String> itr=subject_vector.iterator(); 
        System.out.println("Vector contents:");
        while(itr.hasNext())
        {  
             System.out.println(itr.next());  
        }   
    }
}

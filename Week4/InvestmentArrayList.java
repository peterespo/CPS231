import java.util.ArrayList;
import java.util.Arrays;

public class InvestmentArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"));

        ArrayList<Integer> balances = new ArrayList<Integer>(Arrays.asList(341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265));

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + ": " + balances.get(i));
        }
    }
}

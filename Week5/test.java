import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // Initialize Variables
        ArrayList<String> items = new ArrayList<String>();
        items.add("test");
        Scanner userInput = new Scanner(System.in);

        try {
            System.out.println("What would you like to do? Enter 'help' without the quotations for more options. ");
            while (true) {
                
                String userChoice = userInput.nextLine();
                System.out.println(userChoice);
                if (userChoice+"" == "help") {
                    System.out.println("ListEditor is active, you can use commands 'view' 'add {value}' 'remove {value}' or 'edit {value}' a value in a list.");
                }
            }
        } catch(IllegalStateException | NoSuchElementException e) {
            System.out.println("System.in closed, exiting.");
        }

        userInput.close();
    }
}

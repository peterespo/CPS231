// TEST CHANGES
// TEST2
// TEST3

public class CollegeInvestmentClub {
    public static void main(String[] args) {
        Employee e1 = new Employee("Peter", "Esposito", "10001", "peter.esposito@sunydutchess.edu", 502.81, "Student", "845-391-1293", 1);
        
        System.out.println(e1.getFirstName());
        System.out.println(e1.getLastName());
        System.out.println(e1.getidNum());
        System.out.println(e1.getEmail());
        System.out.println(e1.getBalance());
        System.out.println(e1.getEmployeeType());
        System.out.println(e1.getPhoneNumber());
        
    }
}
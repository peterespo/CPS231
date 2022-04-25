// TEST CHANGES
// TEST2
// TEST3

public class CollegeInvestmentClub {
    public static void main(String[] args) {
        Employee e1 = new Employee("Peter", "Esposito", "10001", "peter.esposito@sunydutchess.edu", 502.81, "Student", "845-391-1293", 1);
             
        getData(e1);
    }
    
    public static void getData(Employee e) {
        System.out.println(e.getFirstName());
        System.out.println(e.getLastName());
        System.out.println(e.getidNum());
        System.out.println(e.getEmail());
        System.out.println(e.getBalance());
        System.out.println(e.getEmployeeType());
        System.out.println(e.getPhoneNumber());
    }
}
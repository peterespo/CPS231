import java.util.ArrayList;

public class CollegeInvestmentClub {
    public static void main(String[] args) {
        // Employee Arraylist Initalization
        ArrayList<Employee> employees = new ArrayList<Employee>();

        // Employee Creation
        Employee e1 = new Employee("Peter", "Esposito", "10001", "peter.esposito@sunydutchess.edu", 502.81, "Student");
        Employee e2 = new Employee("Akram", "Gafur", "10010", "akram.gafur@sunydutchess.edu", 273, "Student");
        Employee e3 = new Employee("Caleb", "Herrera", "10011", "caleb.herrera@sunydutchess.edu", 278, "Student");     
        Employee e4 = new Employee("John", "Maksuta", "10100", "john.maksuta@sunydutchess.edu", 329, "Student");     
        Employee e5 = new Employee("Herrera", "Marin", "10101", "herrera.marin@sunydutchess.edu", 445, "Student");     
        Employee e6 = new Employee("Brandon", "Mohammed", "10110", "brandon.mohammed@sunydutchess.edu", 402, "Student");     
        Employee e7 = new Employee("Christopher", "Shenton", "10111", "christopher.shenton@sunydutchess.edu", 388, "Student");     
        Employee e8 = new Employee("Lucas", "Stoffel", "11000", "lucas.stoffel@sunydutchess.edu", 275, "Student");
        Employee e9 = new Employee("Appolo", "Tankeh", "11001", "appolo.tankeh@sunydutchess.edu", 278, "Faculty");     

        // Employee Adding
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        employees.add(e8);
        employees.add(e9);

        System.out.println("--------------");;
        for (Employee e : employees) {
            getData(e);
            System.out.println("--------------");;
        }

    }
    
    public static void getData(Employee e) {
        /*System.out.println(e.getFirstName());
        System.out.println(e.getLastName());
        System.out.println(e.getidNum());
        System.out.println(e.getEmail());
        System.out.println(e.getBalance());
        System.out.println(e.getEmployeeType());*/

        System.out.println(e.getFirstName() +  " " + e.getLastName() + " " + e.getidNum() + " " + e.getEmail() + " " + e.getBalance() + " " + e.getEmployeeType() );
    }
}

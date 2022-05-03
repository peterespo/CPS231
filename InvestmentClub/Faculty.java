public class Faculty extends Employee {
    String subjectName;

<<<<<<< HEAD
    public Faculty(String firstName, String lastName, String idNum, String email, double balance, String employeeType, String phoneNumber, int cashAppWallet, String subjectName) {
        super(firstName, lastName, idNum, email, balance, employeeType /*phoneNumber, cashAppWallet*/);
=======
    public Faculty(String firstName, String lastName, String idNum, String email, double balance, String employeeType, String subjectName) {
        super(firstName, lastName, idNum, email, balance, employeeType);
>>>>>>> 01eb47b18c5909dd4a9e2c2872aa16a5249cddb5
        this.subjectName = subjectName;
    }

    public void setSubject(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubject() {
        return subjectName;
    }

}
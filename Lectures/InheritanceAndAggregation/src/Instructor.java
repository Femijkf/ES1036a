public class Instructor extends Person {

    // class fields
    private String officeNumber;
    private String department;

    public Instructor(String firstName, String lastName, String officeNumber, String department) {
        // this lines will call the superclass constructor
            //it should be the first line in this constructor
        // 2 OR 3 QUESTIONS RELATED TO THIS ON FINAL EXAM!!!!
        super(firstName, lastName);

        this.officeNumber = officeNumber;
        this.department = department;
    }

    // toString method that overloads the memory location when printing in DemoClass
    public String toString() {
        String str = super.toString() + "\nOffice Number: " + officeNumber + "\nDepartment: " + department;
        return str;
    }
}
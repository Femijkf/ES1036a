public class Employee {
    // class fields
    private String name;
    private String employeeNumber;
    private String hireDate;

    // constructor that initializes the variables
    public Employee(String n, String num, String date) {
        name = n;
        employeeNumber = num;
        hireDate = date;
    }

    public void setName(String n) {
        name = n;
    }

    public void setEmployeeNumber(String e) {
        employeeNumber = e;
    }

    public void setHireDate(String h) {
        hireDate = h;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getHireDate() {
        return hireDate;
    }

    private boolean isValidEmpNum(String e) {
        boolean valid = false;
        if (e != null) {
            valid = true;
        }
        return valid;
    }

    // toString method that overrides the memory location when printing in DemoClass
    public String toString() {
        String str = "Name: " + name + "\nEmployee Number: " + employeeNumber + "\nHire Date: " + hireDate;
        return str;
    }
}

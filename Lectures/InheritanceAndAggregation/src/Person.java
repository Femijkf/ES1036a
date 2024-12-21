public class Person {

    // class fields
    private String firstName;
    private String lastName;

    public Person() {
        firstName = "";
        lastName = "";

        System.out.println("This is Person class instructor");
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        String str = lastName + ", " + firstName;
        return str;
    }
}

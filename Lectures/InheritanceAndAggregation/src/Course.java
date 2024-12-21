public class Course {
    // class fields
    private String code;
    private String number;
    private String name;

    public Course(String code, String number, String name) {
        this.code = code;
        this.number = number;
        this.name = name;
    }

    // toString method that overloads the memory location when printing in DemoClass
    public String toString() {
        String str = "\t" + code + " " + number + " " + name + "\n";
        return str;
    }
}

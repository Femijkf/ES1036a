public class Student extends Person {
    //class fields
    private int noOfCourses; // tp hold the maximum number of ___________
    private Course[] courses; // This is the aggregation with the class course
    private String studentNumber;

    public Student(String firstName, String lastName, String studentNumber) {
        super(firstName, lastName);
        this.studentNumber = studentNumber;
        // create 10 null course objects in the array
        courses = new Course[10];
    }

    public void addCourse(Course course) {
        // add onr object to the array
        courses[noOfCourses] = course;
        noOfCourses++;
    }

    public String toString() {
        String str = "Student Number: " + studentNumber + "\nStudent Name: " + super.toString() + "\nCourses: \n";

        for (int i = 0; i < noOfCourses; i++) {
            str += courses[i] + "\n";
        }

        return str;
    }
}

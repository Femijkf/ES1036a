public class DemoClass {
    public static void main(String[] args) {
        // create an object of type Instructor

        Instructor instructor = new Instructor("Abelkader", "Ouda", "ACEB-4452", "ECE");

        System.out.println(instructor);

        Course couse1 = new Course("ES", "001", "Course 1");
        Course couse2 = new Course("ES", "001", "Course 2");
        Student student1 =  new Student("John", "Doe", "123456789");
        Student student2 =  new Student("Jane", "Doe", "987654321");

        student1.addCourse(couse1);

        System.out.println(student1);

        student2.addCourse(couse2);

        System.out.println(student2);


        // For final exam, may give us code and tell us to write out the outcome
           // multiple classes
           // overloading --> replaces superclass info with its own (e.g. changes int to a double, double to a string etc.)
           // overriding --> subclass try to rewrite something in the super class
        // CHECK CAMERA ROLL FOR "Good Question for the Final Exam"

        // Polymorphism
            // Example
                // SuperClass variableName = new SubClass(parameter1, parameter2, ...);
            // Apparently this is in the lab -\_(''D)_/-
    }
}

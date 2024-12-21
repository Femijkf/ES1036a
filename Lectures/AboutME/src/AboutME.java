import java.util.Scanner;

public class AboutME {
    public static void main(String[] args) {
        /*
        //result is true
        String s1 = "aaa";
        String s2 = "aaa";
        System.out.println(s1 == s2);*/

        // object "me" that takes in no arguments
        Person me = new Person();

        Person john = new Person("John Doe", 2005);
        // "Person() (after "new") is the constructor
            // constructor name should match the name of the class
        /*System.out.println(john.getMyName());
        System.out.println(john.getYearOfBirth( ));*/

        Person mike = new Person("Mike Smith", 2015);

        // creare a new object for Jane's profession
        Job janeJob = new Job("Software Engineering", 90000, "XYZ Company", "Somewhere");
        Person jane = new Person("Jane Doe", 2015, janeJob);

        System.out.println(jane);

        /*System.out.println(mike.getMyName());
        System.out.println(mike.getYearOfBirth( ));

        // prints the class name concatenated with the memory address/location of the stack
        System.out.println(mike);
        System.out.println(john);

        // prints the same output as line 20 and 21
        System.out.println(mike.toString());
        System.out.println(john.toString());*/

        //System.out.println(mike.equals(john));

//        // string used to hold the name given by the keyboard
//        String myName;
//        // int used to hold the year of birth given by the keyboard
//        int yearOfBirth;
//
//        // creates an object to represent the keyboard
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter your name: ");
//        // nextLine() reads whole line up until the use presses "Enter"
//        john.setMyName(input.nextLine());
//        // myName = input.nextLine();
//        // next() reads until it sees whitespace (presses spacebar) or presses enter
//                /* if there are multiple responses on one line, the next input in that line will but used
//                   for the next keyboard input */
//        // myName = input.next();\
//
//        // read what we have in the keyboard buffer, clean the buffer
//        input.nextLine();
//
//        System.out.println("Enter your birth year: ");
//        john.setYearOfBirth(input.nextInt());
//        // yearOfBirth = input.nextInt();
//
//        // System.out.printf("Welcome %s, you are %d years old\n", myName, 2023-yearOfBirth);
//        System.out.printf("Welcome %s, you are %d years old\n", john.getMyName(), john.getAge());
    }
}
import java.util.Scanner;

public class StringVariables {
    public static void main(String[] args) {
        // Stores the value 18 in the memory using the variable age
        int age;
        // Object is directly stored in something known as "Stack Memory" (e.g. age, 18)

        // Stores the string "Femi Odujinrin" in the memory using the variable myName
        String myName = "Femi Odujinrin";
        // Address is stored in something known as "Stack Memory" (e.g. 150, myName)
        // The object accessed through the address in the Stack Memory
            // But, the object is stored in something known as the "Heap Memory" (e.g. "Femi Odujinrin")
                // This holds the string's value

//        String myName = new String("Femi Odujinrin");
        // new creates and object of class ______ (in this case, of class String)
        // When creating other objects of different classes, you MUST use new

        System.out.println("Welcome " + myName);
        System.out.println("You name has " + myName.length() + " characters");

        // creates a scanner object to represent the keyboard device
        Scanner input = new Scanner(System.in);

        System.out.println("How old are you? ");
        age = input.nextInt();

        System.out.println("You were born in year " + (2023 - age));
    }
}

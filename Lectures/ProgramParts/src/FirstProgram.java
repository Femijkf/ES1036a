public class FirstProgram {
    /*
    This is the first comment
    that has multiple lines
    */
    public static void main(String[] args) {
        // let's learn the first Java statement
        System.out.println("Welcome to Java!\n");
        // System = Class
        // out = Object
        // println() = Method
        // \n = creates a new line
        System.out.print("And welcome to ES1036a");
        // print() = will NOT create a new line following the printed statement
        // println() = will create a new line following the printed statement
        System.out.println("12345678901234567890");
        System.out.println("\tHello There!");
        // \t = shifts/indents a statement a "tab space" (4 spaces)
        System.out.println("H\tello There!");
        // this makes it indent only 3 spaces
        System.out.println("He\tllo There!");
        System.out.println("Hel\tlo There!");
        System.out.println("Hell\to There!");
        // indents go back to 4 spaces once there is 4 spaces worth of characters before it
        System.out.println("Hello There!\b");
        // \b = deletes 1 character of a statement before it
        System.out.println("Hello \rThere!");
        // \r = deletes whole "word" of a statement
    }

}

public class Task1 {
    // Let's work on variables and literals
    public static void main(String[] args) {
        int hours; // Reserve a memory location to store integer values
        hours = 40; // This is called an assignment statement

        int overTime = 2;

        double payRate = 35.5; // stores 15 decimal places
        // float payRate = 35.5f;  stores 7 decimal places

        System.out.println("I am working " + (hours + overTime) + " hours per week");

        double weeklyPayment = hours * payRate; // makes value in weeklyPayment a double
        weeklyPayment = (int) (hours * payRate); // rounds and/or gets rid of decimal place to
                                                 // make weeklyPayment an int

        System.out.println("I am doing $" + weeklyPayment + " per week");

        byte oneByte, anotherByte, resultByte;
        oneByte = 8;
        anotherByte = 7;

        resultByte = (byte) (oneByte + anotherByte);

//        System.out.println("The value is -> " + oneByte);
        System.out.println("The value is -> " + resultByte);

    }
}
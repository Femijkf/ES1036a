import java.util.Arrays;

public class Task3Demo {
    public static void main(String[] args) {
        double[] array = {3.0, 2.4, 6.0, 2.0, 4.0, 5.1, 7.2};
        SequenceOperations sequenceOperations =  new SequenceOperations();

        // the following lines print out the calculated values from the SequenceOperations class
        System.out.println("Processing the array: " + Arrays.toString(array));
        System.out.println("Total: " + sequenceOperations.getTotal(array));
        System.out.println("Average: " + sequenceOperations.getAverage(array));
        System.out.println("Highest Value: " + sequenceOperations.getHighest(array));
        System.out.println("Array Reverse: " + Arrays.toString(sequenceOperations.getReverse(array)));
    }
}
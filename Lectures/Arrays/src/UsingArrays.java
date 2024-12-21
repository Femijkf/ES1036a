import java.util.Arrays;
import java.util.Random;

public class UsingArrays {
    // create an array to hold random integers
    public static int[] makeIntArray(int size) {
        int[] intArray = new int[size];
        Random random = new Random();

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(100);
        }
        return intArray;
    }

    // this method prints out the contents of the given array
    public static void printArray(int[] givenArray) {
        for (int i = 0; i < givenArray.length; i++) {
            System.out.println(givenArray[i]);
        }
    }

    // returns the maximum number of the array
    public static int findMax(int[] givenArray) {
        int maxNum = 0;
        for (int i = 0; i < givenArray.length; i++) {
            if (givenArray[i] > maxNum) {
                maxNum = givenArray[i];
            }
        }
        return maxNum;
    }

    // return true or false if the array is sorted (increasing order)
    public static boolean isIncreasing(int[] givenArray) {
        boolean truth = true;
        int holder = 0;
        for (int i = 0; i < givenArray.length; i++) {
            if (holder < givenArray[i]) {
                truth = true;
            }
            else {
                truth = false;
            }
            holder = givenArray[i];
        }
        System.out.println(givenArray);
        return truth;
    }

    public static void main(String[] args) {
        // call the method to create int array of size 5
        int[] myArray = makeIntArray(5);
        // print out the array elements
        printArray(myArray);
        System.out.println("The maximum number is: " + findMax(myArray));
        System.out.println("Is the array increasing: " + isIncreasing(myArray));

        /*// create array of course scores of type double
        double[] scores = new double[50];

        Random random = new Random();
        for (int i= 0; i < scores.length; i++) {
            scores[i] = random.nextDouble(50,100.1);
        }

        // print print out all scores
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        scores = new double[5];

        // prints entire array in one line
        System.out.println(Arrays.toString(scores));

        // Method #1
        scores[0] = 60.5;
        scores[1] = 90.0;
        scores[2] = 98.2;

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);

        // Method #2 - inconvenient
        /*double s1, s2, s3;
        s1 = 60.5;
        s2 = 90.0;
        s3 = 98.2;*/
    }
}

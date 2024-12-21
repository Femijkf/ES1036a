public class SequenceOperations {

    // getTotal method that add up the values in the array
    public double getTotal(double[] numArray) {
        double total = 0;
        for (int i = 0; i < numArray.length; i++) {
            total =  total + numArray[i];
        }
        return total;
    }

    // getAverage method that finds the average of the values in the array
    public double getAverage(double[] avgArray) {
        double average;
        average = getTotal(avgArray) / avgArray.length;
        return average;
    }

    // getHighest method that returrns the highest value in the array
    public double getHighest(double[] highArray) {
        double highest = 0;
        for (int i = 0; i < highArray.length; i++) {
            if (highArray[i] > highest) {
                highest = highArray[i];
            }
        }
        return highest;
    }

    // getReverse method that returns that reverse order of the elements in the original array
    public double[] getReverse(double[] reverseArray) {
        double[] holderArray = new double[reverseArray.length];
        int counter = reverseArray.length-1;
        for (int i = 0; i < reverseArray.length; i++) {
            holderArray[counter] = reverseArray[i];
            counter--;
        }
        return holderArray;
    }
}
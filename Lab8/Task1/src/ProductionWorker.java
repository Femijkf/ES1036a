public class ProductionWorker extends Employee {
    // class fields
    private int shift;
    private double payRate;

    public final int DAY_SHIFT = 1;
    public final int NIGHT_SHIFT = 2;

    // constructor that initializes the variables
    public ProductionWorker(String n, String num, String date, int sh, double rate) {
        super(n, num, date);
        shift = sh;
        payRate = rate;
    }

    public void setShift(int s) {
        shift = s;
    }

    public String setShift( ){
        String value;
        if (shift == 1) {
            value = "Day";
        }
        else {
            value = "Night";
        }
        return value;
    }

    public void setPayRate(double p) {
        payRate = p;
    }

    public int getShift() {
        return shift;
    }

    public double getPayRate() {
        return payRate;
    }

    // toString method that overrides the memory location when printing in Task1Demo
    public String toString() {
        // two methods for printing out the requested output (using another setshift() method to return a String vs ternary operator
        //String str = super.toString() + "\nShift: " + setShift() + "\nHourly Pay Rate: $" + payRate + "0\n";
        String str = super.toString() + "\nShift: " + (getShift() == DAY_SHIFT ? "Day" : "Night") + "\nHourly Pay Rate $" + payRate + "0\n";
        return str;
    }
}

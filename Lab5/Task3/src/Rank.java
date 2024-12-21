public class Rank {
    private double mark;

    public Rank(double Mark) {
        mark = Mark;
    }

    // here is the getRank method that uses if-else statements to obtain the correct response
    // to a students mark
    public String getRank() {
        String rankCategory;
        if (mark < 50) {
            rankCategory = "Unacceptable";
        }
        else if (mark > 50 && mark < 70) {
            rankCategory = "Below Expectations";
        }
        else if (mark > 70 && mark < 90) {
            rankCategory = "Meets Expectations";
        }
        else {
            rankCategory = "Exceeds Expectations";
        }
        return rankCategory;
    }
}

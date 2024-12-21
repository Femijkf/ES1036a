public class RankSwitchVersion {
    private double mark;

    public RankSwitchVersion(double Mark) {
        mark = Mark;
    }

    // here is the getRank method that uses switch statements to obtain the correct response
    // to a students mark
    public String getRank() {
        String rankCategory;
        switch ((int) mark/10) {
            case 4, 3, 2, 1, 0:
                rankCategory = "Unacceptable";
                break;
            case 5, 6:
                rankCategory = "Below Expectations";
                break;
            case 7, 8:
                rankCategory = "Meets Expectations";
                break;
            default:
                rankCategory = "Exceeds Expectations";
                break;
        }
        return rankCategory;
    }
}
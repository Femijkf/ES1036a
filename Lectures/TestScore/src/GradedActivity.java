public class GradedActivity {
    private double score; // The only field in the class

    public void setScore(double s) {
        score = s;
    }

    public double getScore() {
        return score;
    }

    public char getGrade() {
        // using if-else-if
        char grade;
//        if (score < 60) {
//            grade = 'F';
//        }
//        else if (score < 70 && score > 60) {
//            grade = 'D';
//        }
//        else if (score < 80 && score > 70) {
//            grade = 'C';
//        }
//        else if (score < 90 && score > 80) {
//            grade = 'B';
//        }
//        else {
//            grade = 'A';
//        }

        //using switch statement
        switch ((int) (score/10)) {
            case 10:
                //grade = 'A';
                //break;
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }

        return grade;
    }
}

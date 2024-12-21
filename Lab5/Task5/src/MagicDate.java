public class MagicDate {
    private int month;
    private int day;
    private int year;

    public MagicDate(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }

    // here is the isMagic boolean method that calculate if the date is magic or not
    public boolean isMagic() {
        boolean response;
        if ((month*day) == year) {
            response = true;
        }
        else {
            response = false;
        }
        return response;
    }
}

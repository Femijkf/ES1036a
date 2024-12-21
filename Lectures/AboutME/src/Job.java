public class Job {
    private String title;
    private double baseSalary;
    private String companyName;
    private String companyLocation;

    // one constructor to initialize the instance fields
    public Job(String title, double baseSalary, String companyName, String companyLocation) {
        // this is better convention than creating a new variable and assign it to the private variables
        this.title = title;
        this.baseSalary = baseSalary;
        this.companyName = companyName;
        this.companyLocation = companyLocation;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    // UML Diagram of what class aggregation would look like
    // -------------------                                   -------------------
    // |      Person     |                                   |       Job       |
    // -------------------                                   -------------------
    // |                 |                                   |                 |
    // |                 | / \ ______________________________|                 |
    // |                 | \ /                               |                 |
    // |                 |                                   |                 |
    // |                 |                                   |                 |
    // -------------------                                   -------------------

    public String toString() {
        String str = "\tTitle: " + title + "\n\tBase Salary: $" + baseSalary + "\n\tCompany: " + companyName + "\n\tLocation: " + companyLocation;
        return str;
    }
}

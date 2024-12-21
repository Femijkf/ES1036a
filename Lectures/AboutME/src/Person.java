import java.util.Calendar;
public class Person {

    private String myName; // string used to hold the name given by the keyboard
    private int yearOfBirth; // int used to hold the year of birth given by the keyboard
    // relationship between 2 classes (Person class is dependent of Job class. NOT vice-versa)
    // this is known as "class aggregation"
    private Job profession;

    // takes in no/zero arguments
    public Person(){

    }

    // This is a special method called the constructor of the class
    //This will no longer be the default constructor, it is constructor with args
        // Default constructor is a constructor with empty brackets
    // method overloading
    public Person(String pName) {
        // myName = pName;
        // this.yearOfBirth = 2015;
        //this(pName, 2015);
    }

    public Person(String pName, int yearOfBirth) {
        myName = pName;
        this.yearOfBirth = yearOfBirth;
    }

    public Person(String pName, int yearOfBirth, Job profession) {
        myName = pName;
        this.yearOfBirth = yearOfBirth;
        this.profession = profession;
    }

    // theses are the setter methods for my attributes
    public void setMyName(String personName) {
        myName = personName;
    }
    public void setYearOfBirth(int personYOB) {
        yearOfBirth = personYOB;
    }

    // these methods are the getters of my attributes
    public String getMyName() {
        return myName;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - yearOfBirth;
        return age;
    }

    // every sing code has this (invisible/implicit)
    /*public String toString(){
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }*/

    // overriding the original toString output (method overriding)
    public String toString() {
        String msg = getMyName() + "\n" + getAge() + "\nJob Information:\n" + profession.toString();
        return msg;
    }

    // assume that two person are equal id they both has same year of birth
    // assume that two people are equal if they both have the same year of birth
    public boolean equals(Person givenPerson) {
        boolean result;
        if (yearOfBirth == givenPerson.getYearOfBirth()) {
            result = true;
        }
        else {
             result = false;
        }
        return result;
    }
}

package code_uz._oop_007_Lesson;


public class Employee {


    String firstName;
    String lastName;


    public void setFirstName(String a) { // set
        firstName = a;
    }

    public String getFirstName() { // get
        return firstName;
    }


    public void setLastName(String a) {
        lastName = a;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return " " + firstName + " , " + lastName;
    }
}

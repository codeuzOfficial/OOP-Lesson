package code_uz._oop_008_Lesson;

/**
 * Created by Bigman on 19.06.2018.
 */
public class Employee {

    String firstName;
    String lastName;

    public Employee() {
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return " " + this.firstName + " , " + this.lastName;
    }

}

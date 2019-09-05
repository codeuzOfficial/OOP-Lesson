package code_uz._oop_028_Lesson;

public class Teacher extends Person {


    private String subject;

    public Teacher() {

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /*.... */

    @Override
    public String toString() {
        return " " + super.toString() + " " + this.subject;
    }
}

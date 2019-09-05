package code_uz._oop_029_Lesson;

public class Teacher extends Person {


    private String subject;

    public Teacher(String name, String surname) {
        super(name, surname);
        System.out.println("Teacher");
    } // car

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

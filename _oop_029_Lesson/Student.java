package code_uz._oop_029_Lesson;

public class Student extends Person {


    private int level;

    public Student() {
        super("aaa", "bbb");
        System.out.println("Student");
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {

        return " " + super.toString() + "  " + this.level;
    }
}

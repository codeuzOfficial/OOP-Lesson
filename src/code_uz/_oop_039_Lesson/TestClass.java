package code_uz._oop_039_Lesson;

public class TestClass {
    public final int m = 5;

    public final Student student;

    {
        this.student = new Student();
    }

    public void finalMethod() {
        System.out.println("Final method.");
    }

}

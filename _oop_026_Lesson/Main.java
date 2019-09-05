package code_uz._oop_026_Lesson;

/**
 * OOP
 * _026_Lesson
 */
public class Main {

    public static void main(String[] args) {
        // inheritance


        Student student = new Student();
        student.setName("Ali");
        student.setSurname("Aliyev");
        student.setAge(22);
        student.setLevel(2);

        Teacher teacher = new Teacher();
        teacher.setName("Ali");
        teacher.setSurname("Aliyev");
        teacher.setAge(22);
        teacher.setSurname("Math");

    }
}

package code_uz._oop_027_Lesson;

/**
 * OOP
 * _027_Lesson
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
        teacher.setSubject("Math");


        Person person = new Person();
        person.setName("Ali");
        person.setSurname("Aliyev");
        person.setAge(22);


        System.out.println(teacher);
    }
}

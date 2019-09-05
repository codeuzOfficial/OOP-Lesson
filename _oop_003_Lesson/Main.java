package code_uz._oop_003_Lesson;

/**
 * OOP
 * _003_Lesson
 */
public class Main {

    public static void main(String[] args) {
        // write your code here

        Employee ishchi_1 = new Employee();

        ishchi_1.firstName = "Ishchi 1 name";
        ishchi_1.lastName = "Ishchi 1 surname";

        System.out.println(ishchi_1.firstName);
        System.out.println(ishchi_1.lastName);


        Employee ishchi_2 = new Employee();

        ishchi_2.firstName = "Ishchi 2 name";
        ishchi_2.lastName = "Ishchi 2 surname";

        System.out.println(ishchi_2.firstName);
        System.out.println(ishchi_2.lastName);

    }
}

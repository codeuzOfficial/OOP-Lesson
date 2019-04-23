package code_uz._oop_017_Lesson;

/**
 * OOP
 * _017_Lesson
 */
public class Main {

    public static void main(String[] args) {
        // String


        String s1 = "";
        String s2 = new String("java");

        char[] c1 = {'J', 'a', 'v', 'a'};
        String s3 = new String(c1);

        char[] c2 = {'J', 'a', 'v', 'a', 'J', 'a', 'v', 'a'};
        String s4 = new String(c2, 2, 4);

        String s5 = "java";
        String s6 = new String(s5);


        byte ascii[] = {65, 66, 67, 68, 69, 70};
        String s7 = new String(ascii, 2, 3);
        System.out.println(s7);

    }
}

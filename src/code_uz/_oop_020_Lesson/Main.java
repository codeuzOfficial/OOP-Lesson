package code_uz._oop_020_Lesson;

/**
 * OOP
 * _020_Lesson
 */
public class Main {

    public static void main(String[] args) {
        // write your code here

        String s1 = "code uz"; //
        String s2 = "coodE uz";

        String s3 = new String("code uz");

        if (s1.regionMatches(true, 1, s2, 2, 3)) { //   ode / ode
            System.out.println("teng");
        } else {
            System.out.println("teng emas");
        }


    }
}

package code_uz._oop_018_Lesson;

/**
 * OOP
 * _018_Lesson
 */
public class Main {

    public static void main(String[] args) {
        // String

        String s1 = "java !";
        int n = s1.length();


        String s2 = "code uz"; // {c,o,d,e, ,u,z}
        char c2 = s2.charAt(1);

        String s3 = "code uz";
        char[] c3 = s3.toCharArray();

//        for (int i = 0; i < c3.length; i++) {
//            System.out.print(c3[i] + " ,");
//        }


        String s4 = "abcdefghi";
        char[] buf = new char[5];
        buf[0] = 'a';
        buf[1] = 'b';
        s4.getChars(2, 5, buf, 2);
        ///     startIndex = 2
        //     endIndex = 5
        //     endIndex - startIndex =
        System.out.println(buf);

        // System.out.println(c2);

    }
}

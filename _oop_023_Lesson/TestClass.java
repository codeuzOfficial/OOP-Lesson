package code_uz._oop_023_Lesson;

public class TestClass {


    public String a = "A";
    public static String b = "B";
    public static String s;


    static {
        s = "S";
        System.out.println("Block");
    }


    public TestClass() {
        System.out.println("Constructor");
    }

}

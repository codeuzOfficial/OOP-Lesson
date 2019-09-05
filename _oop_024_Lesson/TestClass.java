package code_uz._oop_024_Lesson;

public class TestClass {

    public String a = "A";
    public static String b = "B";
    public static String s = show();


    static {
        //s = show();
        // System.out.println("Block");
    }


    public TestClass() {
        //   System.out.println("Constructor");
    }


    public String prit() {
        /* .... */
        System.out.println(this.a);

        return "ss";
    }

    public static String show() {
        // super;
      //  System.out.println(this.a);

        return "S";
    }


}

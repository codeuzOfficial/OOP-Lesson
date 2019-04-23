package code_uz._oop_025_Lesson;

public class TestClass {

    public String a = "A";
    //  public static String b = "B";

    private static int count = 0; // 123


    /**
     *   static
     *   ----  1. non obj ----
     *     2. in static block
     *     3. in static method
     *
     *
     *
     * */

    // public/private

    static {
        // count = 1;
    }


    public TestClass() {
        count++;
    }


    public static int getCount() {
        return count;
    }


}

package code_uz._oop_043_Lesson;

/**
 * OOP
 * _043_Lesson
 */
public class Main {

    public static void main(String[] args) {
        // generic

        GenericTest genericTest1 = new GenericTest();

        genericTest1.show(new String("123"));
        genericTest1.show(new Integer(123));

        genericTest1.show(123);
        genericTest1.show("123");


//        genericTest1.setVarName("123");
//        System.out.println(genericTest1.getVarName());
//
//        GenericTest<Integer> genericTest2 = new GenericTest();
//        genericTest2.setVarName(new Integer(123));
//        System.out.println(genericTest2.getVarName());
//
//
//        GenericTest<Long> genericTest3 = new GenericTest();
//        genericTest3.setVarName(new Long(123));
//        System.out.println(genericTest3.getVarName());

    }
}

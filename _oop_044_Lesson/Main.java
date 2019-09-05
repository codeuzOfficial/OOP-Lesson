package code_uz._oop_044_Lesson;


/**
 * OOP
 * _044_Lesson
 */
public class Main {


    public static <T extends Number> double sum(T[] elements) {
        double sum = 0;
        for (T t : elements) {
            sum += t.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        // generic

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double dobleArray[] = {1.0, 2.0, 3.0, 4D, 5D};
        System.out.println(sum(intArray));


        //   GenericTest genericTest1 = new GenericTest();

        //   genericTest1.setVarName(123D);
        //  System.out.println(genericTest1.getVarName());

        //   genericTest1.show(new String("123"));

        //   genericTest1.show(new Student());
//
//        genericTest1.show(123);
//        genericTest1.show("123");


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

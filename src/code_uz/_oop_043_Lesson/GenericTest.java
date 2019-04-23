package code_uz._oop_043_Lesson;

public class GenericTest {

//    private T varName;
//
//    public void setVarName(T varName) {
//        this.varName = varName;
//    }
//
//    public T getVarName() {
//        return varName;
//    }


    public <T> T show(T element) {

        System.out.println(element);
        return element;
    }


}

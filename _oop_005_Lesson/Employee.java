package code_uz._oop_005_Lesson;


public class Employee {

    String firstName; // ismi
    String lastName; // familiyasi


    public void show() {
        System.out.println("Employee");
    }


    public String getDetail() {
        return "SALOM";
    }

    @Override
    public String toString() {
        return "SALOM 2";
    }
}

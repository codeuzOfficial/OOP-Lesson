package code_uz._oop_007_Lesson;

import code_uz._oop_007_Lesson.Employee;

/**
 * OOP
 * _007_Lesson
 */
public class Main {

    public static void main(String[] args) {
        // write your code here

        // getter/setter

        Employee employee = new Employee();

        // employee.firstName = "Ali";
        //employee.lastName = "Aliyev";

        employee.setFirstName("Ali");
        employee.setLastName("Aliyev");

        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee);


    }
}

package code_uz._oop_029_Lesson;

public class Person {

    private String name;
    private String surname;
    private int age;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        System.out.println("Person");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return this.name + "  " + this.surname + " " + this.age;
    }
}

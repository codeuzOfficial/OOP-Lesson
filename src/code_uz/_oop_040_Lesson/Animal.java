package code_uz._oop_040_Lesson;

public class Animal {

    private String name;


    public Animal() {
        this("DOG");
    }


    private Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}

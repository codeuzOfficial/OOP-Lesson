package code_uz._oop_036_Lesson;

/**
 * OOP
 * _036_Lesson
 */
public class Main {

    public static void main(String[] args) {
        // polymorphism

        PlayGame game = new CarGame();

        game.start();
        game.jump();

    }
}

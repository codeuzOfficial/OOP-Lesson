package code_uz._oop_037_Lesson;


/**
 * OOP
 * _037_Lesson
 */
public class Main {

    public static void main(String[] args) {
        // polymorphism


        MarioGame game = new SuperMarioGame();

        game.start();
        game.jump();

    }
}

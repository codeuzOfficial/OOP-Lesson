package code_uz._oop_030_Lesson;

public class CarGame implements GameKeyboard {

    @Override
    public void up() {
        System.out.println("Gaz");
    }

    @Override
    public void right() {
        System.out.println("to right");
    }

    @Override
    public void left() {
        System.out.println("to left");
    }

    @Override
    public void down() {
        System.out.println("to back");
    }
}

package code_uz._oop_030_Lesson;

public class MarioGame implements GameKeyboard {

    @Override
    public void up() {
        System.out.println("Sakrash");
    }

    @Override
    public void right() {
        System.out.println("oldinga harakatlanish");
    }

    @Override
    public void left() {
        System.out.println("orqaga harakatlanish");
    }

    @Override
    public void down() {
        System.out.println("!!!");
    }
}

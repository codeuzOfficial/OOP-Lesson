package code_uz._oop_031_Lesson;

public interface GameKeyboard {


    public static final int n = 5;

    void up();

    void right();

    void left();

    void down();


    default void show(int n) {

    }


}

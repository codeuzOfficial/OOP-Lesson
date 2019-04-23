package code_uz._oop_032_Lesson;

public interface GameKeyboard extends TestInter {

    void up();

    void right();

    void left();

    void down();


    default void show() {
        System.out.println("SHOW");
    }

    ///  void print();


//    @Override
//    void print();


}

package code_uz._oop_012_Lesson;

/**
 * Created by Bigman on 21.06.2018.
 */
public class Contact {

    private String first; // ismi
    private String last; // familiyasi
    private String number; // tel_num


    public Contact() {

    }


    public Contact(String first, String last, String number) {
        this.first = first;
        this.last = last;
        this.number = number;
    }


    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
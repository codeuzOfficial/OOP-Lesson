package code_uz._oop_011_Lesson;


public class PhoneBook {

    private String name;

    private int currentIndex = 0; // hozirgi index
    private Contact[] contactArray = new Contact[5];

    /**
     * Berilgan ism orqali yangi telefon daftarchasi yaratish
     * <p>
     * Create a new phonebook with given name
     */
    public PhoneBook(String name) {
        this.name = name;
    }

    /**
     * Telefon daftarchani ismini return qiling
     * <p>
     * Return the phonebook name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Yangi kantakni ohiriga qo'shing
     * <p>
     * Insert a new contact at the end
     */
    public void add(String first, String last, String number) {

        Contact contact = new Contact(first, last, number);
        this.contactArray[currentIndex] = contact;
        this.currentIndex++;

//        contact.setFirst(first);
//        contact.setLast(last);
//        contact.setNumber(number);


    }

    /**
     * Birinchi kantakni return qiling
     * <p>
     * Return the first contact
     */
    public String first() {
        return null;
    }

    /**
     * i-chi kantakni return qiling (birinchi kantakni 1 dan boshlangan deb oling)
     * Return the i-th contact (supposing that first index is 1)
     */
    public String get(int i) {
        return null;
    }

    /**
     * Barcha kantaklarni (ro'yhatini) String ko'rinishida jo'nating
     * harbir kantak ", " bilan ajratilgan va
     * ro'yhat "(" boshlanib ")" tugashi kerak
     * <p>
     * Return a string containing the list of textual
     * representation of all contacts, separated by  ", ".
     * List starts with "("and ends with ")"
     */
    public String toString() {
        return null;
    }

    /**
     * text ning qiymati bor bo'lgan kantakni String ko'rinishini jo'nating
     * <p>
     * Return the textual representation of first contact containing "text"
     */
    public String find(String text) {
        return null;
    }
}

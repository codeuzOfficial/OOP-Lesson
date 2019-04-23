package code_uz._oop_015_Lesson;

public class PhoneBook {

    private String name;

    private int currentIndex = 0; // hozirgi index
    private int maxIndex = 5;
    private Contact[] contactArray = new Contact[maxIndex]; // 0...4  [null,null,null,null,null]

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


        if (this.currentIndex == this.maxIndex) {
            this.maxIndex += 5;

            Contact[] newContactArray = new Contact[this.maxIndex];

            for (int i = 0; i < this.currentIndex; i++) {
                newContactArray[i] = this.contactArray[i];
            }

            this.contactArray = newContactArray;

        }

        Contact contact = new Contact(first, last, number);
        this.contactArray[currentIndex] = contact;  // 5
        this.currentIndex++;
    }


    public void show() {
        for (int i = 0; i < this.currentIndex; i++) {
            Contact contact = this.contactArray[i];
            System.out.println(contact.getFirst());
        }
    }

    /**
     * Birinchi kantakni return qiling
     * <p>
     * Return the first contact
     */
    public String first() {
        Contact contact = this.contactArray[0];
        if (contact != null) {
            return contact.toString();
        }
        return "!!!";
    }

    /**
     * i-chi kantakni return qiling (birinchi kantakni 1 dan boshlangan deb oling)
     * Return the i-th contact (supposing that first index is 1)
     */
    public String get(int i) {
        if (i > 0) {
            return this.contactArray[i - 1].toString();
        }
        return "!!!";
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
        String text = "( ";
        for (int i = 0; i < this.currentIndex; i++) {
            Contact contact = this.contactArray[i];
            text += contact.toString() + ", ";
        }

        return text + ") ";
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

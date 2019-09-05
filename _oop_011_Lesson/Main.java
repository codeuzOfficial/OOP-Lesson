package code_uz._oop_011_Lesson;

/**
 * OOP
 * _011_Lesson
 */
public class Main {

    public static void main(String[] args) {

        /**                          *** PhoneBook ***
         Kontaktlarni o'z ichiga olgan telefon kitoblarini boshqarish uchun Java (Dasturini)(ilovasini) tuzing.
         Telefon Kitobi yaratilganda uning nomi bo'ladi, va getName() metodi orqali uning nomini olish mumkin.
         <p>
         Yangi kantak add() metodi orqali qo'shiladi va u 3 ta o'zgaruvchi qabul qiladi: ismi,familiyasi va telefon raqami
         <p>
         Birinchi kantakni first() metodi orqali olish mumkin. Method birinchi kantakni String ko'rinishini return qiladi,
         ( ismi, familiyasi va telefon raqamini return qiladi orasida bosh joy bor).
         <p>
         Har bir kontakt ro'yxatdagi o'z pozitsiyasi bilan belgilanadi, kiritilgan tartibida.
         get() metodi kantakni pozitsiyasi bo'yicha returin qiladi. Method bitta o'zgaruvchi kabul qiladi
         va shu pozitsiyada turgan kantakni String ko'rinishini return qiladi. Eslatma ro'yhat 1 dan boshlanadi.
         <p>
         Ro'yhatni String ko'rinishini tostring() metodi orkali olish mumkin.
         Bunda har bir kantakni String ko'rinishi bo'ladi va ular ", " bilan ajratilgan.
         Ro'yhat "( " bilan boshlangan bo'lib ") " bilan tugaydi.
         <p>
         find() metodi birinchi topilgan kantakni String ko'rinishini return qiladi.
         Method bitta bitta o'zgaruvchi qabul qiladi.
         O'zgaruvchi kantakning ismi, familiyasi yoki telefon raqami parchasi bo'lishu mumkin.

         **/

        PhoneBook phoneBook = new PhoneBook("Birinchi kitob");

        System.out.println(phoneBook.getName());

        phoneBook.add("Ali", "Aliyev", "12345");
        phoneBook.add("Vali", "Valiyev", "23242");

    }
}

package day11_stringManipulations;

public class C06_endsWith {
    public static void main(String[] args) {
         /*
        SORU: Kullanicidan email adresini  isteyin;
            - mail @gmail.com icermiyorsa "Lutfen gmail adresi giriniz.",
            - @gmail.com ile bitiyorsa "Email adresiniz kaydedi."
            - @gmail.com ile bitmiyorsa "Lutfen yazimi kontrol edin." yazdirin.
         */

        String email="kfvnk@gmail.com";

        if (!email.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresi giriniz");
        }else if (email.endsWith("@gmail.com")){
            System.out.println("Sifreniz kaydedildi.");
        }else{
            System.out.println("Lutfen yazimi kontrol ediniz");
        }

    }
}

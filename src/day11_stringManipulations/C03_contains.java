package day11_stringManipulations;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {

        /*
        SORU: Kullanicidan email adresini  isteyin;
            - mail @gmail.com icermiyorsa "Lutfen gmail adresi giriniz.",
            - @gmail.com ile bitiyorsa "Email adresiniz kaydedi."
            - @gmail.com ile bitmiyorsa "Lutfen yazimi kontrol edin." yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen email adresi giriniz");
        String email=scan.nextLine();

        if (!email.contains("@gmail")){
            System.out.println("Lutfen gmail adresi giriniz.");
        } else if (email.lastIndexOf("@gmail.com")==(email.length()-10)){  // @gmail.com'un karakter sayisindan bulduk
            System.out.println("Email adresiniz kaydedildi.");
        } else{
            System.out.println("Lutfen yazimi kontrol edin.");
        }

    }
}

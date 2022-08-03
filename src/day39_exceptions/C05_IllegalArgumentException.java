package day39_exceptions;

import java.util.Scanner;

public class C05_IllegalArgumentException {
    public static void main(String[] args) throws InterruptedException {
        /*
        SORU: Kullanicidan yasini girmesini isteyin. Kodunuzu kullanici sifirdan kucuk bir sayi
        girerse Exception verecek sekilde bir kod yazin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();

        try {
            if (yas<0){
                throw new IllegalArgumentException(); // Bu kodla yas bilgisini istedigimiz deger disinda olursa exception
                                                     // vermesini sagladik
            }else {
                System.out.println("yas = " + yas);
            }
        } catch (IllegalArgumentException e) { // Verdirdigimiz exception'i handle etmis olduk.
            e.printStackTrace();
            System.err.println("Yas negatif olamaz"); // Java'nin verdigi exception bilgilerine ilave olarak
            //biz de istedigimiz bilgiyi yazdirdik. System.err.println ile bizim yazdigimiz bilgi de kirmizi
            //renkli yazdirmis olduk.
        }

        Thread.sleep(5000); // Ya bekleyemezsem diye CT Exception verir.
        // Method signature'ina throws InterruptedException ekleyerek olayin farkinda oldugumuzu belirttik.



    }
}

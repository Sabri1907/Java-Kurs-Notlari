package day14_methodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {
        /*
        SORU: Input olarak verilen isim ve soyismi ilk harfi buyuk
              geriye kalan harfler * olacak sekilde yazdiran bir method olusturun.
        ORNEK: I****** K******
         */

        String isim="Enes";
        String soyisim="Yilmazturk";

        ismiGizle(isim,soyisim); //E*** Y*********
        C02_MethodCreation.rakamlariTopla(999); //27 =>Ornek olsun diye method cagirdik

        /*
        NOT: Method icinde olusturdugumuz variable'i baska yerde kullanamayiz,
        sadece o method icinde kullanabiliriz.
         */
    }

    public static void ismiGizle(String isim, String soyisim) {

        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");

        System.out.println(isim+" "+soyisim);
    }
}

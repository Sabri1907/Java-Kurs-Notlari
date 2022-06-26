package day12_stringManipulations;

public class C02_replaceAll {
    public static void main(String[] args) {

        /*
        replace() String'deki girilen butun degerleri degistirir.
        replaceAll()'daki all'un amaci ayni ozellikteki tum karakterleri kapsamasidir.
        (Rakam,harf, ozel karakterler vb.)

         */
         String str= "1Bu2gu3n Ja*va- cok g3uz/el";

         // SORU: str'i "Bugun Java cok guzel" hal'ne getirir.
         // Bu soruda butun sayilari ve butun ozel karakterleri silerek 2 adimda istenen cumleyi yazdirabiliriz.

        /*
        Tum karakterleri sildigimizde space'ler de siliniyor.
        Space'i korumak icin en basta onlarin yerine replace() ile cumlede bulunmayacak
        bir String koyup en son bunlari da space'lerle tekrar degistiririz.
         */

        str=str.replace(" ","qazwsx");
        System.out.println(str);
        str=str.replaceAll("\\W", ""); //Ozel Karakterlerden kurtulduk
        System.out.println(str);

        str=str.replaceAll("\\d",""); // Rakamlardan kurtulduk
        System.out.println(str);

        str=str.replace("qazwsx"," "); // Ozel karakter ve spacelerden kurtulduktan
                                                       // sonra space'leri geri yerine koyduk.
        System.out.println(str);

    }
}

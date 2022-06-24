package day10_stringManipulation;

public class C05_length {
    public static void main(String[] args) {

         String str="Java ogren, isi kap";

        System.out.println(str.length()); // str'in karakter sayisini dondurur. => 19

        System.out.println(str.charAt(str.length()-1)); // Son karakteri verir. => p

        System.out.println(str.charAt(str.length()-3)); // Sondan 3'uncu karakteri verir => k

        /*
        Java'da Null Pointer (isaretleyici) bir deger degil,
        karsisina yazilan variable'in hic bir deger almadiginin isaretleyicisidir.
         */

        String str2=""; // str2'ye bir deger atanmis midir = EVET
                        // Atanan deger nedir? = Hiclik

        System.out.println(str.length()); // 0

        String str3=null; // str2'ye bir deger atanmis midir = HAYIR
                          // null bu deger atamamayi isaret etmektedir.

        System.out.println(str3.length());  // bir deger atanmamis ki nasil uzunlugu olsun ?
        // NullPointerException olarak hata verir


    }
}

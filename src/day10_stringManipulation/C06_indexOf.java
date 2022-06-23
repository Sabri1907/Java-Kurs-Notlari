package day10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";

        System.out.println(str.indexOf("o")); // 5
        System.out.println(str.indexOf('g')); // 6
        System.out.println(str.indexOf("t")); // -1

        /*
        NOT: indexOf() integer sonuc dondurur. Sorgulanan deger ilgili String'de olmadigi zaman
        Java yok demesi lazim. Bunu da -1 dondurerek saglamistir.
        Ozetle indexOf() methodu -1 donduruyorsa aranan deger ilgili String'de yok demektir.
         */

        String str5="kdsjknjavbkjabvdvkcCHDCJKDJDVNdkvLLJCJKbjc";

        //SORU: str5'de p harfi var midir?

        if (str5.indexOf('J')==-1){
            System.out.println("str5'de istenen deger KULLANILMAMIS");
        } else{
            System.out.println("str5'de istenen deger kullanilmistir");
        }
    }
}

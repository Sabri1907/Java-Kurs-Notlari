package calismaSorulari;

public class Q12_ForLoop_BasamakToplamiBulma {
    public static void main(String[] args) {
        /*
        SORU: Verilen bir tam sayinin basamaklari toplamini yazdiran
              bir method yaziniz.
        ORNEK: Input    : 6357
               Output   : 21
         */

        int sayi=153256547;

        basamakToplaminiBul(sayi);



    }

    public static void basamakToplaminiBul(int sayi) {

        String basamakSayisi=""+sayi; // Girilen sayinin basamak sayisini bulmak icin int'i String'e cevirdik.
                                      // Ve length() methodu kullanarak basamak sayisini bulduk.
        int toplam=0;

        for (int i = basamakSayisi.length(); i >=0 ; i--) {
            toplam+=sayi%10;
            sayi/=10;

        }

        System.out.println("basamakSayisi = " + basamakSayisi.length());

        System.out.println("Girilen sayinin basamaklari toplami: "+toplam);
    }
}

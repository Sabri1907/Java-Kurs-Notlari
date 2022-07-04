package calismaSorulari;

public class Q08_ForLoop_UnluHarfSayisiniBulma {
    public static void main(String[] args) {
         /*
        SORU: Bir stringdeki tüm ünlüleri saymak için bir Java yöntemi yazın.
              Düzenleyiciye gidin
              Test Verileri:
              Şu dizeyi girin: w3resource
              Beklenen Çıktı:
              Dizideki Ünlülerin Sayısı: 4
         */

        String str="Java ile baglan hayata";

        unluHarfSayisiniBul(str);
    }

    public static void unluHarfSayisiniBul(String str) {

        int sayac=0;

        for (int i = 0; i <=str.length()-1 ; i++) {
            if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'
                || str.charAt(i)=='o' || str.charAt(i)=='u') {
                sayac++;
            }
        }
        System.out.println("Girilen String'deki Unlu Sayisi: "+sayac);
    }
}

package calismaSorulari;

public class Q10_ForLoopKelimeSayisiBulma {
    public static void main(String[] args) {
        /*
         5. Bir String'deki tüm kelimeleri saymak için bir Java methodu yazın. Düzenleyiciye gidin
        Test Verileri:
        Dizeyi girin: Hızlı kahverengi tilki tembel köpeğin üzerinden atlar.
        Beklenen çıktı:
        Dizedeki kelime sayısı: 7

         */

        String str="Hızlı kahverengi tilki tembel köpeğin üzerinden atlar yoksa ne yapacagini bilemez.";

        kelimesayisiniBul(str);


    }

    public static void kelimesayisiniBul(String str) {
        int sayac =1;
        for (int i = 0; i <=str.length()-1 ; i++) {

            if (str.charAt(i)==' '){
                sayac++;
            }

        }
        System.out.println("Verilen String'deki kelime sayisi: "+sayac);
    }


}

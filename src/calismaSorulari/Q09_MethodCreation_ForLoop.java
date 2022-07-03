package calismaSorulari;

public class Q09_MethodCreation_ForLoop {
    public static void main(String[] args) {

        /*
        SORU: Bir stringdeki tüm ünlüleri saymak için bir Java yöntemi yazın.
              Düzenleyiciye gidin
              Test Verileri:
              Şu dizeyi girin: w3resource
              Beklenen Çıktı:
              Dizideki Ünlülerin Sayısı: 4
         */
        String str = "yasa java yasa cok yasa uiei";
        String sesliler = "aeiou";

        unluHarfBul(str, sesliler);
    }

    public static void unluHarfBul(String str, String sesliler) {
        int sayac = 0;

        for (int i = 0; i <= str.length() - 1; i++) {

            for (int j = 0; j <= 4; j++) {

                if (str.charAt(i) == sesliler.charAt(j)) {

                    sayac++;
                }
            }
        }
        System.out.println("Unlu Harfler Sayisi: "+sayac);
    }
}

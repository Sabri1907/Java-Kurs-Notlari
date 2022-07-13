package day21_Arrays;

public class C01_Array_MaxSayiyiBulma {
    public static void main(String[] args) {
        // SORU1- Verilen bir int array'deki en buyuk sayiyi yazdiran bir method olusturun.

        int[] sayilar={3,5,7,1,4,9,5,2};

        maxSayiyiYazdir(sayilar);
    }

    public static void maxSayiyiYazdir(int[] sayilar) {
        int maxSayi=sayilar[0]; // Deger atamazsak maxSayi variable'ini kullanmmayaiz.
        // 0 atarsak butun sayilar negatif oldugunda dogru sonuc vermez. Array'in 0'inci indeksini
        // aldik boylece yanlis yapma ihtimalini onlemis olduk.

        for (int i = 1; i <sayilar.length ; i++) { // i 1'den basladi cunku 0'inci indeksi maxSayiya tanimlamistik.
                                                    // O yuzden kontrol etmeye gerek yok.

            if (sayilar[i]>maxSayi){
                maxSayi=sayilar[i];
            }

        }

        System.out.println("Array'deki en buyuk sayi: "+maxSayi);
    }
}

package day21_Arrays;

import java.util.Arrays;

public class C06_ArrayeElemanEkleme {
    public static void main(String[] args) {
        // C05'deki methodu kullanarak Array'e eleman ekleyelim.

        String [] takimListesi={"Alex","Lefter"};
        String eklenecekIsim="Arda Guler";

       takimListesi= C05_ArrayeElementEkleme.elemanEkle(takimListesi,eklenecekIsim); // Kullanabilmemiz icin atama
        // yapmamiz ya da yazdirmamiz gerekli.

        System.out.println(Arrays.toString(takimListesi)); // Sonucu gormek icin yazdirdim.

    }
}

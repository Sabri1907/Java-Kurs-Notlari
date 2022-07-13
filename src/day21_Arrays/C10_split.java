package day21_Arrays;

import java.util.Arrays;

public class C10_split {
    public static void main(String[] args) {
        /*
        split() methodu bir array methodu degil, String methodudur. Ama array dondurdugu icin
        bu konuda anlatiliyor.

        split() methodu ile bir String'i istedigimiz parcalara ayirip array'a donusturyoruz.

        Sonucunu gormek icin ya bir array'a atamamiz ya da yazdirmamiz gerekir.
         */

        String str="Java, ne kadar guzel.";

        String[] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); // [Java, ne, kadar, guzel]

        String[] kelimelerNe=str.split("ne");
        System.out.println(Arrays.toString(kelimelerNe)); // [Java ,  kadar guzel]

        String[] kelimelerE=str.split("e");
        System.out.println(Arrays.toString(kelimelerE)); // [Java n,  kadar guz, l]

        String[] karakterler=str.split("");
        System.out.println(Arrays.toString(karakterler));
    }
}

package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {
        // SORU-5: Verilen bir array'e yeni bir element ekleyen bir method olusturun

        //NOT: Var olan bir array'in boyutunu degistiremeyiz.

        String [] sinifListesi={"Sabri","Ayse","Gul"};
        String eklenecekIsim="Yusuf Kerem";

        System.out.println(Arrays.toString(sinifListesi));

        sinifListesi=elemanEkle(sinifListesi,eklenecekIsim);

        System.out.println(Arrays.toString(sinifListesi));
    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {
        String [] yeniSinifListesi=new String[sinifListesi.length+1];

        //Eski listeden 1 eleman fazla uzunlukta yeni bir array olusturduk.

        for (int i = 0; i <sinifListesi.length ; i++) {
            yeniSinifListesi[i]=sinifListesi[i];

        }
        // Oncelikle eski listedeki tum elemanlari yeni listeye atadik

        yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekIsim;

        // En sonunda eklenecek ismi yeni array'in son indeksine atadik.



        return  yeniSinifListesi;
    }
}

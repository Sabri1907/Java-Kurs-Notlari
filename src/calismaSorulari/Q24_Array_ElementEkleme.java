package calismaSorulari;

import java.util.Arrays;

public class Q24_Array_ElementEkleme {
        /*
        SORU: Verilen bir array’e yeni bir element ekleyen method olusturun
         */

    public static void main(String[] args) {

        int [] sayilar={1,3,5,78,99,10};
        int eklenecekElement=77;

        arrayeElementEkle(sayilar,eklenecekElement);
    }

    public static void arrayeElementEkle(int[] sayilar, int eklenecekElement) {
        int sayilar2[]=new int[sayilar.length+1];

        for (int i = 0; i <sayilar.length ; i++) {

            sayilar2[i]=sayilar[i];
        }

        sayilar2[sayilar2.length-1]=eklenecekElement;

        System.out.println("Array'e element eklendikten sonraki hali: "+ Arrays.toString(sayilar2));

    }
}

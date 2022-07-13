package day21_Arrays;

import java.util.Arrays;

public class C09_binarySearch {
    public static void main(String[] args) {
        /*
        binarySearch methodu siralanmis array'de aradigimiz elementin index'ini dondurur.

        Ya aradigimiz element array'da yoksa?

        HATIRLATMA: String'de indexOf() bize olmayan elementler icin -1 donduruyordu.

        Aradigimiz element array'da yoksa; Java hem olmadigini hem de olsaydi nerede olacagini bize dondurur.
        Olmadigini ifade etmek icin - kullanir, olsaydi nerede olacagini belirtmek icin
        index degil siralama kullanir.

        OZETLE binarySearch aranan deger array'da varsa index numarasini, yoksa -sira numarasini dondurur.

        ONEMLI NOT: sort() methodu siralamayi kalici olarak degistirir.

         */

        int[] sayilar= {3,7,15,4,77,10};
        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar)); // [3, 4, 7, 10, 15, 77]

        System.out.println(Arrays.binarySearch(sayilar,4)); // 1

        System.out.println(Arrays.binarySearch(sayilar,15)); // 4

        System.out.println(Arrays.binarySearch(sayilar,11)); // -5

        System.out.println(Arrays.binarySearch(sayilar,6)); // -3

        System.out.println(Arrays.binarySearch(sayilar,-100)); // -1


    }
}

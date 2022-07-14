package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {
        /*
    Binary Search: Java'da eleman aramanin kisa yoludur. Ancak Binary Searc'un calismasi icin once Array'in
                   sirali hale getirilmesi gerekir.

    =>Eger siralama yapmadan Binary Search yaparsaniz sonucu bulamayabilir veya yanlis bulabilir.
     */

        String[] harfler={"Y","B","H","F","S"};

        String arananHarf="Y";
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf));


        // binarySeach bize aradigimiz elemanin index'ini dondurur.

        /*
        binarySearch aramaya ortadan baslar. Aranan deger ortadaki degerden kucukse sola dogru arar,
        buyukse saga dogru arar. O yuzden array'de bulunan bir degeri bulamayabilir veya yanlis sonuc dondurebilir.
        O yuzden emin olmak icin once sort yapmaluyiz.
         */

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf));


    }



}


package day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {
    public static void main(String[] args) {

        /*
        ONEMLI NOT: Birden fazla element iceren array ve arraylist gibi yapilarda da
        passByValue gecerlidir.
            Eger method'da array veya list'in kendisi degistirilirse passByValue ozelligi sebebiyle
          Java degisen degeri degil array veya list'in orjinal degerini alir.

            Ancak array veya list degistirilmeden sadece icindeki elemanlar degistirilirse
          Java obje degismedigi icin (referans ayni), ayni array veya list'i bize dondurur.
          Ancak icindeki elementler degismis olacaktir.
         */

        /*
            Verilen 4 elemanli bir arrayi method'a gonderelim.
        Method'da yeni 3 elemanli bir array atayip bu yeni array'e rastgele 100'den
        kucuk 3 sayi atayalim. Method da arryi yazdialim.

        Main method'da da methodcall'dan sonra yeniden array'i yazdiralim.
         */

        int arr[]={3,5,8,10};

        arryiDegistir(arr);

        System.out.println("Method Call'dan Sonra Main Method Icinde Array: "+ Arrays.toString(arr));
        System.out.println(arr); // [I@26ba2a48 (Referans method icindekiyle farkli)
    }

    public static void arryiDegistir(int[] arr) {
        arr=new int[3];

        Random rnd=new Random();

        arr[0]=rnd.nextInt(100);
        arr[1]=rnd.nextInt(100);
        arr[2]=rnd.nextInt(100);

        System.out.println("Method icinde Array: "+ Arrays.toString(arr));
        System.out.println(arr); // [I@26ba2a48 (Referans oncekiyle farkli)


    }
}

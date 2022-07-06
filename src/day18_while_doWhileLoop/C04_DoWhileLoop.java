package day18_while_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*
        SORU: Kullanicidan tam sayilari alin. Kullanici cift sayi girdigi muddetce
        sayilari yazdirin.
        Tek sayi girdiginde islemi bitirin.
         */

        System.out.println("========while ile Yapilisi=========");

        /*
        loop'larda kullanacagimiz variable'lari loop'tan once olusturmaliyiz.
        while loop'ta loop'tan once olusturdugumuz bu variable'a atayacagimiz
        degeri iyi disinmemiz gereekiyor. Cunku uygun deger atanmazsa while loop body'si hic calismaz.
         */
        Scanner scan=new Scanner(System.in);
        int sayi=0;


        while(sayi%2==0){
            System.out.println("Lutfen bir sayi giriniz");
            sayi =scan.nextInt();
           if (sayi%2==0){
               System.out.println("Girilen sayi cift : "+sayi);
           }else{
               System.out.println("Girilen sayi tek benden bukadar");
           }
        }

        System.out.println("======== Do while Loop ile Yapilisi=========");

        /*
        do while loop'da onceden olusturulan variable'a hangi deger atandiginin hic bir onemi yoktur,
        kodumuz ilk seferde mutlaka calisir.
         */

        /*
        do while loop'un Dezavantaji: ilk calisma kontrol yapilmadan oldugu icin
        loop body'sinde yanlis bir islem yapilmamasina dikkat etmek gerekir.
         */

        do{
            System.out.println("Lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            if (sayi%2==0){
                System.out.println("Girilen sayi cift : " + sayi);
            }else{
                System.out.println("Girilen sayi tek, benden bu kadar");
            }
        }while(sayi%2==0);

    }
}

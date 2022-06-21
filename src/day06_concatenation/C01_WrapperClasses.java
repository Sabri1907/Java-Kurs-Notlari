package day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {

    public static void main(String[] args) {

        /*
        Wrapper class Java'nin hazir methodlari kullanabilmemiz icin primitive
        data turlerinin herbiri icin actigi class'lardir.

        int==>Integer (Wrapper Class)
        char==>Character (Wrapper Class)
        Diger primitive data turlerinin Wrapper Class'lari ayni isimdedir sadece bas harfleri buyuktur.
         */

        String str ="Java ile Hayat Ne Guzel";

        System.out.println(str.toUpperCase()); // JAVA ILE HAYAT NE GUZEL

        boolean guzelMi=true;
        //guzelMi.  boolean primitive oldugundan hazir method'u bulunmuyor.

        Boolean buGuzelMi=true;
        buGuzelMi.toString();


        System.out.println(Short.MIN_VALUE); // -32768
        System.out.println(Short.MAX_VALUE); // 32767


        String ogrNo="123456";

        /*
        Kullanicidan bir sifre isteyin.
        Eger sifre sadece rakamlardan olusuyorsa kabul etmeyelim.
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sifre giriniz: ");
        String sifre=scan.nextLine();
        Integer sifreSayi=Integer.parseInt(sifre);

        System.out.println("Girilen Sifre: "+(sifre+3));// 12345 icin sonuc 123453 olur.
        System.out.println("Integer Sifre: "+ (sifreSayi+3)); // 12345 icin sonuc 12348 olur.

        /*
        Wrapper Class'lar ileride kullanacagimiz pek cok faydali method icerir.
         */


    }
}

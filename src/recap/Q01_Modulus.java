package recap;

import java.util.Scanner;

public class Q01_Modulus {
    public static void main(String[] args) {
        /*
         *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli sayi giriniz");
        int sayi=scan.nextInt();

        int ilkIki=sayi/1000;
        int sonIki=sayi%100; // 100'e bolumunden kalani verir.

        int ilkIkiToplam= (ilkIki/10)+(ilkIki%10);
        System.out.println("ilkIkiToplam = " + ilkIkiToplam);
        int sonIkiToplam=(sonIki/10)+(sonIki%10);
        System.out.println("sonIkiToplam = " + sonIkiToplam);

        System.out.println("Sayilarin Toplami :"+ (ilkIkiToplam+sonIkiToplam));




    }


}

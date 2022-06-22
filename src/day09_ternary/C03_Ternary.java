package day09_ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        /*
        SORU: Kullanixidan bir sayi isteyin. Sayi pozitifse sayiyi yazdirin.
        Sayi 0 veya negatifse; bir sayi daha isteyin ve iki sayinin carpimini yazdirin.
         */

        //Once If'le yapalim:

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        double sayi=scan.nextDouble();


        if (sayi>0){

            System.out.println(sayi);

        }else {
            System.out.print("Lutfen bir sayi daha giriniz: ");
            double sayi2=scan.nextDouble();
            System.out.println(sayi*sayi2);
        }

        /*
        Eger If Else icerisinde yeni kodlar varsa;
        TERNARY ILE YAPMAMIZ MUMKUN DEGILDIR.
         */


    }
}

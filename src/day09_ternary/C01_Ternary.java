package day09_ternary;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        // SORU: Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin.

        //NOT: MUTLAK DEGER => |5| = 5
        //                     |-5| = -(-5) = 5 Bu mantigi bilmek soruyu cozmek icin yeterli.

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        double sayi=scan.nextDouble();

        System.out.println(sayi>=0?sayi:(-1*sayi));

    }


}

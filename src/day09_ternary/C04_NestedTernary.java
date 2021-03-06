package day09_ternary;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {

        /*
        SORU: Kullanicidan bir harf isteyin.
        Kucuk harf ise konsola "Kucuk Harf",
        Buyuk harfse konsola "Buyuk Harf"
        Hic biri degilse "Girdiginiz karakter harf degil" yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir harf giriniz: ");
        char harf=scan.next().charAt(0);

         /*
        String sonuc= (harf>='a' && harf <='z') ? ("Kucuk Harf") :
                ("Buyuk harf veya gecersiz karakter");
         */

        String sonuc= (harf>'A' && harf<'Z') ? ("Buyuk Harf") :
                (harf>'a' && harf<'z')? ("Kucuk Harf") : ("Gecersiz Karakter");

        String sonuc2= harf>='a' && harf <='z' ? "Kucuk Harf" :
                harf>='A' && harf<='Z'  ? "Buyuk harf" : "Gecersiz karakter";

        System.out.println(sonuc);
        System.out.println(sonuc2);
    }
}

package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplami {

    public static void main(String[] args) {
        // Kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli pozitif bir tam sayi giriniz: ");
        int sayi=scan.nextInt(); //5267
         int birlerBasamagi=0;
         int rakamlarToplami=0;
         int ilkGirilenSayi=sayi;

         // Su anda sayi=5267, birlerbasamagi=0, rakamlartoplami=0;


         birlerBasamagi=sayi%10; //7
         rakamlarToplami+=birlerBasamagi;
         sayi /= 10; // 7'den kurtulduk

        //  Su anda sayi=526, birlerbasamagi=7, rakamlartoplami=7;

        birlerBasamagi= sayi%10; // 6
        rakamlarToplami+=birlerBasamagi; // 7+6=13
        sayi/=10;

        //  Su anda sayi=52, birlerbasamagi=6, rakamlartoplami=13;

        birlerBasamagi= sayi%10; // 2
        rakamlarToplami+=birlerBasamagi; // 2+13=15
        sayi/=10;//5

        //  Su anda sayi=5, birlerbasamagi=2, rakamlartoplami=15;

        birlerBasamagi= sayi%10; // 5
        rakamlarToplami+=birlerBasamagi; // 5+15=20
        sayi/=10; // 0

        //  Su anda sayi=0, birlerbasamagi=5, rakamlartoplami=20;

        System.out.println(ilkGirilenSayi +" "+ "Sayisinin Rakamlari Toplami: "+ rakamlarToplami);


    }
}

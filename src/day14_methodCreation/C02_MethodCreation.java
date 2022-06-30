package day14_methodCreation;

import day13_MethodCreation.C04_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {
        /*
        SORU: Verilen 3 basamakli bir sayinin rakamlari
              toplamini yazdiran bir method olusturalim.
         */

        int input=560;

        rakamlariTopla(input);

       // C01_MethodCreation.terstenYazdir("Mavi"); Ornek olarak diger class'dan methodlar cagirdik ve calisti
       // C04_MethodCreation.topla(685,1000);
    }

    public static void rakamlariTopla(int input) {

        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int girilenSayi=input; // Islem sonunda input 0 kalacagi icin girilen sayiyi sonra kullanmak icin kaydettik

        birlerBasamagi=input%10; // Birler basamagini aldik
        rakamlarToplami+=birlerBasamagi; // Birler basamagini rakamlar toplamina ekledik
        input/=10; // Birler basamagindan kurtulduk

        birlerBasamagi=input%10; // Birler basamagini aldik
        rakamlarToplami+=birlerBasamagi; // Birler basamagini rakamlar toplamina ekledik
        input/=10; // Birler basamagindan kurtulduk

        birlerBasamagi=input%10; // Birler basamagini aldik
        rakamlarToplami+=birlerBasamagi; // Birler basamagini rakamlar toplamina ekledik
        input/=10; // Birler basamagindan kurtulduk

        System.out.println("Girdiginiz "+girilenSayi+" sayisinin rakmalar toplami: "+rakamlarToplami);
    }
}

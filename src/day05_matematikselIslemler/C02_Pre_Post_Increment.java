package day05_matematikselIslemler;

public class C02_Pre_Post_Increment {

    public static void main(String[] args) {
        int sayi=10;

        System.out.println("Pre-Increment :" + ++sayi);//11

        /*
        Yukarida iki islem var yazdirma ve sayiyi arttirma. Once sayiyi arttirip sonra yazdirir.
        Asagida ki ornekte tam tersi durum gecerlidir.
        Pre-Post Increment ilgili variable degerini kalici olarak degistiriyor.
         */


        System.out.println("Post-Increment :" + sayi++);//11


        System.out.println("Post-Increment'dan Sonra :" + sayi);//12

        sayi++; // 13

        ++sayi; // 14


    }
}

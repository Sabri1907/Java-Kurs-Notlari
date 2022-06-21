package day08_ifStatements;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {
        /*
        Emeklilik kontrolu yapan bir program yaziniz.
            Cinsiyet olarak E (Erkek) veya K (Kadin) degiskenlerini kabul etsin.
        FArkli bir harf veya sembol girilirse hata mesaji versin.

            Emeklilik icin kadinlarda yas siniri 60, erkeklerde 65 olsun
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz\nErkek icin E, Kadin icin K giriniz: ");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz: ");
        double yas=scan.nextDouble();

        if (cinsiyet=='E'){

            if (yas<0 || yas>80){
                System.out.println("Lutfen gecerli bir yas giriniz");
            }else if (yas<65){
                System.out.println("Emekli olamazsiniz");
            }else {
                System.out.println("Emekli olabilirsiniz");
            }


        } else if (cinsiyet=='K'){

            if (yas<0 || yas>80){
                System.out.println("Lutfen gecerli bir yas giriniz");
            }else if (yas<65){
                System.out.println("Emekli olamazsiniz");
            }else {
                System.out.println("Emekli olabilirsiniz");
            }


        } else{

            System.out.println("Lutfen gecerli bir deger giriniz");
        }
    }
}

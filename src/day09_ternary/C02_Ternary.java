package day09_ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        /*
        SORU: Kullanicidan bir sayi alin. Sayi pozitifse "Sayi Pozitif" yazdirin.
              Negatifse sayinin karesini yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        double sayi=scan.nextDouble();

        /*
        Eger ternary icindeki sonuclar farkli data turlerinde ise bunu bir variable'a atama yapamayiz.
        Sadece yazdirabiliriz.
        Ornek : double sonuc=sayi>0 ? "Sayi Pozitif : (sayi*sayi);
         */

        System.out.println(sayi>0 ? "Sayi Pozitif" : (sayi*sayi));
    }
}

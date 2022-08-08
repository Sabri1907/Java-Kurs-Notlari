package practice11_interviewQuestions;

import java.util.Scanner;

public class Q03 {
    /*
    Kisaca asal sayilar sadece kendine ve 1'e bolunebilen pozitif tam sayilardir.
    1 sayisi asal sayi degildir. Cunku asal sayilarin sadece 2 pozitif tam sayi boleni olmalidir.

    1 ise sadece 1'e bolunebildigi icin sadece tek boleni vardir.
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        boolean asalMi=true;

        if (sayi>1){
            for (int i = 2; i <sayi ; i++) { // bolen sayilar
                if (sayi%i==0){
                    asalMi=false;
                    //break;
                }

            }

            if (asalMi) System.out.println(sayi+" sayisi asal sayidir");
            else System.out.println(sayi+" sayisi asal degil, asal sayi giriniz");
        }else if (sayi<0) {
            System.out.println("Negatif sayi girdiniz lutfen pozitif sayi giriniz");
        }else System.out.println(sayi+" sayisi asal degildir");

    }
}

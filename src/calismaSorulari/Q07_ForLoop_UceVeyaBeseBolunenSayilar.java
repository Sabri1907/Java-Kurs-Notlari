package calismaSorulari;

import java.util.Scanner;

public class Q07_ForLoop_UceVeyaBeseBolunenSayilar {
    public static void main(String[] args) {

        /*
        SORU: Kullanicidan 100'den kucuk bir sayi isteyin.
              1'den baslayip alinan sayiya kadar 3'e veya 5'e bolunen sayilari
              yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk bir tamsayi giriniz");
        int sayi= scan.nextInt();
        int toplam=0;

        for (int i = 1; i <= sayi; i++) {

            if (i%3==0 || i%5==0){
                System.out.print(i+" ");
                toplam+=i;

            }
            
        }
        System.out.println("toplam = " + toplam);
    }
}

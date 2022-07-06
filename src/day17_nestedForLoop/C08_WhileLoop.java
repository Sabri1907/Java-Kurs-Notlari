package day17_nestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {
        /* SORU:
         kullanicidan toplanmak uzere sayilar alin
         sayilarin toplami 500'u gecince (500 dahil)
         sayilarin toplamini ve kac sayi toplandigini su sekilde yazdirin

         13 sayi girdinz ve toplamlari 567
         */

        Scanner scan=new Scanner(System.in);
        int toplam=0;
        int sayi=0;
        int sayac=0;

        while(toplam<500 || sayac<11){
            System.out.println("Lutfen toplamak icin sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;
        }

        System.out.println(sayac + " sayi girdiniz ve toplami : " + toplam);

    }
}

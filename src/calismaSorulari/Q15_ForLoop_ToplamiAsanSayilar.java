package calismaSorulari;

import java.util.Scanner;

public class Q15_ForLoop_ToplamiAsanSayilar {
    public static void main(String[] args) {
        /*
        SORU: Kuillanicidan toplanmak uzere sayilar isteyin sayi adedi 10'u gecerse
              veya sayilarin toplami 500'u gecerse
              "Bu kadar sayi yeter"
              ".... adet sayi girdin, toplami...." yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen toplanmak uzere sayilar giriniz");
        int toplam=0;
        int sayac=0;

        for (int i = 1; i <=10 ; i++) {
            int sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;
            if (sayac==10 || toplam>500){
                System.out.println("Bukadar yeter\n"+sayac+" adet sayi girdin, toplami "+toplam);

            }

        }
    }
}


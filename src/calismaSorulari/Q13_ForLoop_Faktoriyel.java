package calismaSorulari;

import java.util.Scanner;

public class Q13_ForLoop_Faktoriyel {

    public static void main(String[] args) {
        /*
        SORU: Kullanicidan 10'dan kucuk bir tam sayi isteyin ve girilen sayinin
              faktoriyelini bulun.
              (5!=5*4*3*2*1)
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 10'dan kucuk bir tam sayi giriniz");
        int sayi=scan.nextInt();
        int faktoriyel=1;

        if (sayi>0 && sayi<10){
            for (int i = sayi; i >=1 ; i--) {
                faktoriyel*=i;

            }
            System.out.println("Girilen sayinin faktoriyeli: "+faktoriyel);

        }else{
            System.out.println("Lutfen gecerli bir sayi giriniz");
        }
    }
}

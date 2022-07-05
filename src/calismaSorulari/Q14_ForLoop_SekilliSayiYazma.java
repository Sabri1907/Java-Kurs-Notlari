package calismaSorulari;

import java.util.Scanner;

public class Q14_ForLoop_SekilliSayiYazma {
    public static void main(String[] args) {
        /*
        SORU: Kullanicidan 10'dan kucuk pozitif bir tamsayi  girmesini isteyin.
              Girdigi sayiya gore asagidaki sekli yazdirin.
              ORNEK: 3 girilirse
              1
              1 2
              1 2 3
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 10'dan kucuk pozitif bir tam sayi giriniz");
        int sayi=scan.nextInt();
        for (int i = 1; i <=sayi ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");

            }
            System.out.println("");

        }
    }

}

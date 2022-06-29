package recap1;

import java.util.Scanner;

public class Q04_NotHesaplama {
    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1; vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner scan=new Scanner(System.in);
         int vize1; // variable initialze ettik
         int vize2; // variable initialze ettik
         int finalNotu; // variable initialze ettik

        System.out.println("Lutfen birinci vize notunuzu giriniz: ");
        vize1=scan.nextInt();

        System.out.println("Lutfen ikinci vize notunuzu giriniz: ");
        vize2=scan.nextInt();

        System.out.println("Lutfen final notunuzu notunuzu giriniz: ");
        finalNotu=scan.nextInt();

        double sonuc= ((vize1+vize2)/2)*0.3+ finalNotu*0.7;
        System.out.println("sonuc = " + sonuc);
    }
}

package calismaSorulari;

import java.util.Scanner;

public class Q16_ForLoop_IkiHarfAraliginiYazdirma {
    public static void main(String[] args) {
        /*
        SORU: Kullanicidan baslangic ve bitis harflerini alin ve baslangic
              harfinden baslayip bitis harfinde biten tum harfleri buyuk harf
              olarak ekrana yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen baslangic harfini giriniz");
        char baslangic=scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen bitis harfini giriniz");
        char bitis=scan.next().toUpperCase().charAt(0);

        char temp=baslangic;

        while(temp<=bitis){

            if (temp<bitis){
                System.out.print(temp+"-");
            }else{
                System.out.print(temp);

            }
            temp++;
        }















    }
}

package day18_while_doWhileLoop;

public class C01_WhileLoop {

    public static void main(String[] args) {
         /*
        SORU: Kullanicidan baslangic ve bitis harflerini alin ve baslangic
              harfinden baslayip bitis harfinde biten tum harfleri buyuk harf
              olarak ekrana yazdirin. Kullanicinin hatali giris yapmadigini kontrol edin.
         */

        char ilkHarf = 'f';
        char sonHarf = 't';

        char temp = ilkHarf;
        String buyult="";

        while (temp <= sonHarf) {
            buyult=(temp+"").toUpperCase();
            System.out.print(buyult+ " ");
            temp++;
        }

    }
}

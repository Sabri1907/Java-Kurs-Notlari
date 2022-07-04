package day15_overloading_forLoop;

public class C01_ReturnMethod {
    public static void main(String[] args) {
         // SORU: Verilen iki sayiyi carpip sonucu bize DONDUREN bir method olusturun.

        int sayi1=10;
        int sayi2=5;

        int sonuc=carpGetir(sayi1,sayi2);
        System.out.println("Ille de sonucu goreyim diyenlere: "+sonuc);


    }

    public static int carpGetir(int sayi1, int sayi2) {
       // return sayi1*sayi2; =>Bu sekilde de olur asagidaki gibi de olur.
        int sonuc=sayi1*sayi2;
        return sonuc;
    }
}

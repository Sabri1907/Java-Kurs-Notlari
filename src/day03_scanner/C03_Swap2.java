package day03_scanner;

public class C03_Swap2 {

    public static void main(String[] args) {
        int sayi1 = 10, sayi2 = 20;

        int toplam = sayi1 + sayi2;
        sayi1 = toplam - sayi1;
        sayi2 = toplam - sayi2;

        System.out.println("Sayi1Yeni :" + sayi1);
        System.out.println("Sayi2Yeni :" + sayi2);
    }
}

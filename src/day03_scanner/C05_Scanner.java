package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 1. sayiyi giriniz: ");
        double sayi1= scan.nextDouble();
        System.out.println("Lutfen 2. sayiyi giriniz: ");
        double sayi2=scan.nextDouble();
        System.out.println("Girilen sayilarin carpimi: "+sayi1*sayi2);
    }
}

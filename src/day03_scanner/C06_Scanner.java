package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz: ");
        String isim=scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz: ");
        String soyIsim=scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz: ");
        int yas=scan.nextInt();

        System.out.println("Isim, Soyisim ve Yasiniz: "+isim+" "+ soyIsim+" "+yas);

    }




}

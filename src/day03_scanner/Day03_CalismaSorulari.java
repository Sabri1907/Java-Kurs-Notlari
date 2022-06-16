package day03_scanner;

import java.util.Scanner;

public class Day03_CalismaSorulari {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Lutfen sirasiyla dikdortgenin kisa, uzun kenarini " +
                "\nve yuksekligini girip aralarda enter'a basiniz:");

        int kisa= scan.nextInt();
        int uzun=scan.nextInt();
        int yukseklik=scan.nextInt();
        System.out.println("Dikdortgeni Prizmasinin Hacmi: "+kisa*uzun*yukseklik+" "+"metrekuptur.");
    }
}

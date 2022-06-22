package day08_ifStatements;

import java.util.Scanner;

public class C07_ArtikYil2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen  bir yil giriniz:");

        int yil = scan.nextInt();
        if (yil%100==0){
            if (yil%400==0){
                System.out.println("Artik yil");
            }else System.out.println("Artik yil degil");
        }else if (yil%4==0){
            System.out.println("Artik yil");
        }else System.out.println("Artik yil degil");
    }
}

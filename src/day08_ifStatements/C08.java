package day08_ifStatements;

import java.util.Scanner;

public class C08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        if (num1 > 0 && num2 > 0) {
            System.out.println("Girdiginiz iki sayi da pozitif ve toplamlari: " + (num1 + num2));
        } else if (num1 < 0 && num2 < 0) {
            System.out.println("Girdiginiz iki sayi da negatif ve carpimlari: " + (num1 * num2));
        } else if ((num1 > 0 && num2 < 0) || (num1 < 0 && num2 > 0)) {
            System.out.println("Farkli isaretlerde sayilarla islem yapamazsiniz");
        } else System.out.println("Sifir Carpmaya gore yutan elemandir");
    }
}

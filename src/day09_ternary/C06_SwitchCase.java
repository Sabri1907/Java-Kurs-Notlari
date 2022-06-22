package day09_ternary;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
        /*
        Kullanicidan gun ismi alin
        Haftaici veya haftasonu oldugunu yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.print("Lutfen bir gun ismi giriniz: ");
        String gun=scan.nextLine().toLowerCase();

        switch (gun){
            case "pazartesi":
                System.out.println("Haftaici");
                break;
            case "sali":
                System.out.println("Haftaici");
                break;
            case "carsamba":
                System.out.println("Haftaici");
                break;
            case "persembe":
                System.out.println("Haftaici");
                break;
            case "cuma":
                System.out.println("Haftaici");
                break;
            case "cumartesi":
                System.out.println("Haftasonu");
                break;
            case "pazar":
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun giriniz");
        }
        System.out.println("***********************************");
        /*
        Farkli case'ler ayni sonucu veriyorsa ayni komutlari tekrar tekrar yazmasak da kod calisir.
         */
        switch (gun){
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("Haftaici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun giriniz");
        }
    }
}

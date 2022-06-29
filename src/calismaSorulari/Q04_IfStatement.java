package calismaSorulari;

import java.util.Scanner;

public class Q04_IfStatement {
    public static void main(String[] args) {
        /*
        SORU: Kullanicidan bir karakter girmesini isteyin ve  girilen karakterin
         harf olup olmadigini yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char input= (scan.nextLine().charAt(0));
        if (input>='A' && input<='z'){
            System.out.println("Girilen karakter harftir");

        }else {
            System.out.println("Girilen karakter harf degildir.");
        }
    }
}

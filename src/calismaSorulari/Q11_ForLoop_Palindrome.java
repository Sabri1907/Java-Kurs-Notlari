package calismaSorulari;

import java.util.Scanner;

public class Q11_ForLoop_Palindrome {
    public static void main(String[] args) {
        /*
        SORU: Kullanicidan bir String isteyin. Kullanicinin girdigi String'in
              palindrome olup olmadigini kontrol eden bir program yaziniz.

         PALINDROME: Tersten okunusuda ayni olan cumle, sozcuk ve sayilara denir.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String str=scan.nextLine().toLowerCase();
        String strTers="";
        palindromeKontrol(str,strTers);


        }

    public static void palindromeKontrol(String str, String strTers) {

        for (int i = str.length()-1; i>=0; i--) {
            strTers+=str.charAt(i);

        }
        if (str.equals(strTers)){
            System.out.println("Girdiginiz kelime/cumle palindrome'dur.");
        }else {
            System.out.println("Girdiginiz kelime/cumle palindrome degildir.");
        }
    }

}

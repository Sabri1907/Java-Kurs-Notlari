package calismaSorulari;

public class Q16 {
    public static void main(String[] args) {
        /*
        SORU: Kullanicidan bir String isteyin. Kullanicinin girdigi String'in
              palindrome olup olmadigini kontrol eden bir program yaziniz.

         PALINDROME: Tersten okunusuda ayni olan cumle, sozcuk ve sayilara denir.
         */

        String str="ey edip adanada pide ye";
        String tersStr="";


        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr+=str.charAt(i);

        }

        if (str.equalsIgnoreCase(tersStr)){
            System.out.println("Girilen kelime/cumle Palindrome'dur");
        }else{
            System.out.println("Girilen kelime/cumle Palindrome degildir.");

        }


    }
}

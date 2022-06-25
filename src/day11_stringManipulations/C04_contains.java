package day11_stringManipulations;

public class C04_contains {
    public static void main(String[] args) {

        String cumle="Java buyuk, dunya kucuk";

         /*
            Soru 2) Kullanicidan bir cumle isteyin.
            Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
            “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
            iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
         */


        /*
        - Requirement'ta buyuk/kucuk harf hassasiyeti hakkinda bir sey soylenmemis.
        - Ikinci olarak her iki kelimeyi de icerme durumu aciklanmamis.
        - Boyle durumlarda gorevi bize veren ilgili kisiye sormak gerekir.


        EK REQUIREMENTS: Ikisini de iceriyorsa "Karar ver buyuk mu yazdirayim kucuk mu?" yazdirsin.
        Case Sensitive olmasin
         */

        cumle=cumle.toLowerCase();

        if (cumle.contains("buyuk")&& cumle.contains("kucuk")){
            System.out.println("Karar ver buyuk mu yazdirayim kucuk mu?");
        }else if (cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        }else if (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        }else{
            System.out.println("Cumle kucuk ya da buyuk kelimesi icermiyor.");
        }


    }

}

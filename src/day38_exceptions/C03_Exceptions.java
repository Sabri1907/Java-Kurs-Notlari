package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {

    public static void main(String[] args) {
        /*
        SORU: Marketteki tum urunleri bir array'de tuttugumuzu varsayalim.
        Kullaniciya index sorup o index'deki urunu yazdiran bir program hazirlayalim.
        Kullanici urun sayisindan buyuk bir index girerse exception vermesinin onune gecelim.
         */

        String urunler []={"Nutella", "Cokokrem", "Sut","Findik"};

        Scanner scan=new Scanner(System.in);

        System.out.println("Istediginiz urunun sira nosunu giriniz");

        try {
            int istenenSira=scan.nextInt();
        } catch (InputMismatchException deneme) {
            //e.printStackTrace(); // Bunu kaldirirsak kod calismaya devam eder.
            System.out.println("Hata Mesaji = " + deneme.getMessage()); // null
            System.out.println("Hata mesaji="+deneme); // Hata mesaji=java.util.InputMismatchException
        }
        /*
        catch blogunun onundeki parantezde exception class'inin ismi ve yaninda yakalanan exception'i
        atadigimiz variable'in ismi olur. Ve bunun adi otomatik olarak olustuysa adi genelde e olur.
        Eger yakalanan exception ile ilgili bilgileri kullaniciya vermek istersek bu objeyi kullanabiliriz.

        Eger kulla


         */
        System.out.println("Program calismaya devam ediyor");

    }
}

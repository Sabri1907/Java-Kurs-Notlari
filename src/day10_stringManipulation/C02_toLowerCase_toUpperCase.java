package day10_stringManipulation;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {
        String str="Beni psikopata baglamayin";

        System.out.println(str.toUpperCase()); //BENI PSIKOPATA BAGLAMAYIN (Inglizce dildeki bilgisayarda)

        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr"))); //BENİ PSİKOPATA BAGLAMAYİN

        /*
        Eger buyuk-kucuk donusumunde  lokal bir dili esas almak istersek
        bu method kullanilabilir.
         */
    }
}

package day32_stringBuilder;

public class C03_reverse {
    public static void main(String[] args) {
         /*
         SORU: Verilen bir input'u tersine cevirip bize donduren
         bir method olusturun.
         */

        String input="Hey gidi for loop gunleri.";

        String tersInput=tersineCevir(input);

        System.out.println(tersInput);
   }

    public static String tersineCevir(String input) {

        StringBuilder sb=new StringBuilder(input); // StringBuilder olusturup icine input'u koyduk.

        return sb.reverse().toString(); // Methodun da turu String oldugu icin return'e StringBuilder yazarsak CTE verir.
       // O yuzden toString() methoduyla StringBuilder'i String'e cevirdik.

    }
}

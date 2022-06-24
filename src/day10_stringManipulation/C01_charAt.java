package day10_stringManipulation;

public class C01_charAt {

    public static void main(String[] args) {
         String str= "Java Ogrenmek ne guzel";

        System.out.println(str.charAt(0)); // Ilk harfi yazdirir => J

        System.out.println(str.toUpperCase().charAt(7)); // R

        // NOT: Atama yapilmadigi icin yukaridaki satirda str kalici olarak buyuk harf kalmaz.

        System.out.println(str.charAt(21)); // l

        // System.out.println(str.charAt(22)); => StringIndexOutOfBoundsException hatasi verir.

        /*
        Son harfi bulmak icin String degerin uzunlugunun 1 eksigini index olarak gireriz.
        Eger index olarak String uzunlugunu veya daha buyuk bir sayi girersek Java exception verir.
         */


        /*
        ONEMLI NOT: charAt() kullandigimizda sonuc char olacagi icin artik manipulation yapamayiz
        String method'larindan kullanmamiz gereken bir method varsa
        charAt( ) 'den once kullanmaliyiz
         */
    }
}

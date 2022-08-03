package day39_exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) {

        String str;

        /*
        System.out.println(str);
        Deger atamasi yapmadan bir variable'i kullanmaya calisirsak
        Java Compile Time'da bunu fark eder ve size izin vermez.
         */

        str=null; // Simdilik Null atayalim sonra deger atariz diye dusunduk.
                  // Bu sekilde sout'un icine yazarsak Java hata vermez. Ama method'la birlikte
                  // yazdirmaya calisirsak Run Time'da NullPinterException verir.

        System.out.println(str); // null
        //System.out.println(str.length()); // NullPointerException
        // (Run Time'da verir dolayisiyla NullPointerException Run Time Exception'dir.)

        System.out.println("******************************");

        Object obj="Jav Java Java"; // ClassCastException=> Object class'i butun objelerin atasi oldugu icin
                                // Java yazarken CTE vermez ama Run Time'da exception verir.
        Integer sayi=(Integer) obj;

        /*
        String str2=Hava civa"
        Integer sayi2=str2; // CTE
        Java bazi casting islemlerine compile time'da izin vermez.



         */

    }
}

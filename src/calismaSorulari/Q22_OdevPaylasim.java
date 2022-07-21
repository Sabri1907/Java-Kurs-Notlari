package calismaSorulari;

public class Q22_OdevPaylasim {

            /*
            1. İki String ifadeyi parametre olarak alan bir metot tanımlayınız.
            2. Metodumuz bir cümle ve bu cümleden çıkarmak istediğimiz kelimeyi  parametre olarak alsın.
                    3. Sonuç olarak metodumuz cümle içinden istediğimiz kelimeyi çıkararak bize döndürsün.
                    Örneğin;
                    ("bugün hava çok güzel", "çok") ➞ "Bugün hava güzel"
                    ("merhaba dünya", "dünya") ➞ "merhaba"
             */

    public static void main(String[] args) {

        String cumle="Bugun hava cok guzel";
        String cikarilacakKelime="cok";

        System.out.println("Istenmeyen kelime cikarildiktan sonra yeni cumle: "+istenmeyeniCikar(cumle,cikarilacakKelime));
    }

    public static String istenmeyeniCikar(String cumle, String cikarilacakKelime) {
        String yeniCumle=cumle.replace(cikarilacakKelime,"");


        return yeniCumle;
    }
}

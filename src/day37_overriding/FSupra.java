package day37_overriding;

public class FSupra extends EToyota{

    void yakit(){
        System.out.println("Supra benzin kullanir");
        /*
        Private, static ve final method'lar override edilemez.
        Eger Child class'da parent class'daki private method ile ayni signature'da bir method
        olusturursaniz bu overriding olmaz. Cunku private oldugu icin bu override olmaz ve child class'da
        olusturulan method baska bir methoddur.

         */
    }

    @Override // Ovverride notasyonu Otomatik olusturunca kendisi cikti.
    void motor() {
        //super.motor(); => Method Otomatik olusturulunca Ovverride notasyonu ile birlikte cikti.
        /*
        @Override notasyonu Java'ya bir gorev verir.
        Java, bu notasyon'la birbirine bagli iki method'u surekli kontrol eder.
        Eger parent class'daki overriden methodu silerseniz @Override notasyonu CTE verir.
        Ama parent'in parent'inda ayni method'dan varsa bu sefer onu override eder.

        @Override notasyonu kullanmak mecburi degildir.
        Ancak Overriden edilen method silinirse CTe vermesini istersek @Overriding notasyonu yazilmalidir.

        NOT: Static,private, final methodlar override edilemez.
         */
    }
}

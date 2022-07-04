package day15_overloading_forLoop;

public class C02_Overloading {
    public static void main(String[] args) {
        /*
        Java'da olusturdugumuz methodlari isminin yaptigi islev ile uyumlu olmasini isteriz.
        Ornegin bir String'in bir bolumunu almak icin Java substring() methodlari veya
        verilen String'deki bazi parcalari yenileri ile degistirmek icin 2 adet replace() methodu var.

        Java ayni isimde birden fazla method varsa hangisinin kullanilacagina parametre sayisi
        ve parametrelerin data turune gore karar verir.
         */

        String str="Bu Java ogrenilecek, baska yolu yok";
        str.substring(2);

        str.replace('c','v');
        str.replace("J","H");
    }
}

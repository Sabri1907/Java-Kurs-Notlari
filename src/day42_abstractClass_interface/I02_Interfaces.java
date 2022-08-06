package day42_abstractClass_interface;

public interface I02_Interfaces {
    /*
    Interface bir CLASS DEGILDIR.

    Abstract class'lar Java'da abstraction (soyutlastirma / kural koyma) islevini yapiyordu.
    Ancak abstract bir class'da abstract olmayan methodlar da olabilir.
    Bu durum da full abstraction yapmaya izin vermez.
    Eger Java'da icinde hic concrte method olmasin dedigimiz bir class olusturmak istiyorsak
    bunu class degil INTERFACE yapmaliyiz.
    Interface icinde sadece kendisinden tureyen siniflarin icini doldurmak zorunda oldugu body'si olmayan
    method'larin olusturdugu yapidir.

    1. ALTIN KURAL: Interface'lerde copncrete method olmaz.
    2. ALTIN KURAL: Interface'ler full abstraction yaptigindan Interface'lerden obje uretemez.

    Hatirladigimiz gibi Interface olan Liste'den direk obje olusturamiyorduk.
    List<String> liste=new List<>(); => CTE verir.
    Bunun yerine constructor'i List'in chil'i olan ArrayList'den seceriz.
    List<String> liste=new Arraylist<>(); => CTE verir.

    3.  ALTIN KURAL: Class'larda bir child birden fazla parent edinemez.
        Ancak Interface'ler birden fazla Interface'e implement edilebilir.
        Interface'lerde concrete method olmadigindan biz her
        methodu child class'da override etmek zorundayiz.
        Override ederken kimin soyledigini override ettigimizin onemi yok.

    4.  Interface'ler neyin yapilmasi gerektigini soyler ama nasil yapilacagina karismaz. (TO DO LIST)

    5.

    NOT:=> Interface'de ister yazalim ister yazmayalim sadece abstract public method'lar bulunur.
        Return type'lari farkli olabilir.

        => Interface'de icindeki variablae'lar public, static veya final olmalidir. Private veya protected variable'lar
        CTE verir. (Yazsak da oyledir yazmasak da)

        => Interface icindeki variable'lari mutlaka initialize etmek zorundayiz. Aksi takdirde CTE verir.
            ORNEK int SAYI=10;




     */

    int SAYI=20;
    String ISIM="Yidiz Koleji";

}

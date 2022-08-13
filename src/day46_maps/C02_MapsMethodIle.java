package day46_maps;
import java.util.List;
import java.util.Map;
public class C02_MapsMethodIle {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap =ReusableMethods.mapOlustur();
        System.out.println(ogrenciMap);
        //{101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Tester}
        // value'lari sira numarali olarak yazdirin
        ReusableMethods.tumValueSiraliYazdir(ogrenciMap);
        /*
        1 - Ali, Can, JDev
        2 - Enes, Cem, Tester
        3 - Taha, Emre, JDev
        4 - Derya, Deniz, Tester
         */

        // Isim ve soyisimlerin birlikte olacagi bir liste olusturun
        List<String> sinifisimsoyisimList= ReusableMethods.isimSoyisimListesiOlustur(ogrenciMap);
        System.out.println("isim soyisim listesi : " + sinifisimsoyisimList);
        // isim soyisim listesi : [Ali Can, Enes Cem, Taha Emre, Derya Deniz]
        // kac farkli brans varsa bransIsmi = branstakiOgrencisayisi seklinde yazdirin
    }
}
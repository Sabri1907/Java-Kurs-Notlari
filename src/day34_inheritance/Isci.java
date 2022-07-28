package day34_inheritance;

public class Isci extends Personel {

    /*
    Normal hayatimizda parent cocuk sahibi olmaya karar verir.
    COK ONEMLI: Java'da ise child class'lar ozelliklerini inherit etmek istedikleri class'i
    kendilerine parent edinirler.
    Parent class'larin hangi class'larin child class'i olacagini belirleme veya yasaklama yetkisi yoktur.

    Mesela isci class'ini olusturunca nelere ihtiyaci var diye dusunsek Personel class'indaki
    variable ve method'lara ihtiyaci oldugunu gorebiliriz.
    Bu durumda yeniden o variable ve method'lari olusturmak yerine Personel class'ini kendimize parent ediniriz.

    Bir class'i parent edinmek icin extends keyword kullanmaliyiz.

    Bir class baska bir class'i parent edindiginde;
        1. Parent class'daki tum ozelliklere (variable+method) otomatik olarak sahiptir.
        2. Parent class'daki ozelliklerinden (variable+method) bazilarini uyarlayabilir.
        3. Parent class'da olmayan bazi yeni ozellikler (variable+method) olusturabilir.
     NOT: Parent class'daki ozelliklerden hic birini reddedemez ama degistirebilir.
     */
    int persNo=1001;

    public static void main(String[] args) {

        Isci isci1=new Isci();
        System.out.println(isci1.isim); // isim belirtilmedi=> Kendi classimizda isim variable'i yok ,
                                       // onun icin parent class'a gideriz.

        isci1.isim="Yusuf"; // Atama da yapabiliriz.

        System.out.println(isci1.persNo); // 1001=> Kendi classimizda varsa onu kullanir.

        // Ayni seyler methodlar ici de gecerlidir.

        //isci1.maas(); // Tum personelin ,maasi vardir

        // Maas methodunu isciler icin gincellemek istersek ayni isimde method olusturup guncelleriz.
        isci1.maas(); //Isciler minimum 15 euro saat ucreti alir

        // Parent class da olmayan ozellikler de (variable+method) kazanabilir.
        isci1.sigorta();// Isteyene %50 indirimle sigorta yapilir => Bu method parent class'da yok ama
        //child class'da olusturabildik. (Yeni ozellik kattik) '


    }

    public void maas(){
        System.out.println("Isciler minimum 15 euro saat ucreti alir");

    }

    public void sigorta(){
        System.out.println("Isteyene %50 indirimle sigorta yapilir");
    }
}

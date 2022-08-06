package day40_final;

public class A {

    protected  String isim ="Cuneyt";

    final static String OKUL="Yildiz Koleji";

    /*
    Bir variable final olarak tanimlandiysa baska class'lardan veya icinde oldugumuz
    class'dan bu variable'a baska deger atanmasi myumkun degildir.

    Madem ki degeri degistirilemiyor genel de static yaparak bu variable'a erisim
    kolaylastirilabilir.
    Ve genelde static final olarak belirlenen variable isimleri BUYUK HARFLE yazilir.
     */

    final void finalMethod(){
        System.out.println("Final method'lar override edilemez");
        /*
        Bir method'u final olarak isaretlersek bu method degistirilemez.
        Yani override edlilemez.
         */


    }
}

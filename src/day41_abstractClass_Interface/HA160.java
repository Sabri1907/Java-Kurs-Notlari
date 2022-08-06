package day41_abstractClass_Interface;

import java.util.*;

public class HA160 extends FMercedes{

    /*
        Abstract parent silsilesinden gelen ilk concrete class parent'i olan tum class'lardaki
    abstract methodlari concrete hale donusturmek (override etmek) zorundadir.
        Bu kuralin istisnasi abstract parent class'lardan herhaangi birinde concrete hale donusturulmus
    abstract methodlardir.
     */

    public static void main(String[] args) {

        HA160 arb1=new HA160();

        /*
        Concrete bir class'dan istedigimiz objeyi uretebiliriz.
         */

        FMercedes arb2=new FMercedes(); //FMercedes de concrete oldugu icin ordan da obje uretebildik.

        // EToyota arb3=new EToyota(); => Abstract class'lar constructor barindirir ama obje URETEMEZLER
        // EToyota class'i abstract class oldugundan obje URETiLEMEZ.

        //List<String> list=new List<String>() => List bir abstract class oldugu icin obje uretemeyiz.
        List<String> list2=new ArrayList<>();

        /*
            Abstract bir class'in ozelliklerini tasiyan bir obje olusturmak istedigimizde Data turunu
        istedigimiz abstract classdan, constructor'i ise child'i olan concrete bir class'dan seceriz.
         */

    }
}

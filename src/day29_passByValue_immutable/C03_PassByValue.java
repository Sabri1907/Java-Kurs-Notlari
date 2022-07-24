package day29_passByValue_immutable;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        Bir list olusturalim. 2 ayri methodun birinde sadece elemanlari degistirelim.
        Digerinde yeni bir list atayip ayni sayida yeni eleman ekleyelim.
        Ve her iki method call'dan sonra kendi listemizi main method icerisinde kontrol edelim.
         */

        List<String> list=new ArrayList<>();

        list.add("Ali");
        list.add("Veli");
        list.add("Can");

        System.out.println("Listin ilk Hali: "+list);

        elemanlariDegistir(list);

        System.out.println("Eleman degistir methodundan sonra listemiz : "+list);

        listDegistir(list);

        System.out.println("ListDegistir methodundan sonra listemiz : "+list);

    }

    public static void listDegistir(List<String> list) {
        list=new ArrayList<>();
        list.add("Nutella");
        list.add("Cokokrem");
        list.add("Ikram");

        System.out.println("Listdegistir methodu icinde icinde Listemiz : "+list);




    }

    public static void elemanlariDegistir(List<String> list) {

        list.set(0,"Fatih");
        list.set(1,"Murat");
        list.set(2,"Yavuz");

        System.out.println("Elemanlari Degistir icinde Listemiz : "+list);

    }
}

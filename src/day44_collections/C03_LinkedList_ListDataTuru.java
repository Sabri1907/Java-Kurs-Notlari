package day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_LinkedList_ListDataTuru {
    public static void main(String[] args) {

        LinkedList ll1=new LinkedList(); // Bu class'dan obje olusturduk

        List<String> ll2=new LinkedList(); // List data turunden obje olusturduk

        Queue<String> ll3=new LinkedList(); // Queue data turunden obje olusturduk

        Deque<String> ll4=new LinkedList(); // Deque data turunden obje olusturduk

        ll2.add("Berk");
        ll2.add("Done");
        ll2.add("Enes");
        ll2.add("Ayse");

        System.out.println("ll2 = " + ll2); // ll2 = [Berk, Done, Enes, Ayse]

        System.out.println("ll2.remove(3) = " + ll2.remove(3)); // Ayse => Silmesini istedgimiz index'deki
        // silinen elemani dondurur.
        /*
            Dolayisiyla intiger'lardan olusan bir list'de silmek istedigimiz elemani yazarsak onu index olarak algilar.
        Ama silmek istedigimiz elemani bir variable'a atayip remove edersek onu obje olarak algilar ve siler.
         */
        System.out.println(ll2.remove("Kemal"));// false
        System.out.println(ll2.isEmpty()); // false

        ll2.set(1,"Yusuf"); // 1. index'deki elemani silip yerine Yusuf'u ekler.
        System.out.println(ll2);

        ll1.add("Berk");
        ll1.add("Ismail");
        System.out.println("ll1 = " + ll1); // [Berk, Ismail]

        ll2.retainAll(ll1); // => ll2'deki tum elementleri ll1 ile ka

        System.out.println("ll2 = " + ll2); // Berk

        System.out.println(ll2.hashCode()); // 2066939
        ll2.add("Yusuf");
        System.out.println("ll2 = " + ll2);
        System.out.println("Yeni Hash Kodu: "+ll2.hashCode() ); // 149868269

    }
}

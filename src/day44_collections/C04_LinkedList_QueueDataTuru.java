package day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_QueueDataTuru {

    public static void main(String[] args) {

        /*
        Queue kuyruk demektir. Bu yapida sira onemlidir.
        Gelen sona eklenir, silinen bastan silinir. O yuzden remove() methodunda index veya object
        belirtmezsek ilk elemani siler. Object belirtirsek boolen sonuc dondurur.
         */

        Queue<String> ll3= new LinkedList<>();
        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("Hpolat");
        ll3.add("Kadir");

        System.out.println("ll3 = " + ll3); // [Adem, Zeynep, Hpolat, Kadir]

        System.out.println(ll3.remove()); // Adem => Ilk elemani siler.

        System.out.println("ll3 = " + ll3); // [Zeynep, Hpolat, Kadir]

        System.out.println(ll3.remove("Adem")); // false

        System.out.println("ll3 = " + ll3); // [Zeynep, Hpolat, Kadir]

        System.out.println("ll3.element() = " + ll3.element()); //Zeynep => Ilk elemani dondurdu
        System.out.println("ll3.peek() = " + ll3.peek()); // Zeynep => Ilk elemani dondurdu

        /*
        element() ve peak() methodlari ikisi de listenin ilk elemaninini dondurur.
        Farki liste bossa element() exception dondurur, peak null dondurur
         */

        Queue<String> ll4= new LinkedList<>();
        //System.out.println("ll4.element() = " + ll4.element()); //NoSuchElementException firlatir.

        System.out.println("ll4.peek() = " + ll4.peek()); // null

        ll3.offer("Ahmet"); // offer() methodu da add() methodu gibi sona eleman ekler.
        System.out.println("ll3 = " + ll3); // [Zeynep, Hpolat, Kadir, Ahmet]

        System.out.println("ll3.poll() = " + ll3.poll()); // Zeynep

        // poll () methodu remove gibi bastaki elemani siler ve bize dondurur. Farki liste bossa
        //remove() NoSuchElementException firlatir. poll() ise null dondurur.
        System.out.println("ll3 = " + ll3); //[Hpolat, Kadir, Ahmet]

        // System.out.println(ll4.remove()); => NoSuchElementException firlatti

        System.out.println("ll4.poll() = " + ll4.poll()); // null


    }

}

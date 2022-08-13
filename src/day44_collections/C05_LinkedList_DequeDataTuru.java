package day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DequeDataTuru {
    public static void main(String[] args) {
        /*
        Deque: Double Ended Queue demek
        Queue'deki methodlarin coguna ilave olarak first ve last methodlari da eklenmistir.
        Cunku iki tarafli calisan
         */

        Deque<String> ll4=new LinkedList<>();

        ll4.add("Cavidan");
        ll4.add("Mesut");
        ll4.add("Selim");
        ll4.add("Tevfik");
        ll4.add("Selim");

        System.out.println("ll4.removeLastOccurrence(\"Selim\") = " + ll4.removeLastOccurrence("Selim"));
        System.out.println("ll4.removeFirstOccurrence(\"Hasan\") = " + ll4.removeFirstOccurrence("Hasan"));
        System.out.println("ll4 = " + ll4);//[Cavidan, Mesut, Selim, Tevfik]--> sondaki Selim'i sildi

        System.out.println("ll4.pop() = " + ll4.pop());//Cavidan--> cavidani sildi
        System.out.println(ll4);//[Mesut, Selim, Tevfik]-->listenin son hali
        // linkedlist'in basindaki elementi silip, bize dondurdu

        ll4.remove();
        ll4.removeFirst();
        ll4.removeLast();
        //Deque iki tarafli queue demektir, dolaysiyla her method'un first ve last'i var
    }
}

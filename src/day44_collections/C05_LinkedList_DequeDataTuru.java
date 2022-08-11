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
    }
}

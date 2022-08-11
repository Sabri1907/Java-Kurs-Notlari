package day44_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01_ListIterators {
    public static void main(String[] args) {
        /*
        Soru 3) Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program yaziniz …                                         (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
    `   Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
        output: [23,40]
         */

        List<Integer> liste=new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);

        System.out.println("liste = " + liste); // [2, 13, 56, 23, 45, 14, 40]

        ListIterator li1= liste.listIterator();
        int basSinir=1;
        int bitSinir=100;

        while(li1.hasNext()){
            Integer temp= (Integer)li1.next(); // li1.next() her yazildiginda bir sonrakine gectigi icin
            // if blogunda dogru calismayacakti. O yuzden temp'e atadik ve if'in sart cumlesinde temp'i kullandik
            //if (li1.next()<20 ||temp>li1.next())
            if (temp<basSinir ||temp>bitSinir){
                li1.remove();
            }

        }
        System.out.println("List Iterator'dan Sonra liste = " + liste);
    }
}

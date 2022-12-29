package lamda_functional_programming;

import java.util.ArrayList;
import java.util.List;

public class Fp01 {
    /*============================ =>  LAMDA <= ===========================================================
    1. Lambda (Junctional Programming) Java 8 ile kullanılmaya başlanmıştır.
    2. Functıonal Programming'de "NE Yapılacak" (What to do) üzerine yoğunlaşılır.
       Stractured Programming'de "Nasıl Yapılacak" (How to do) üzerine yoğunlaşılır.
    3. Functıonal Programming Arrays ve Collections ile kullanılır.
    4. "entrySet()" methodu ile Map, Set'e dönüştürülerek Functıonal Programming'de kullanılır.
     */

    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println("liste = " + liste);

        System.out.println("listElemanlariniYazdirStructured");
        listElemanlariniYazdirStructured(liste);
        System.out.println();
        System.out.println("listElemanlariniYazdirFunctional");
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        System.out.println("ciftElemanlariYazdirStructured");
        ciftElemanlariYazdirStructured(liste);
        System.out.println();
        System.out.println("ciftElemanlariYazdirFunctional");
        ciftElemanlariYazdirFunctional(liste);



    }
    // 1. Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun. (Structured)
    // Şimdiye kadar öğrendiklerimizle yapacağız.

    public static void listElemanlariniYazdirStructured(List<Integer> list){
        for(Integer w:list){
            System.out.print(w+" ");
        }
    }


    // 2. Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun. (Functional)
    // Lambda ile yapacağız.

    public static void listElemanlariniYazdirFunctional(List<Integer> list){

        list.stream().forEach(t-> System.out.print(t+" "));
        // stream() methodu collection'dan elementleri akışa dahil etmek için ve methodlara ulaşmak için kullanılır.
        // "t->" list'deki elementlerin yerine geçer.
        // stream() methodu lambda için bize yeni methodlar kullanmamızı sağlar. Ve collection'daki elementleri akışa sunar.
        // Bazı methodları stream()'sız bazı methodları da stream() ile kullanamayız.

    }

    // 3. Cift list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun. (Structured)
    public static void ciftElemanlariYazdirStructured(List<Integer> list){
        for (Integer w : list){
            if (w%2==0){
                System.out.print(w+" ");
            }
        }

    }

    // 4. Çift list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    // (Functional)
    public static void ciftElemanlariYazdirFunctional(List<Integer> list){
        list.stream().filter(t-> t%2==0).forEach(t-> System.out.print(t+" "));

    }

}

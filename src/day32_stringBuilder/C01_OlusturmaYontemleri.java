package day32_stringBuilder;

public class C01_OlusturmaYontemleri {
    public static void main(String[] args) {

        // Strin Builder 3 yontemle olusturulur.

        StringBuilder sb1 = new StringBuilder(); // Bos bir StrinBuilder olusturur

        StringBuilder sb2 = new StringBuilder("Java Candir."); // Belli bir degeri olan StringBuilder olusturduk.

        StringBuilder sb3 = new StringBuilder(10); // Kapasitesi 10 olan StringBuilder olusturduk.

        System.out.println("sb1 length : "+ sb1.length()); // 0 => Bos oldugu icin length'i 0
        System.out.println("sb1 capacity: "+ sb1.capacity()); // 16 => Hic bir deger yazmazsak Java kapasitesi
                                                              // 16 olan bir StringBuilder olusturur.

        System.out.println("sb2 length : "+ sb2.length()); // 12=> sb olusturulurken girilen degerin uzunlugu
        System.out.println("sb2 capacity: "+ sb2.capacity()); // 28 => Olustururken girilen degerin uzerine 16 ekleyip
                                                              // kapasitesini ona gore belirledi.

        System.out.println("sb3 length : "+ sb3.length()); // 0
        System.out.println("sb3 capacity: "+ sb3.capacity()); // 10

        sb1.append("Java");
        System.out.println("sb1 length : "+ sb1.length()); // 4 => "Java" ekleyince 4 oldu
        System.out.println("sb1 capacity: "+ sb1.capacity()); // 16

        sb1.append(" Candir");
        System.out.println("sb1 length : "+ sb1.length()); // 11 => " Candir" ekleyince 11 oldu.
        System.out.println("sb1 capacity: "+ sb1.capacity()); // 16

        sb1.append(", bilen bilir.");
        System.out.println("sb1 length : "+ sb1.length()); // 25 => ", bilen bilir." ekleyince 25 oldu
        System.out.println("sb1 capacity: "+ sb1.capacity()); // 34 oldu. Eski degerin (16'nin) 2 katinin 2 fazlasi oldu.


        StringBuilder sb4 = new StringBuilder(); // Ilk Olustururken bos oldugu icin length'i:0; capacity:16
        sb4.append("Java Candir");
        System.out.println("sb4 length : "+ sb4.length()); // 11 => "Java Candir" ekleyince length 11 oldu
        System.out.println("sb4 capacity: "+ sb4.capacity()); // 16 => "Java Candir" uzunlugu 16'yi gecmedigi
                                                              // icin capacity 16'da kaldi.


    }
}

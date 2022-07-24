package practice08;

import java.util.ArrayList;
import java.util.List;

public class Q03_ArrayList {
    /*
    SORU: /*
     * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
     * not kisa metodlar kullanmayiniz (Math Class'i gibi)
     * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8,25,98,-2};

        // Bir List olusturalim
        List<Integer> list = new ArrayList<>();

        // List'e elemanlari ekleyelim
        for (int each : arr) {
            list.add(each);
        }

        // Max elemanlari ekleyecegimiz ikinci bir list olusturalim
        List<Integer> maxList = new ArrayList<>();
        int n = 3;
        int count = 1;

        while (count <= 3) {
            int max = list.get(0); // Lis'in ilk elemani max olsun
            for (int i = 0; i < list.size(); i++) {

                if (max < list.get(i) && !maxList.contains(list.get(i))) { //
                    max = list.get(i); //List'in ilgili elemani max'dan buyukse Max o sayi olsun
                }

            }
            maxList.add(max); // Max'i maxList'e ekledik
            list.remove(list.indexOf(max)); // MaxListe'e ekledigimiz sayiyi List'den cikardik.
            count++;
        }

        System.out.println("Array'in max " + n + " elemani : " + maxList);

    }

}

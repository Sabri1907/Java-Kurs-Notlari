package day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time1=LocalTime.now();

        System.out.println(time1); // 19:14:45.470221800 = > Nano saniyesine kadar anlik zamani dondurur.

        Thread.sleep(300); // 3 saniye kodu durdurur.

        System.out.println(time1); // 19:14:45.470221800 = >

        /*
        Bizim olusturdugumuz date ve time canli saat veya tarih degildir. LocalTime.now(); kullandigimiz
        satirda o anki tarih veya saati alip bizim variable'imiza store eder.
        time1 variable'inin degeri sabittir. (Ust satirlarin aciklamasi)

        Anlik saati veya tarihi almak icin variable'a tekrar LocalTime.now() atamasi yapmamiz gerekir.
        (Alt satirlarin aciklamasi)
         */
        System.out.println(time1); //19:21:09.629303500
        Thread.sleep(3000);
        time1=LocalTime.now();
        System.out.println(time1); //19:21:15.653461800

        System.out.println(time1.getSecond()); // 17 => O anki zamanin saniyesini dondurur

        System.out.println(time1.plusSeconds(10000)); // 22:20:00.486651500 => 10000 saniye sonra saatin
                                                      // kac olacagini dondurur

        System.out.println(time1.minusMinutes(200)); // 16:14:54.861989300 => 200 dk once saatin kac oldugunu dondurur

        System.out.println(time1.withHour(17)); // 17:37:08.758049800 => Icinde bulundugumuz zamanin saat kismini
        // girdigimiz degeri atayarak dondurur
    }

}

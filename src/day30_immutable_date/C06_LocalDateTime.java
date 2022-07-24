package day30_immutable_date;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat= LocalDateTime.now();

        System.out.println(tarihSaat); // 2022-07-23T19:40:47.737750 => Zamani belirtmek icin T ile ayirmis.

        System.out.println(tarihSaat.plusMonths(3).plusHours(100)); // 2022-10-27T23:43:57.281571 => 3 ay, 100 saat
                                                                    //sonraki tarih ve zamani dondurur

        System.out.println(tarihSaat.minusDays(100).plusHours(50)); // 2022-04-16T21:46:05.120346500 => 100 gun once
        // 50 saat sonraki tarih saati dondurur


    }
}

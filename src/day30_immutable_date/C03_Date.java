package day30_immutable_date;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date {
    public static void main(String[] args) {

        LocalDate tarih= LocalDate.now(); // Yil-Ay-Gun olarak tarih olusturur. Istersek formati degistirebiliriz.

        System.out.println(tarih); // 2022-07-23

        System.out.println(tarih.getDayOfYear()); // 204 => Yilin kacinci gunu oldugunu dondurur.

        System.out.println(tarih.getDayOfWeek()); // SATURDAY => Haftanin hangi gunu oldugunu dondurur.

        System.out.println(tarih.getMonthValue()); // 7 => Kacinci ayda olgumuzu dondurur.

        System.out.println(tarih.getDayOfMonth()); //23 = > Ayinci kacinci gunu oldugunu dondurur.

        System.out.println(tarih.isLeapYear()); // false = > Icinde bulundugumuz yilin artik olup olmadigini dondurur.



        LocalDate tarih2=LocalDate.of(1986,4,4);

        System.out.println(tarih2); // 1986-04-04

        LocalDate tarih3=LocalDate.of(2019, Month.JULY,19);

        System.out.println(tarih3); // 2019-07-19 => Ay ismi girip tarih formatinda dondurur.

        System.out.println(tarih.plusDays(100)); // 2022-10-31 => 100 gun sonra hangi tarih olacagini dondurur.

        System.out.println(tarih.plusYears(3).plusMonths(7).plusDays(25)); // 2026-03-20 => 3 yil, 7 ay,
                                                                           // 25 gun sonraki tarihi dondurur.


    }
}

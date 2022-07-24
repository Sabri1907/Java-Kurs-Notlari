package day30_immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {
        /*
        Iki tarih arasindaki sureyi bulma
         */

        LocalDate tarih1=LocalDate.of(1986,4,4);

        LocalDate bugun=LocalDate.now();

        Period period=Period.between(tarih1,bugun);

        System.out.println(period); // P36Y3M19D => Yil, ay ve gun cinsinden oeriyodu verir.
    }
}

package day17_nestedForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {
         /*
    SORU: Verilen input'a gore yildizlardan olusan bir ucgen olusturun.

    ORNEK: input=4 ise
    *
    * *
    * * *
    * * * *

     */

        /*
        NOT: Dikdortgen sekil oldugunda kac satir olacagini outer loop, satir boyunu ise
        inner loop kontrol ediyor. Ve ikisi de verilen input degerlere kadar gidiyor.
        Ucgen sekilde kac satir olacagini yine outer loop belirliyor ancak satir boyunu i belirliyor.
        Dolayisiyla i'ye kadar gidecek sekilde formuluze ederiz.
        */


        int input=4;

        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }

    }






}

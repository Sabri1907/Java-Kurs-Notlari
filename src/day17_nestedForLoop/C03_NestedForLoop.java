package day17_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        /*
        SORU: Verilen en ve boy degerine gore *'lardan olusan
        bir dikdortgen olusturalim.

        ORNEK: Yukseklik:3 Boy:4
        * * * *
        * * * *
        * * * *
        */

        int yukseklik=4;
        int boy=8;

        for (int i = 1; i <=yukseklik ; i++) {
            for (int j = 1; j <=boy ; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }
    }
}

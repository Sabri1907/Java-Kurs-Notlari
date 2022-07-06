package day17_nestedForLoop;

public class C05_NestedForLoop {
    public static void main(String[] args) {
        /*
        SORU: Verilen input'a gore yildizlardan olusan asagidaki ekli olusturun.

        ORNEK:input:4 icin:

        *
        * *
        * * *
        * * * *
        * * *
        * *
        *

        */

        // Tek loop ile yapamayiz. Artan kismi Nested For Loop ile yapalim.

        int input=4;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");

            // Ilk kismi (artan kisim) yaptiktan sonra ikinci bir NestedForLoop ile
            // azalan kismini yaptik.

        }

        for (int i = input-1; i >=1 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");

            }
            System.out.println("");

        }


    }
}

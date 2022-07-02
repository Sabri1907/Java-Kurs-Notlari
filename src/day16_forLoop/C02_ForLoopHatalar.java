package day16_forLoop;

public class C02_ForLoopHatalar {
    public static void main(String[] args) {

        /*
        NOT: Baslangic noktasindan sonra bitis sartina yaklasmiyorsak
        sonsuz loop olusur.

        Asagidaki ornekte i degeri arttikca bitis sartindan uzaklasiyor bu yuzden sonsuz loop olusur.
         */

        /*
        for (int i = 0; i >-10 ; i++) {
            System.out.println(i);

        }

        */


        /*
        NOT: Eger ilk deger icin bile  bitis sarti saglanmiyorsa for loop calisir
        ama loop body'si calismaz.
         */
        for (int i = 0; i >5 ; i++) {
            System.out.println(i);

        }
    }
}

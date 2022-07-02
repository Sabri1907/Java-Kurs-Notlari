package day16_forLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        /*
        SORU: Verilen bir pozitif tam sayinin pozitif tam
              bolenlerini yazdiralim.
         */

        int input=20;

        for (int i = 1; i <=input ; i++) {
            if (input%i==0){
                System.out.print(i+" ");
            }
        }
    }
}

package day38_exceptions;

public class C01_Exceptions {

    public static void main(String[] args) {

        /*
        Bir sorunla karsilasmayi beklediginiz noktalarda if else ile sorunu yakalayip
        onunla ilgili cozum uretebiliriz.

        Ama sorunu her zaman if else ile cozemeyecegimizden Java try-catch bloklari olusturmustur.
         */

        int a=10;

        int b=0;

        // System.out.println(a/b); // ArithmeticException: / by zero

        int c=1000;
        int d=50;
        int sayac=1;

        while(sayac<100){
           // System.out.println(c/d);
           // d--; // => d 0 oldugunda ArithmeticException: / by zero
           // sayac++;

            if (d==0){
                System.out.println("Islem yapilirken payda 0 oldu, dikkat etmelisiniz");
            }else{
                System.out.println(c/d);

            }
            d--;
            sayac++;
        }
    }
}

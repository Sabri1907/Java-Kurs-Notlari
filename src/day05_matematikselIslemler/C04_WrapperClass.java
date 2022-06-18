package day05_matematikselIslemler;

public class C04_WrapperClass {

    public static void main(String[] args) {

        String str="Java Cok guzel";
        str.toUpperCase();

        int sayi=10;
        /*
        Primitive data turlerinin yaninda method'lar olmaz.
        Java bazi method'lari kullanabilmemiz icin her bir primitive data turu icin bir
        Wrapper Class olusturmustur.
         */

        Integer sayi2=10;

        sayi2.byteValue();


    }
}

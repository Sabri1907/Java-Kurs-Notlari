package day04_dataCasting;

public class C02_DataCasting {

    public static void main(String[] args) {
         int sayi1=23;
         int sayi2=5;
        System.out.println(sayi1/sayi2); //4,6 degil 4 ==> Ikisi de int oldugundan sonuc int olarak


        System.out.println(25*7/3);//58.6666==>58

        double sayi3=5;

        System.out.println(sayi1/sayi3); // 4.6 iki variable'in data turu farkli oldugunda
                                        // daha kapsamli olani data turu olarak kabul eder
    }
}

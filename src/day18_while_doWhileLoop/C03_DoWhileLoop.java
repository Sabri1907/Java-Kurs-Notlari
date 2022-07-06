package day18_while_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        /*
        while loop ile do while loop yapi olarak aynidir.
        Farki: While loop sarti saglamazsa hic calismayabilir.
        doWhileLoop mutlaka calisir sonra sarti kontrol eder. Sarti saglamazsa ikinci seferde calismaz.
         */

        /*
        while loop ile once kontrol edip sonra islem yaptigimiz icin islem bittikten sonra
        loop'un kirilmasi icin bir kez daha basa donmemiz gerfekiyor.
         Bu durumda fazladan bir islem yapiliyor.
         do while Loop ile calistigimizda bu dezavantaj ortadan kalkar.
         Diger bir konu ilk deger ,mutlaka isleme girecegi icin kullanicidan aldigimiz islemlerde
         do while loop kullanmak daha avantajli. Dezaavantaji ise C04'teki ornekte.
         */

        int sayi=7;

        while(sayi<10){

            System.out.println(sayi);

            sayi++;
        }

        /*
        do While ile yapilisi
         */

        do{
            System.out.println(sayi);
            sayi++;
        }while(sayi<10);

    }
}

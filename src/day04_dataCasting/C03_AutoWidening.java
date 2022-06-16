package day04_dataCasting;

public class C03_AutoWidening {
    public static void main(String[] args) {

        byte sayi1=23;
        short sayi2=55;
        int sayi3=sayi1+sayi2; //88 (Byte ve short'un toplami int'a sigacagi icin Java itiraz etmez.)

        double sayi4=sayi1*sayi2; //1265.0 (Sonuc double'a sigacagi icin Java itiraz etmez)

        /*
        sayi4=sayi2/sayi1; //2.0 (sonuc 2.391.... vermesi gerekirken 2.0 cikti. Cunku Java once esitligin
                           // sag tarafini yaptigi icin byte ve shortun islem sonucunu tam sayi olarak alir ve
                           // kusurutani atip variable'a atar. Veri kaybini onlemek Data Casting yaparak onleriz.

        System.out.println(sayi4);

         */

        sayi4=(double)sayi2/sayi1;

        System.out.println(sayi4); //2.391...


    }
}

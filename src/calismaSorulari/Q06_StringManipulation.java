package calismaSorulari;

import java.util.Scanner;

public class Q06_StringManipulation {
    public static void main(String[] args) {
        /*
        SORU: Kullanicidan isim, soyisim ve kredi karti bilgilerini alip asagidaki gibi yazdirin.
        isim-soyisim: M******* B******
        KArt NO: **** **** **** 1455
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim=scan.nextLine();

        System.out.println("Lutfen soyisiminizi giriniz");
        String soyIsim=scan.nextLine();
        System.out.println("Lutfen kredi karti numarasini giriniz");
        String krediKarti=scan.nextLine();



        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        //System.out.println(isim);

        soyIsim=soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w","*");
        //System.out.println(soyIsim);

       // krediKarti=krediKarti.substring(krediKarti.length()-4);

        //System.out.println("Isim-Soyisim: "+isim+" "+soyIsim+"\nKredi Karti: "+"**** **** **** "+krediKarti);

        krediKarti=krediKarti.substring(0,15).replaceAll("\\d","*")+krediKarti.substring(krediKarti.length()-4);
        System.out.println("Isim-Soyisim: "+isim+" "+soyIsim+"\nKredi Karti: "+krediKarti);



    }

}

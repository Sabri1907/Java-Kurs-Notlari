package day14_methodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {
        /*
        SORU: Kullanicidan sehir ismini ve dogum tarihini alip
              bunlari programda kullanacagimiz formatta bize donduren bir method olusturalim.
              Sehir ismini programinizda buyuk harf olarak,
              Dogum Tarihini ise 2022-06-30 formatinda kullanmak istiyuoruz.
         */

        /*
        NOT: Eger bir class'in icerisinde herhangi bir hesaplama yapip
             bunu da kalici olarak saklamak istersek kodumuzu sade ve anlasilir tutmak icin islemi
             bir methodda yapip sonucunu main methoda dondurebiliriz.
             Bu durumda return type'i void olmayan bir method'un sonucunu main methodda
             bir variable'a atama yaparsak programin geri kalaninda bu yeni degeri kullanma sansimiz olur.

         */

        /*
        NOT: Her method icin ayri Scanner olusturmamiz gerekir. Baska methodda olusturulan Scanner
        diger methodda kullanilmaz.
         */
        String sehir1="";

        String sehir= sehirAl();
        String tarih= tarihAl();

        System.out.println("Girdiginiz Sehir: "+sehir); // CANNKIRI
        System.out.println("Girdiginiz tarih: "+tarih); // 2022-07-30
    }

    public static String tarihAl() {
        String tarih="";
        Scanner scan=new Scanner(System.in);
        System.out.println("Yil giriniz");
        int yil=scan.nextInt();
        if (yil>1900 && yil<2100){
            tarih=yil+"-";
        }else{
            System.out.println("Yil icin gecerli bir sayi yazmalisiniz (1900-2100)");
        }


        System.out.println("Kacinci ay oldugunu tamsayi olarak giriniz");
        int ay=scan.nextInt();

        if (ay<=0 || ay>12){
            System.out.println("Ay no 1-12 arasinda olmalidir");
        }else if (ay<10){
            tarih=tarih+"0"+ay+"-";
        }else{
            tarih=tarih+ay+"-";
        }

        System.out.println("Ayin kacinci gun oldugunu tamsayi olarak giriniz");
        int gun=scan.nextInt();

        if (gun<=0 || gun>31){
            System.out.println("Gun no olarak 1-31 arasinda bir sayi girilmelidir");
        }else if (gun<10){
            tarih=tarih+"0"+gun;
        }else{
            tarih=tarih+gun;
        }

        return tarih;



    }


    public static String sehirAl() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sehir adi giriniz");
        String sehir=scan.nextLine().toUpperCase();

        return sehir;


    }

}

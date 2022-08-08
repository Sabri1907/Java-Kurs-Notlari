package practice12_okulProje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogretmenList= new ArrayList<>(); // Kisi Classindan List olusturduk.
    static List<Kisi> ogrenciList= new ArrayList<>(); // Kisi Classindan List olusturduk.

    static Scanner scan=new Scanner(System.in);

    static String kisiTuru;

    public static void girisPaneli(){


        System.out.println("=================================================" +
                                    "\nOGRENCI VE OGRETMEN ISLEMLERI" +
                         "\n=================================================" +
                                    "\n1- OGRENCI ISLEMLERI " +
                                    "\n2- OGRETMEN ISLEMLERI" +
                                    "\nQ- CIKIS ");

        String secim=scan.nextLine().toUpperCase(); // Kullanici kucuk harfe girse bile kontrolu buyuk
                                                    // harfle yapacagimiz icin toUppercase yaptik.

        switch (secim){
            case "1":
                kisiTuru="OGRENCI";

                break;
            case "2":
                kisiTuru="OGRETMEN";
                islemMenusu();

                break;
            case "Q":

                break;
            default:
                System.out.println("Hatali Giris yaptiniz");
                girisPaneli();
                break;
        }



    }

    private static void islemMenusu() {
        System.out.println("Sectigin Kisi Turu: "+kisiTuru);
        System.out.println("============ISLEMLER============" +
                                        "\n1- EKLEME" +
                                        "\n2- ARAMA" +
                                        "\n3- LISTELEME" +
                                        "\n4- SILME" +
                                        "\n5- ANA MENU" +
                                        "\n0- CIKIS");

        System.out.println("Islem tercihini yapiniz");
        int secilenIslem=scan.nextInt();

        switch (secilenIslem){
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                //arama();
                islemMenusu();
            case 3:
                //listeleme();
                islemMenusu();
                break;

            case 4:
                //silme();
                islemMenusu();
                break;

            case 5:
                islemMenusu();
                break;

            case 0:
                //cikis();
                islemMenusu();
                break;

            default:
                System.out.println("Yanlis giris yaptiniz");
                islemMenusu();
                break;


        }

    }

    private static void ekle() { // Bu method hem ogrenci hem de ogretmen eklemek icin tasarlandi

        System.out.println("******* "+ kisiTuru+" ekleme sayfasina hosgeldiniz");
        System.out.println("Isim Soyisim giriniz");
        String adSoyad=scan.nextLine();
        scan.nextLine();

        System.out.println("Kimlik No giriniz");
        String kimlikNo=scan.nextLine();

        System.out.println("Yasinizi giriniz");
        int yas=scan.nextInt();

        if (kisiTuru.equalsIgnoreCase("OGRENCI")){ // Sonra yapacagiz

        }else{
            System.out.println("Bolumunuzu giriniz");
            String bolum=scan.nextLine();
            scan.nextLine();
            System.out.println("Sicil No Giriniz");
            String sicilNo=scan.nextLine();

            Ogretmen ogretmen=new Ogretmen(adSoyad,kimlikNo,yas,bolum,sicilNo);
            ogretmenList.add(ogretmen);
            System.out.println(ogretmenList);

        }
    }


}

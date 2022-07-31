package calismaSorulari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q29_ManavProjesi {
    public static void main(String[] args) {
        /*
====================PROJEMIZ===================================
     * ilk programa girildiginde bizi bir menu karsilasin bu secenekler
        1 manav,
        2 sarkuteri,
        3 market
        secime gor ,
        4-urunleri listele ve
        5-fiyatlari gelsin
     *
     * Basrili Market alış-veriş programı.
        1. Adım:* Ürünler ve fiyatları içeren listeleri oluşturunuz.
        No   Ürün    Fiyat
        ===== ======= ========
        00 Domates 2.10 TL ,
        01 Patates 3.20 TL ,
        02 Biber 1.50 TL ,
        03 Soğan 2.30 TL  ,
        04 Havuç 3.10 TL
        05 Elma 1.20 TL
        06 Muz 1.90 TL
        07 Çilek 6.10 TL
        08 Kavun 4.30 TL
        09 Üzüm 2.70 TL
        10 Limon 0.50 TL
     *
     * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
        * 3. Adım: Kaç kg satın almak istediğini sorunuz.
          4. Adım: Alınacak bu ürünü
     * sepete ekleyiniz ve Sepeti yazdırınız.
         5. Başka bir ürün alıp almak
     * istemediğini sorunuz.
         6. Eğer devam etmek istiyorsa yeniden ürün seçme
     * kısmına yönlendiriniz.
         7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve
     * ödeme sonrasında programı bitiriniz
     */



        //System.out.println("Hosgeldiniz, Lutfen menuden alisveris yapmak istedginiz ilgili alani seciniz" +
                //"\n1. Manav \n2. Sarkuteri \n3. Market");

       Scanner scan=new Scanner(System.in);

        List<String> urunler=new ArrayList<>(); // 1.Adim
        urunler.add(0,"00-Domates");
        urunler.add(1,"01-Patates");
        urunler.add(2,"02-Biber");
        urunler.add(3,"03-Sogan");
        urunler.add(4,"04-Havuc");
        urunler.add(5,"05-Elma");
        urunler.add(6,"06-Muz");
        urunler.add(7,"07-Cilek");
        urunler.add(8,"08-Kavun");
        urunler.add(9,"09-Uzum");
        urunler.add(10,"10-Limon");

        List<Double> fiyatlar=new ArrayList<>(); // 1. Adim
        fiyatlar.add(0,2.10);
        fiyatlar.add(1,3.2);
        fiyatlar.add(2,1.5);
        fiyatlar.add(3,2.3);
        fiyatlar.add(4,3.1);
        fiyatlar.add(5,1.2);
        fiyatlar.add(6,1.9);
        fiyatlar.add(7,6.1);
        fiyatlar.add(8,4.3);
        fiyatlar.add(9,2.7);
        fiyatlar.add(10,0.5);

        for (int i = 0; i <urunler.size() ; i++) {

            for (int j = i; j <=i ; j++) {
                System.out.println(urunler.get(i)+" "+fiyatlar.get(j)+" TL");
            }
        }

        double toplamFiyat=0;

        double odenecekFiyat=0;

        String sepet="";

        String alisveriseDevamMi="evet";

        boolean bl=true;

        while(bl){
            Scanner scan1=new Scanner(System.in);

            System.out.println("Lutfen almak istediginiz urunun numarasini listeden giriniz"); // 2. Adim

            int urunKodu= scan.nextInt();

            System.out.println("Almak istediginiz miktari giriniz");

            double alinanMiktar=scan.nextDouble();

            switch(urunKodu){
                case(0):
                    toplamFiyat+=(alinanMiktar*fiyatlar.get(0));
                    odenecekFiyat+=toplamFiyat;
                    sepet+=sepet+" "+alinanMiktar+" kilo domates : "+toplamFiyat+" TL";
                    System.out.println("Mevcut sepetiniz: "+sepet+"\n Toplam Borcunuz: "+odenecekFiyat+" TL");
                    break;

                case(1):
                    toplamFiyat+=(alinanMiktar*fiyatlar.get(1));
                    odenecekFiyat+=toplamFiyat;
                    sepet+=sepet+" "+alinanMiktar+" kilo patates :  "+toplamFiyat+" TL";
                    System.out.println("Mevcut sepetiniz: "+sepet+"\n Toplam Borcunuz: "+odenecekFiyat);
                    break;

                case(2):
                    toplamFiyat+=(alinanMiktar*fiyatlar.get(2));
                    odenecekFiyat+=toplamFiyat;
                    sepet+=sepet+" "+alinanMiktar+" kilo biber : "+toplamFiyat+" TL";
                    System.out.println("Mevcut sepetiniz: "+sepet+"\n Toplam Borcunuz: "+odenecekFiyat+" TL");
                    break;

                case(3):
                    toplamFiyat+=(alinanMiktar*fiyatlar.get(3));
                    odenecekFiyat+=toplamFiyat;
                    sepet+=sepet+" "+alinanMiktar+" kilo sogan : "+toplamFiyat+" TL";
                    System.out.println("Mevcut sepetiniz: "+sepet+"\n Toplam Borcunuz: "+odenecekFiyat+" TL");
                    break;

                case(4):
                    toplamFiyat+=(alinanMiktar*fiyatlar.get(4));
                    odenecekFiyat+=toplamFiyat;
                    sepet+=sepet+" "+alinanMiktar+" kilo havuc : "+toplamFiyat+" TL";
                    System.out.println("Mevcut sepetiniz: "+sepet+"\n Toplam Borcunuz: "+odenecekFiyat+" TL");
                    break;

                case(5):
                    toplamFiyat+=(alinanMiktar*fiyatlar.get(5));
                    odenecekFiyat+=toplamFiyat;
                    sepet+=sepet+" "+alinanMiktar+" kilo elma : "+toplamFiyat+" TL";
                    System.out.println("Mevcut sepetiniz: "+sepet+"\n Toplam Borcunuz: "+odenecekFiyat+" TL");
                    break;

                case(6):
                    toplamFiyat+=(alinanMiktar*fiyatlar.get(6));
                    odenecekFiyat+=toplamFiyat;
                    sepet+=sepet+" "+alinanMiktar+" kilo muz : "+toplamFiyat+" TL";
                    System.out.println("Mevcut sepetiniz: "+sepet+"\n Toplam Borcunuz: "+odenecekFiyat+" TL");
                    break;

                case(7):
                    toplamFiyat+=(alinanMiktar*fiyatlar.get(7));
                    odenecekFiyat+=toplamFiyat;
                    sepet+=sepet+" "+alinanMiktar+" kilo cilek : "+toplamFiyat+" TL";
                    System.out.println("Mevcut sepetiniz: "+sepet+"\n Toplam Borcunuz: "+odenecekFiyat+" TL");
                    break;

                case(8):
                    toplamFiyat+=(alinanMiktar*fiyatlar.get(8));
                    odenecekFiyat+=toplamFiyat;
                    sepet+=sepet+" "+alinanMiktar+" kilo kavun : "+toplamFiyat+" TL";
                    System.out.println("Mevcut sepetiniz: "+sepet+"\n Toplam Borcunuz: "+odenecekFiyat+" TL");
                    break;

                case(9):
                    toplamFiyat+=(alinanMiktar*fiyatlar.get(9));
                    odenecekFiyat+=toplamFiyat;
                    sepet+=sepet+" "+alinanMiktar+" kilo uzum : "+toplamFiyat+" TL";
                    System.out.println("Mevcut sepetiniz: "+sepet+"\n Toplam Borcunuz: "+odenecekFiyat+" TL");
                    break;

                case(10):
                    toplamFiyat+=(alinanMiktar*fiyatlar.get(10));
                    odenecekFiyat+=toplamFiyat;
                    sepet+=sepet+" "+alinanMiktar+" kilo limon : "+toplamFiyat+" TL";
                    System.out.println("Mevcut sepetiniz: "+sepet+"\n Toplam Borcunuz: "+odenecekFiyat+" TL");
                    break;
            }

            System.out.println("Baska urun almak ister misiniz? Lutfen Evet veya Hayir giriniz"); // 5.Adim
            alisveriseDevamMi=scan.nextLine();

            if (alisveriseDevamMi.equalsIgnoreCase("hayir")){
                bl=false; // 6. Adim
            }


        }

        System.out.println("Kasaya hos geldiniz.\nToplam Borcunuz: "+odenecekFiyat+" TL" +
                "\nBizi terih ettiginiz tesekkur ederiz");  // 7.Adim


    }
}

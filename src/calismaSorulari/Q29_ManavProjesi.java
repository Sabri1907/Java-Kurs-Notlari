package calismaSorulari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q29_ManavProjesi {
    static Scanner scan=new Scanner(System.in);

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



        String urunListesi="00-Domates: 2.10 TL \n01-Patates: 3.2 TL \n02-Biber: 1.5 TL" +
                "\n03-Sogan: 2.3 TL \n04-Havuc: 3.1 TL \n04-Havuc: 3.1 TL \n05-Elma: 1.2 TL" +
                "\n06-Muz: 1.9 TL \n07-Cilek: 6.1 TL \n08-Kavun: 4.3 TL \n09-Uzum: 2.7 TL \n04-Limon: 0.5 TL";

        System.out.println(urunListesi);

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

        double sepetTutari=0;

        double toplamTutar=0;

        String sepet="";

        String alisveriseDevamMi="";

        boolean bl=true;

        while(bl){
            System.out.println("Lutfen almak istediginiz urunun numarasini listeden giriniz"); // 2. Adim

            int urunKodu= scan.nextInt();

            System.out.println("Almak istediginiz miktari giriniz");

            double alinanMiktar=scan.nextDouble();

            switch(urunKodu){
                case(0):
                    sepetTutari+=(alinanMiktar*fiyatlar.get(0));
                    toplamTutar+=sepetTutari;
                    sepet+=sepet+" "+alinanMiktar+" kilo domates : "+sepetTutari+" TL";
                    System.out.println("Mevcut sepetiniz: "+sepet+"\n Toplam Borcunuz: "+toplamTutar+" TL");
                    break;

                case(1):
                    sepetTutari+=(alinanMiktar*fiyatlar.get(1));
                    toplamTutar+=sepetTutari;
                    sepet+=sepet+" "+alinanMiktar+" kilo patates :  "+sepetTutari+" TL";
                    System.out.println("Mevcut sepetiniz: "+sepet+"\n Toplam Borcunuz: "+toplamTutar);
                    break;

                case(2):
                    sepetTutari+=(alinanMiktar*fiyatlar.get(2));
                    toplamTutar+=sepetTutari;
                    sepet+=sepet+" "+alinanMiktar+" kilo biber : "+sepetTutari+" TL";
                    System.out.println("Mevcut sepetiniz: "+sepet+"\n Toplam Borcunuz: "+toplamTutar+" TL");
                    break;

                case(3):
                    sepetTutari+=(alinanMiktar*fiyatlar.get(3));
                    toplamTutar+=sepetTutari;
                    sepet+=sepet+" "+alinanMiktar+" kilo sogan : "+sepetTutari+" TL";
                    System.out.println("Mevcut sepetiniz: "+sepet+"\n Toplam Borcunuz: "+toplamTutar+" TL");
                    break;

                case(4):
                    sepetTutari+=(alinanMiktar*fiyatlar.get(4));
                    toplamTutar+=sepetTutari;
                    sepet+=sepet+" "+alinanMiktar+" kilo havuc : "+sepetTutari+" TL";
                    System.out.println("Mevcut sepetiniz: "+sepet+"\n Toplam Borcunuz: "+toplamTutar+" TL");
                    break;

                case(5):
                    sepetTutari+=(alinanMiktar*fiyatlar.get(5));
                    toplamTutar+=sepetTutari;
                    sepet+=sepet+" "+alinanMiktar+" kilo elma : "+sepetTutari+" TL";
                    System.out.println("Mevcut sepetiniz: "+sepet+"\n Toplam Borcunuz: "+toplamTutar+" TL");
                    break;

                case(6):
                    sepetTutari+=(alinanMiktar*fiyatlar.get(6));
                    toplamTutar+=sepetTutari;
                    sepet+=sepet+" "+alinanMiktar+" kilo muz : "+sepetTutari+" TL";
                    System.out.println("Mevcut sepetiniz: "+sepet+"\n Toplam Borcunuz: "+toplamTutar+" TL");
                    break;

                case(7):
                    sepetTutari+=(alinanMiktar*fiyatlar.get(7));
                    toplamTutar+=sepetTutari;
                    sepet+=sepet+" "+alinanMiktar+" kilo cilek : "+sepetTutari+" TL";
                    System.out.println("Mevcut sepetiniz: "+sepet+"\n Toplam Borcunuz: "+toplamTutar+" TL");
                    break;

                case(8):
                    sepetTutari+=(alinanMiktar*fiyatlar.get(8));
                    toplamTutar+=sepetTutari;
                    sepet+=sepet+" "+alinanMiktar+" kilo kavun : "+sepetTutari+" TL";
                    System.out.println("Mevcut sepetiniz: "+sepet+"\n Toplam Borcunuz: "+toplamTutar+" TL");
                    break;

                case(9):
                    sepetTutari+=(alinanMiktar*fiyatlar.get(9));
                    toplamTutar+=sepetTutari;
                    sepet+=sepet+" "+alinanMiktar+" kilo uzum : "+sepetTutari+" TL";
                    System.out.println("Mevcut sepetiniz: "+sepet+"\n Toplam Borcunuz: "+toplamTutar+" TL");
                    break;

                case(10):
                    sepetTutari+=(alinanMiktar*fiyatlar.get(10));
                    toplamTutar+=sepetTutari;
                    sepet+=sepet+" "+alinanMiktar+" kilo limon : "+sepetTutari+" TL";
                    System.out.println("Mevcut sepetiniz: "+sepet+"\n Toplam Borcunuz: "+toplamTutar+" TL");
                    break;
            }

            System.out.println("Baska urun almak ister misiniz? Lutfen Evet veya Hayir giriniz"); // 5.Adim
            scan.nextLine();
            alisveriseDevamMi=scan.nextLine();

            if (alisveriseDevamMi.equalsIgnoreCase("hayir")){
                bl=false; // 6. Adim
            }


        }

        System.out.println("Kasaya hos geldiniz.\nToplam Borcunuz: "+toplamTutar+" TL" +
                "\nBizi terih ettiginiz tesekkur ederiz");  // 7.Adim


    }
}

package practice10.okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {
    /*
    >> Ogretmen bilgilerini kullanicidan aliniz
    >> Aldiginiz bilgilerden object ureterek yeni ogretmenler olusturun ve bilgilerini yazdiriniz
     */

    public static void main(String[] args) {

        System.out.println("Hos geldiniz");

        System.out.println("Isim giriniz");
        Scanner scan= new Scanner(System.in);
        String isim=scan.nextLine();

        System.out.println("Soyisim giriniz");
        String soyIsim=scan.nextLine();

        System.out.println("Yasinizi giriniz");
        int yas=scan.nextInt();

        System.out.println("Bransinizi giriniz");
        String brans=scan.next();


        System.out.println("Telefon numaranizi giriniz");
        String tel=scan.next();
        //scan.nextLine();

        OgretmenBilgiler adayOgretmen=new OgretmenBilgiler(isim,soyIsim,yas,brans,tel);

        List<OgretmenBilgiler> ogretmenList=new ArrayList<>();

        ogretmenList.add(adayOgretmen);

        System.out.println("ogretmenList = " + ogretmenList);


    }

}

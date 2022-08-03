package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_IcIceTryCatch {
    public static void main(String[] args) {
        int k;
        try {
            FileInputStream fis=new FileInputStream("src/day39_exceptions/Test.txt");

            while((k=fis.read())!=-1){ // Test.txt dosyasini okumasini saglar.
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException e) { //Yukarida fis.read yazdigimizda Java ya okuyamazsam deyip CT Exception verdi.
                                 // Biz de add "catch clause" ile ikinci bir catch blogu ekledik.
                                //NOT: IOException= InputOutput  Exception
            System.out.println("Dosyadan bilgiler okunamadi");

            /*
            ONEMLI NOT: Yukaridaki iki catch blogunun yerini degistirirsek Java CTE veriyor.
                        Daha kapsamli catch blogunu once yazarsak alttaki catch blogunun yapacagi islemi
                        zaten ustteki yapiyor diye uyari yapiyor.
                        Bu yuzden daha kapsamli olan altta yazilir.

                        Bu siralama birbiriyle ilintili (child-parent) exceptionlar icin gecerlidir.
                        Birbiriyle ilgisi olmayan farkli turlerdeki exceptionlar icin SIRALAMA ONEMLI DEGILDIR.
             */
        }
    }
}

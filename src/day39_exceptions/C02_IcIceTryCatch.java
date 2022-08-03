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
        } catch (IOException e) { //yukarida fis.read yazdigimizda Java ya okuyamazsam deyip CT Exception verdi.
                                 // Biz de add "catch clause" ile ikinci bir catch blogu ekledik.
            System.out.println("Dosyadan bilgiler okunamadi");
        }
    }
}

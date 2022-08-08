package practice11_interviewQuestions;

import java.util.Scanner;

public class Q04 {

    /*
    SORU: String olan PIN kodunuzu kontrol eden bir kod yaziniz.
    Bunu kart sifre kontrol'de kullanabilirsiniz.
     */


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String sifre="Sabri123";
        int girisSayisi=3;


        while(true){
            System.out.println("Lutfen sifrenizi giriniz");
            String girilensifre=scan.nextLine();

            if (sifre.equals(girilensifre)){
                System.out.println("Gecerli sifre girdiniz");
                break;
            }else{
                System.out.println("Yanlis sifre girdiniz");
                girisSayisi--;
                System.out.println("Kalan sifre giris hakkiniz: "+girisSayisi);
            }

            if (girisSayisi==0){
                System.out.println("Giris hakkin kalmadi, kart bloke oldu. Giris hakkin: "+girisSayisi);
                break;
            }

        }
    }
}

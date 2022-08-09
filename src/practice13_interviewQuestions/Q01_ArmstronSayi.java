package practice13_interviewQuestions;

import java.util.Scanner;

public class Q01_ArmstronSayi {

     /*  soru1: Check if the integer is an Armstrong numbers to 4 digit
        numbers(4 digit-> exclusive)
            Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri
             toplami o sayiyi veriyorsa sayi  Armstrong sayidir
                (0, 1, 153, 370, 371, 407)
                153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
                370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
                method create ediniz
                parametre sayi aldin method
                sayilarin kuptoplami  conteiner atamasi
                gririlen conteiner
                if icinde kontrol ediniz
                % kullaniniz
               basamaktaki sayi bos variabe olusur


              soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının
              amstrong sayı olup olmadıgını
              gösteren program yazınız
              */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir Sayi giriniz");
        int sayi=scan.nextInt();
        armstrong(sayi);
        girilenSayiyaKadarOlanAmstrongSayilar(sayi);


    }

    private static void girilenSayiyaKadarOlanAmstrongSayilar(int sayi) {
        for (int i = 1; i <=sayi ; i++) {
            armstrong(i); // Method icinde method call yapilmasina recursive denir.

        }
    }

    private static void armstrong(int sayi) {
        int sayininKupleriToplami=0;
        int basamaktakiSayi=0;
        int girilenSayi=sayi; // Sayi method icinde degisime ugrayacagi icin girilen
                            // sayiyi korumak icin yeni bir variable'a atadik.

        while(sayi>0){
            basamaktakiSayi=sayi%10;
            sayininKupleriToplami+=(basamaktakiSayi*basamaktakiSayi*basamaktakiSayi);
            sayi=sayi/10;
        }

        if (girilenSayi==sayininKupleriToplami){
            System.out.println("Girilen Sayi armstron sayidir :"+ girilenSayi);
        }else{
            System.out.println("Girilen Sayi armstron sayidi degildir: "+girilenSayi);
        }
    }

}

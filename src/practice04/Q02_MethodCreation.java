package practice04;

import java.util.Scanner;

public class Q02_MethodCreation {
    public static void main(String[] args) {
        /*
            cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Metre ve kilometreye donusturmek istediginiz cm degerini giriniz");

        double santiMeterValue=scan.nextDouble();

        convertCm(santiMeterValue);
    }

    public static void convertCm(double santiMeterValue) {
        double meter=santiMeterValue/100;
        double kilometer=santiMeterValue/100000;
        System.out.println("Girdiginiz "+santiMeterValue+ " cm degeri :"+ meter+"metre, "+kilometer+"kilometre'dir.");
    }
}

package practice07;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_Arrays_EnBuyukEnKucukFarki {
    /*
    SORU: Kullanicinin girdigi bir array'in en buyuk ve en kucuk elemaninin
    farkini bulan bir method create ediniz.
     */

    public static void main(String[] args) {

        farkiniBul();
    }

    public static void farkiniBul() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen array'in uzunlugunu giriniz");
        int uzunluk= scan.nextInt();
        int[]arr=new int[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("Array'in "+(i+1)+". elemanini giriniz"); // i 0'dan basladigi icin i+1 yaptik
            arr[i]=scan.nextInt();

        }

        Arrays.toString(arr);

        System.out.println("Array'daki en buyuk ve en kucuk eleman arasindaki fark: "
                + (arr[uzunluk-1]-arr[0]));

        // ODEV: Bu soruyu Math classini kullanarak cozun


    }
}

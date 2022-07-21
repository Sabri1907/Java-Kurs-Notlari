package calismaSorulari;

import java.util.Arrays;
import java.util.Scanner;

public class Q23_Array_KullanicidanAlma {
    /*
    SORU: Kullanicidan bir array’in boyutunu ve tum elementlerini alarak bir array
          olusturup, bu array’i bize donduren bir method olusturun
     */

    public static void main(String[] args) {




        String arr1[]=kullanicidanArrayOlustur();

        System.out.println("Olusturulan Array: "+Arrays.toString(arr1));



    }

    public static String[] kullanicidanArrayOlustur() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Olusturmak istediginiz arrayin boyutunu giriniz");
        String arr[]=new String[scan.nextInt()];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Lutfen Array'in "+i+"'inci index icin element giriniz");
            arr[i]=scan.nextLine();

        }

        return arr;

    }
}

package calismaSorulari;

import java.util.Arrays;
import java.util.Scanner;

public class Q21_Array_Iceriyormu {

    /*
        SORU:Verilen bir array’in istenen bir elemani icerip icermedigini kontrol edip, bize
             true veya false sonucu donen bir method olusturun.
     */

    public static void main(String[] args) {
        String [] arr={"Ali", "Can", "Ayse", "Yusuf", "Murat"};
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen aramak istediginiz ismi yaziniz");
        String arananStr=scan.nextLine();


        System.out.println("iceriyormu= " + iceriyormu(arr, arananStr));
    }

    public static boolean iceriyormu(String[] arr, String arananStr) {
        boolean sonuc=false;
        for (int i = 0; i <arr.length ; i++) {

            if (arr[i].equalsIgnoreCase(arananStr)){

                sonuc=true;
            }

        }








        return sonuc;
    }

}

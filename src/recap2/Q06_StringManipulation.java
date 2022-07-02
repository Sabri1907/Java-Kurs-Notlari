package recap2;

import java.util.Scanner;

public class Q06_StringManipulation {
    public static void main(String[] args) {
        /*
        Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi
        String manipulation method kullanarak birlestiriniz.
        Yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("String1 giriniz: ");
        String str1=scan.nextLine();


        System.out.println("String2 giriniz: ");
        String str2=scan.nextLine();

        System.out.println("1.Yontem: "+str1+ " "+str2);
        System.out.println("2.Yontem: "+str1.concat(" "+str2));

        String str1Yeni=str1.substring(1);
        String str2Yeni=str2.substring(1);

        System.out.println("Manipulation'dan Sonraki Hali 1.Yontem: "+str1Yeni+""+str2Yeni);
        System.out.println("Manipulation'dan Sonraki Hali 2.Yontem: "+str1.substring(1)+str2.substring(1));
    }
}

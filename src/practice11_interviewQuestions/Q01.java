package practice11_interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
    /*
    SORU: Kullanicidan bir string aliniz.
    String'de var olan caharacter'in sayisini ekrana yazdiriniz.
    ORNEK= yapacam=> a=3, y=1, np=1, c=1
           hallolur yaaa=> a=4, l=3, h=1, o=1, u=1, y=1
     */

    /*
    1. Once scanner olusturacaz
    2. Split methodu kullanacagiz
    3.Sonra sort yapacagiz
    4.For loop'a alacagiz
    5. if ile kontrol yapacagiz ve sout ile yapacagiz'
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir string giriniz");
        String str=scan.nextLine();

        String arr[]=str.split("");

        System.out.println(Arrays.toString(arr));

        // sort yaptik

        Arrays.sort(arr);
        System.out.println("arra'nin sort'lanmis hali: "+Arrays.toString(arr));

        int counter=0;
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i-1].equalsIgnoreCase(arr[i])){
                counter++;
            }else{
                System.out.print(arr[i-1]+"= "+(counter+1)+", ");
                counter=0;
            }
            if (i==arr.length-1){
                System.out.print(arr[i]+" ="+(counter+1));
            }
        }



    }

}

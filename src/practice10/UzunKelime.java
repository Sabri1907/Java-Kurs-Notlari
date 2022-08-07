package practice10;

import java.util.Scanner;

public class UzunKelime {
    /*
       >> Kullanicidan gelen cumleyi parametre olarak alan ve cumledeki en uzun kelimeyi
       return eden Longestword(sentence) methodu cerate edin.
       >> Trick: Ayni uzunlukta iki veya daha fazla kelime varsa, String'deki ilki sozcugu return etsin.
       >> Noktalama isaretlerini dikkate almayin ve cumlenin bos olmayacagini varsayin.
        */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Bir cumle giriniz");
        String cumle=scan.nextLine();

        System.out.println("enUzunKelime(cumle) = " + enUzunKelime(cumle));

        //Ben bugun Java'yi cok sevdim ama cok zorlandim


    }

    public static String enUzunKelime(String cumle) {

        String arr[]=cumle.split(" ");
        int max=0;
        String longestWord="";

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length()>max){
                max=arr[i].length();
                longestWord=arr[i];

            }



        }
        return longestWord;
    }
}

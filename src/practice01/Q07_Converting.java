package practice01;

import java.util.Scanner;

public class Q07_Converting {

    /*
    galonu litreye ceviren bir java programi yaziniz
        1 gallon = 3.785 litre
    litreyi galona ceviren bir java programi yaziniz
        1 litre = 1/3.785 gallon

    // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
    // formül
    // c = (f-32)*5/9
 */

    public static void main(String[] args) {
        int gallon=1;
        double litre=gallon*3.785;
        String sonuc1=gallon+ " Gallon "+ litre+ " litreye esittir";
        System.out.println(sonuc1);

        int litre2=1;
        double gallon2= litre2/3.785;
        System.out.println(litre2+ " Litre "+ gallon2+ " galona esittir");

        System.out.println("************************\n************************");

        Scanner scan=new Scanner(System.in);
        System.out.print("Santigrat karsiligini ogrenmek istediginiz Fahreneit degeri giriniz: ");
        double fh= scan.nextDouble();
        System.out.println("Girdiginiz Fahreneit Degeri "+ (fh-32)*5/9+ " santigrattir");
    }
}

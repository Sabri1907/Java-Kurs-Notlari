package day08_ifStatements;

import java.util.Scanner;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan 100 uzerinden notunu isteyin. Not'u harf sistemine cevirip asagidaki gibi yazdirin.
        -> 50>not      "D"
        -> 50=<not<60  "C"
        -> 60=<not<80  "B"
        -> 80=<not     "A"
        -> Gecersiz not girdiginde uyari verilsin
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen 0-100 arasi bir not degeri giriniz: ");
        double note=scan.nextDouble();
        if (note<0 || note>100){
            System.out.println("Lutfen gecerli bir not giriniz");
        } else if (note<50){     // Java bu satira geldiyse not 0-100 arasindadir.
            System.out.println("Notunuz : D");

        } else if (note<60){    // Java bu satira geldiyse not 50-100 arasindadir.
                                // 50"den Kucuk olma ihtimali olmadigi icin tekrar OR kullanmadik.
            System.out.println("Notunuz : C");

        } else if (note<80){    // Java bu satira geldiyse not 60-100 arasindadir.
            System.out.println("Notunuz : B");

        } else{                // Java bu satira geldiyse not 60-100 arasindadir. O yuzden sart yazmaya gerek yok.

            System.out.println("Notunuz : A");
        }
    }
}

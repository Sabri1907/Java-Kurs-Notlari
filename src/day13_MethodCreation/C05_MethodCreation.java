package day13_MethodCreation;

import java.util.Scanner;

public class C05_MethodCreation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sifre giriniz");
        String sifre=scan.next();

        if (sifre.length()>=8 &&
                sifre.charAt(0)>='A' &&
                sifre.charAt(0)<='Z'&&
                sifre.charAt(sifre.length()-1)>='a' &&
                sifre.charAt(sifre.length()-1)<='z' &&
                !sifre.contains(" ")){
            System.out.println("Sifre basari ile tanimlandi");
        }else {
            System.out.println("lutfen yeni bir sifre girin");
        }
    }
}

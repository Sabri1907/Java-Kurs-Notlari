package day14_methodCreation;

import day13_MethodCreation.C04_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {
        /*
        SORU: input olarak verilen 4 harfli br string'i
              tersten yazdiran bir method olusturun
         */

        terstenYazdir("Okan");
        C04_MethodCreation.topla(7,15); // 22


    }

    public static void terstenYazdir(String input){
        String tersInput=input.substring(3)+
                         input.substring(2,3)+
                         input.substring(1,2)+
                         input.substring(0,1);

        System.out.println("Verilen kelimenin tersten yazilisi: "+tersInput);

    }
}

package day29_passByValue_immutable;

public class C04_Immutable {
    public static void main(String[] args) {
        /*
        IMMUTABLE   : degistirilemez
        MUTABLE     : degistirilebilir

        En meshur immutable class : String (NOT: 2String bir class'dir.)
         */

        String str="Yildiz Bank";
        System.out.println(str.toUpperCase()); //YİLDİZ BANK

        str.toLowerCase();

        System.out.println(str); // Yildiz Bank ==> Cunku String immutable'dir.

        /*
        Java'da String gibi metin ifadelerde kullanacabilecegimiz
        mutable StringBuilder class'i da vardir.

        Atama yapmasak da yapilan degisikler kalici olur.
         */

        StringBuilder sb=new StringBuilder("Java Bank");

        System.out.println(sb); //Java Bank

        sb.reverse();

        System.out.println(sb); // knaB avaJ

        sb.append(".");

        System.out.println(sb); // knaB avaJ.



    }
}

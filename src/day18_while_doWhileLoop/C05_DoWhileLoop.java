package day18_while_doWhileLoop;

public class C05_DoWhileLoop {
    public static void main(String[] args) {

        // SORU: 9'dan 190'a 7 kati olan tum sayilari ekrana yazdirin.


        int bas = 9;
        int bitis = 190;

        int temp = bas;


        System.out.println("========while ile Yapilisi=========");

        while (temp < bitis) {

            if (temp % 7 == 0) {
                System.out.print(temp + " ");

            }
            temp++;

        }
        temp = bas;
        System.out.println("");
        System.out.println("======== Do while Loop ile Yapilisi=========");

        do {

            if (temp % 7 == 0) {
                System.out.print(temp + " ");

            }
            temp++;

        } while (temp < bitis);
    }
}

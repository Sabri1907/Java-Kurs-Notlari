package day17_nestedForLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        /*
        SORU: Veerilen String'i asagidaki gibi yazdiran bir program yaziniz

        Input:Yusuf
        Y
        Yu
        Yus
        Yusu
        Yusuf

         */

        String input="Yusuf";
        for (int i = 0; i <=input.length()-1 ; i++) {

            for (int j =0 ; j <=i ; j++) {
                System.out.print(input.substring(j,j+1));

            }
            System.out.println("");
        }
    }
}

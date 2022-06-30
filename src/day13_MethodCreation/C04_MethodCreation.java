package day13_MethodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {
        /*
        input olarak verilen 2 Integer'i toplayip yazdiran
        bir method olusturun.
         */

        int input1=30;
        int input2=20;

        // Method 4 adimda olusturulur.

        // 1.Adim: Method Call
        // 2. Adim: Argument eklenmesi gerekiyorsa ekleyelim.
        //          Eger methodun return type'i void'den farkli olacaksa bir variable olusturup,
        //          method call'u assign ederiz.

        topla(input1,input2);




    }

    public static void topla(int input1, int input2) {
        //3.Adim: Method deklarasyonunda degistirilmesi gereken kisimlar
        // varsa (access modifier, return type vb.) degistiririz.

        //4.Adim: Eger return type void disinda bir seyse "return" keywordu ve donecek degeri hesaplamaliyiz.

        System.out.println("Girilen inputlarin toplami: "+(input1+input2));
    }
}

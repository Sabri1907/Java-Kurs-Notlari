package calismaSorulari;

public class Q18_For_WhileLoop {
    public static void main(String[] args) {

        /*
        SORU: 20'ye tam bolunen sayilari yaziniz
        */
        int sayi=20;
        for (int i = -sayi; i <=sayi ; i++) {
            if (!(i==0) && sayi%i==0){
                System.out.print(i+" ");
            }

        }

        System.out.println("");
        System.out.println("********** WHILE LOOP ILE YAPILISI**********");

        int temp=-20;

         while(temp<=20){
             if (!(temp==0) && sayi%temp==0){
                 System.out.print(temp+" ");
             }

             temp++;
         }

    }
}

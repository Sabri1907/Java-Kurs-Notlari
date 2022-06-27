package calismaSorulari;

import java.util.Scanner;

public class Q01_IfStatemenHaftaninGunleri {

    public static void main(String[] args) {
        /*
        SORU: Kullanicidan gun isimlerinden birinin ilk hatfini isteyin ve o gunle baslayan gun
        isimlerini yazdirin.
        Ornek: P icin Pazartesi, Persembe,Pazar
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen gun isimlerinden birinin bas harfini giriniz: ");
        char gunBasHarfi=scan.nextLine().toUpperCase().charAt(0);
        if (gunBasHarfi=='P'){
            System.out.println("\"P\" harfi ile baslayan gunler: "+ "Pazartesi, Persembe, Pazar");
        }
        if (gunBasHarfi=='S'){
            System.out.println("\"S\" harfi ile baslayan gunler: "+ "Sali");
        }
        if (gunBasHarfi=='C'){
            System.out.println("\"C\" harfi ile baslayan gunler: "+ "Carsamba, Cuma, Cumartesi");
        }

    }


}

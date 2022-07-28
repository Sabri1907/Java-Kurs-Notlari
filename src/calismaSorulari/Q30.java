package calismaSorulari;

public class Q30 {
    public static void main(String[] args) {
        /*
        SORU: Kullanicidan email adresini girmesini isteyin, mail @gmail.com
        icermiyorsa “lutfen gmail adresi giriniz”, @gmail.com ile bitiyorsa “Email adresiniz
        kaydedildi “ , @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
         */

        String mail="@gmail.comguvendisabri";

        if (!mail.contains("@gmail.com")){
            System.out.println("lutfen gmail adresi giriniz");
        } else if (mail.endsWith("gmail.com")){
            System.out.println("Emailiniz kaydedildi.");
        }else{
            System.out.println("Lutfen yazimi kontrol ediniz");
        }

    }
}

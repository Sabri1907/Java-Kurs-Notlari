package day38_exceptions;

public class C02_Exceptions {
    public static void main(String[] args) {
        int a=1000;
        int b=50;
        int sayac=1;

        while(sayac<100){
            /*

            try catc 3 kisimdan olusur
            1. Try blogu: yapmaya calistigimiz ama risk oldugunu dusundugumuz islemleri yazmak kullanilir.

            2. Catch'den sonraki parantez: karsilasmayi bekledigimiz exception turunu Java'ya soylemek icin
            kullanilir.

            3. Catch blogu: Java'ya soyledigimiz exception (istisnai durum) gerceklesirse Java'nin yapmasini
            istedigimiz islem.

            catch blogunun onundeki paranteze karsilasmayi bekledigimiz exception'i yazabilir veya
            her turlu exception'da devreye girmesini istiyorsak tum exception'larin parent'i olan
            Exception yazariz.
             */
            try {
                System.out.println(a/b);
            } catch (ArithmeticException e) {
                System.out.println("payda 0 oldu dikkatli ol");
            }
            b--;
            sayac++;


            }
        int sayi1=10;
        int sayi2=0;

        try {
            int sonuc=sayi1/sayi2;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Payda 0 olamaz");
        }

        System.out.println("Kodumuz calismaya devam etti");

    }
    }


package day04_dataCasting;

public class C04_ExplicitNarrowing {

    public static void main(String[] args) {
         int sayi1=50;

         short sayi2= (short) sayi1;
         /*
            Genis data turundeki degeri, dara data turundeki variable'a atamak istersek
         Java genis data turundeki degerin, dar data turunun sinirlarina uyup uymayacagini calistirana kadar
         bilemez. Ama Java risk almaz.
            Riski sifira indirmek icin burada bir sorun olursa sorumlulugu kabul etmemizi bekler.
         Bunun icin degerinin onune parantez icinde istedigimiz data turunu yazmamiz gerekir.

             Bu riski ustlendigimizde 3 durum olusabilir;
         1. Bizim degerimiz dar kalip sinirlarina uygun olursa hic bir kayip olmadan cast olur.
         2. Double bir sayiyi int'a cast etmek gibi durumlarda data kaybi yasayabiliriz (Ondalik kismi)
         3. Genis kaliptan degeri dar kaliba koydugumuzda, sinirlari asan durumlarda veri baskalasabilir.
         Ornek: Byte'ta 127'den sonrasi -128'den 0'a dogru devam eder.

          */
    }
}

package day39_exceptions;

public class C03_Exceptions {
    public static void main(String[] args) {

        String str="123a5"; // Sayinin birini harf yapsak RT exception verir.

        int sayi= 0;
        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Yazdiginiz deger sadece rakamlardan olusmalidir.");
        }
        catch (Exception e) {
            System.out.println("Ongorulemeyen bir hata olustu.");
        }

        System.out.println("Sayinin karesi : "+ sayi*sayi);

       // String str2=3; => Bu bir exception degildir, Compile Time Error'dur.

        /*
        Kullanicidan String olarak bir deger aliyor ve bunu Integer'a ceviriyorsak
        NumberFormatException ile karsilasabilecegimizi ongoruruz.
        NFE aldigimizda kodun durmamasini istiyorsak try-catch ile cevrelebiliyoruz.

        Eger bilmedigim bir exception daha olusursa kodum durmasin istiyorsak bir kere daha
        catch blogu ekleyip ona en genis exception'i yazabiliriz.
         */
    }
}

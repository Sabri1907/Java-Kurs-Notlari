package practice12_okulProje;

public class Kisi {
    /*
    BİR OKUL YÖNETİM PLATFORMU KODLAYINIZ.
    1.  Bu programda, Öğrenci ve Öğretmen Kayıtları ile ilgili işlemler yapılabilmelidir.
        Kayıtlarda şu bilgiler olabilmelidir.
        Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
        Öğrenci: Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.
     */

    private String adSoyad;
    private String kimlikNo;
    private int yas; // Herkesin ortak ozelligi

    public Kisi(String adSoyad, String kimlikNo, int yas) {
        this.adSoyad = adSoyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }

    public Kisi() {
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public void setYas(int yas) { // Yas kontolu yapiniz
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "\nKisi{" +
                "\nadSoyad='" + adSoyad + '\'' +
                "\n kimlikNo='" + kimlikNo + '\'' +
                "\nyas=" + yas;
    }
}

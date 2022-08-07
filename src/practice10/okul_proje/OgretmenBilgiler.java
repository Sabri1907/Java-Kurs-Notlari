package practice10.okul_proje;

public class OgretmenBilgiler {

    String isim;
    String soyIsim;
    int yas;
    String brans;
    String tel;

    public OgretmenBilgiler() {
    }

    public OgretmenBilgiler(String isim, String soyIsim, int yas, String brans, String tel) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.yas = yas;
        this.brans = brans;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "\nOgretmenBilgiler" +
                "\nisim='" + isim + '\'' +
                ",\nsoyIsim='" + soyIsim + '\'' +
                "\nyas=" + yas +
                "\nbrans='" + brans + '\'' +
                "\ntel='" + tel + '\''
                ;
    }
}

package aaoop;

public class NightTeam {
    String isim="Isim belirtilmedi";
    String Soyisim="Soyisim belirtilmedi";
    String favoriRengi="Renk Belirtilmedi";
    boolean ciftDikismi=true;

    void dersCalisma(){
        System.out.println("Herkes farkli surede ders calisir");
    }

    void isBulma(){
        System.out.println("Calisan ve calismayanlar var");
    }

    @Override
    public String toString() {
        return "\nisim='" + isim + '\'' +
                "\nSoyisim='" + Soyisim + '\'' +
                "\nfavoriRengi='" + favoriRengi + '\'' +
                "\nciftDikismi=" + ciftDikismi;
    }
}

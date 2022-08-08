package aaoop;

public class Soner extends NightTeam{
    public static void main(String[] args) {

    NightTeam snr=new Soner();
    snr.isim="Soner";
    snr.ciftDikismi=true;
    snr.favoriRengi="yesil";

    System.out.println(snr);

    System.out.println(snr.isim);

    snr.dersCalisma();
    snr.isBulma();







    }

    void dersCalisma(){
        System.out.println("Soner arada bir ders calisir");
    }

}

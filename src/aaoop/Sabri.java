package aaoop;

public class Sabri extends NightTeam{
    public static void main(String[] args) {

        Sabri sbr=new Sabri();
        sbr.isim="Sabri";
        sbr.Soyisim="GUVENDI";
        sbr.favoriRengi="Mavi";

        System.out.println(sbr);

        NightTeam nt=new NightTeam();
        nt.dersCalisma();

        sbr.dersCalisma();
        nt.dersCalisma();
        sbr.isBulma();




    }

    void dersCalisma(){
        System.out.println("Sabri gunde 5 saat ders calisir");
    }

}

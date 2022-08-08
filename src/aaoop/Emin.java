package aaoop;

public class Emin extends NightTeam{
    public static void main(String[] args) {

        Emin emn=new Emin();
        emn.isim="Emin";
        emn.Soyisim="Yuksel";
        emn.favoriRengi="KIRMIZI";

        System.out.println(emn);

        emn.dersCalisma();
        emn.isBulma();





    }

    @Override
    void dersCalisma() {
        System.out.println("Emin gunde 10 saat ders calisir");
    }

    void isBulma(){
        System.out.println("Emin IT icin isi birakti");
    }
}

package day37_overriding;

public class EToyota extends DAraba{

    @Override
    void marka() {
        /*super.marka();
        Eger hem overriding hem de overriden methodunu calismasini istersek ilk satira super.marka();
        yazabiliriz.
        Bu super()'dan farkli, super() constructor call'da kullanilir.
         */
    }

    void motor(){
        System.out.println("Toyota araclar Toyota marka kullanir");
    }
}

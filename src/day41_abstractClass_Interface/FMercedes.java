package day41_abstractClass_Interface;

public class FMercedes extends DAraba {

    @Override
    protected void motor() {
        /*/
            Abstract bir parent class'i concrete bir child inherit ederse parent abstract
        class'daki tum abstract method'lari override etmek zorundadir.

            Abstract bir class, abstract baska bir class'i parent edinirse; parent class'daki
        tum abstract method'lari override etmek ZORUNDA DEGILDIR.
         */
    }

    @Override
    protected void yakit() {

    }

    @Override
    protected void kaporta() {

    }
}

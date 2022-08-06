package day41_abstractClass_Interface;

public class GCorolla extends EToyota{
    @Override
    protected void yakit() {

    }

    @Override
    protected void kaporta() {

    }

    /*
        Corolla class'inin 2 tane parent'i var. (EToyota > Daraba)
    Corolla parent'larinin ikisinin de standartlarina (abstract methodlarina) uymak zorundadir.

        Concrete bir class parenti olan tum abstract class'larda abstract olan methodlari implement
    etmek zorundadir.
        Ancak parent-child silsilesinde override edilerek concrete yapilan method'lari override
    etmek ZORUNDA DEGILDIR.
     */
}

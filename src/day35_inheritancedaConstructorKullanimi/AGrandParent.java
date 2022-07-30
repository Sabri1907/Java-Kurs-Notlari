package day35_inheritancedaConstructorKullanimi;

public class AGrandParent {

    protected String isim="Grandpa ismi belirtilmedi";

    /*
    Her class'da gorunmese bile bir constructor vardir.
    Bu class'dan obje lusturmak istedigimizde default constructor devreye girecektir.

    Default constructor'u gozlemleyemeyecegimiz icin onun yerine kullanilabilecek parametresiz
    constructor olusturalim.
     */

    AGrandParent(){
        System.out.println("Grandpa constructor calisti");
    }
}

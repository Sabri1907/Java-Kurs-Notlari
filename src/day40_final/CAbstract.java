package day40_final;

public abstract class CAbstract {

    /*
    Bir class'i abstract yapmak icin class'dan once abstruct yazariz.
    Abstruct class'lart variable'larla ilgili degil methodlarla ilgilidir.
     */

    void toplama(){
        System.out.println("Bu method toplama yapar");
    }
    abstract void carpma();

    abstract void bolme();

    // abstract void carpma();{} Abstract methodlarin body'si yoktur. O yuzden Java altini cizer.
}

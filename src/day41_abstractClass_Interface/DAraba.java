package day41_abstractClass_Interface;

public abstract class DAraba {
    public static void main(String[] args) {
        /*
            Bir class'dan object olusturmayacaksak o class'i child class'lar icin kural koyan
        class yapmak istiyorsak o class'i abstract class yapariz.
            Kural koymak derken child class'larda olmasi gereken methodlari belirler.

            Abstract class'da main method opsiyonel'dir
           Eger abstract class sadece child class'larin tasimak zorunda oldugu ozellikleri belirlemek icin
           olusturulduysa main method'a ihtiyac olmaz  sadece abstract method'lar olur
           Ama bir abstract method'da standart belirlemek disinda da method'lar calisabilir
           bu durumda ihtiyac olursa main method olusturulabilir
         */

    }

    protected abstract void motor(); //{}
    /*
        Sadece child class'larin mecburi tasiyacaklari ozellikleri belirleyen method'lar
    abstract method olur ve abstract method'larin body'si olmaz.
     */

    protected abstract void yakit();
    protected abstract void kaporta();

    public void klima(){
        System.out.println("Bazi arabalarda klima olabilir.");
        /*
           Abstract olmayan method'lara CONCRETE method denir.
        Abstract bir methodu "abstract" keyword ile belirlemek ZORUNLUDUR.
        Concrete methodlarda bunun declare edilmesine gerek yoktur.
        Biz sadece abstraction ile ilgili konustugumuzda abstract olmayan methodlardan
        bahsetmek icin concrete tabirini kullaniriz.
         */
    }
}

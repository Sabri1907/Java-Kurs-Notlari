package day42_abstractClass_interface;

public class K_ChildClassIfInterfaces implements I02_Interfaces,I03_Interfaces{

    /*
    => Bir class'i bir Interface'e child yapmak icin implements keyword kullanilir.
    Implements dedikten sonra virgul yazarak istedigimiz kadar Interface ekleyebiliriz.

    => Interface'i interface'e child yapmak istersek extends keyword'u kullanilir.

    NOT: Interface'i class'a CHILD YAPAMAYIZ.

     */
    public static void main(String[] args) {
        System.out.println(I02_Interfaces.SAYI); //20
        System.out.println(I03_Interfaces.SAYI); // 30
        System.out.println(ISIM); // Yildiz Koleji

        /*
        Farkli Interface'lerden ayni isimde variable kullanmak istersek SinifIsmi.variable ismi
        yazarak istedigimiz Interface'deki variable'i kullaniriz.

        NOT: Farkli Interface'lerde ayni isimde ama farkli data turunde methodlar varsa, Java
        child class'in o iki Interface'i birden implement etmesine izin verez.
        CTE verir.
         */
    }

    @Override
    public void yakit() {

    }

    @Override
    public void motor() {

    }

    @Override
    public void teker() {

    }
}

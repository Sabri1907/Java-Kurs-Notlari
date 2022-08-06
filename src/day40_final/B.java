package day40_final;

final public class B extends A{

    public static void main(String[] args) {

        B obj = new B();
        obj.isim="Alp";

        System.out.println(obj.isim); // Alp
        System.out.println(A.OKUL); // Yildiz Koleji

        /*
        Bir class final olarak belirlenirse o class inherit edilemez.
         */




    }
}

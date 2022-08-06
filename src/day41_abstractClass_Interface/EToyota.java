package day41_abstractClass_Interface;

public abstract class EToyota extends DAraba{
    @Override
    public void motor() {
        System.out.println("Toyota arabalar cevreci motor kullanir.");
    }

    /*
        Parent class'daki standart belirleyici method (abstract method)'larin tamami
     child class classlar tarafindan override edilmelidir.

        Concrete method'larin override edilme mecburiyeti yoktur.
      Istersek override ederiz, istemezsek override etmeyiz.

        Aslinda EToyota class'i da obje uretecegimiz bir class degil. (Toyota genel isim boyle araba yok)
      Bu durumda proje tasarimi yapiyorsak EToyota class'ini da abstract yapmamiz daha guzel olur.
     */
}

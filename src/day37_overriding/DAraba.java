package day37_overriding;

public class DAraba {

    private void yakit(){
        System.out.println("Tum arabalar yakit kullanir");

        /*
        Parent class'dan override edilmesini istemedigimiz method'larin access modifier'larini
        private, static veya final yapabiliriz.
         */
    }

    void marka(){
        System.out.println("Tum arabalarin markasi vardir");
    }

    void motor(){
        System.out.println("Tum arabalarin motoru vardir");
    }

}

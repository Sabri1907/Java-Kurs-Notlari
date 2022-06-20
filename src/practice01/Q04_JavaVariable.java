package practice01;

public class Q04_JavaVariable {
    public static void main(String[] args) {
    // Initializing Variable  //variable baslangic degeri verme
        int yas=36;
        double boy=1.78;
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);

        System.out.println("************************\n************************");

    // To copy the variable's value
        int yasim=37;
        int aliYas=yasim;
        System.out.println("yasim = " + yasim);
        System.out.println("aliYas = " + aliYas);

        System.out.println("************************\n************************");

    // you can declare multiple variables in the same line
        int yil=22, ay=6, gun=20;
        System.out.println("yil = " + yil);
        System.out.println("ay = " + ay);
        System.out.println("gun = " + gun);

        System.out.println("************************\n************************");


        // updating a variable
        yil=2023;
        System.out.println("Update Yil: " + yil);

        System.out.println("************************\n************************");

        //Bir degisken tanimlayin : x
        //Baska bir degiskeni initialize edin : y
        //x degiskenini initialize edin
        //y degiskenini yeni bir degerle guncelleyin
    }

}

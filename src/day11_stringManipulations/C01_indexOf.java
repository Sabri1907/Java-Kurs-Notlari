package day11_stringManipulations;

public class C01_indexOf {
    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";

        /*
            Verilen bir String'de herhangi bir String veya char'in ilk kullanildigi index'i
        bize dondurur. Case sensitive calisir. Buyuk/kucuk harf duyarlidir.
         */

        System.out.println(str.indexOf('g')); // 6
        System.out.println(str.indexOf("r")); // 7
        System.out.println(str.indexOf("j")); //-1

        System.out.println(str.indexOf("mek")); // 10

        /*
        Eger istedigimiz index'den sonrasini kontrol etmek istersek o zaman ayni methodu
        iki parametreli olarak kullaniriz. (fromindex) Aramaya yazilan index dahil baslar.
         */

        System.out.println(str.indexOf("g",6)); // 6 yazilan index'den basladigi 6 dondurur.
        System.out.println(str.indexOf("g",7)); // 18 yazilan index'den basladigi 6 dondurur.

        /*
        SORU: Yukaridaki str'da 2. ve 3. e'nin indexlerini bulun.
        2. e'yi bulabilmek icin 1. e'nin indexine ihtioyacim var.
         */

        int ilke=str.indexOf("e");
        int ikincie=str.indexOf("e",ilke+1);


        // Eger 2. e varsa 3.e'nin olup olmadigini ve varsa indexini yazdiralim.

        if (ikincie==-1){

            System.out.println("Verilen str'da ikinci e yok");

        } else{

            int ucuncue=str.indexOf("e",ikincie+1);

            if (ucuncue==-1){
                System.out.println("Verilen str'da ucuncu e yok");
            }else{
                System.out.println("Verilen str'daki ucuncu e'nin degeri: "+ucuncue);
            }
        }




    }
}

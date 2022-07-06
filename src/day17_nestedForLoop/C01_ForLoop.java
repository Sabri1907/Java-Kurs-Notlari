package day17_nestedForLoop;

public class C01_ForLoop {

    public static void main(String[] args) {
        /*
    SORU: Verilen String'deki kullanilan harfleri tekrarsiz olarak yazdirip kelimede
    kullanilan farkli harf sayisini veren bir method yaziniz
     */

        String input="Java her zaman guzel";

        tekrarsizYap(input);

    }

    public static void tekrarsizYap(String input) {
        String benzersizInput="";
        String islenecekKelime=input.replaceAll("\\W","");// Javaherzamanguzel

        System.out.print(input.substring(0,1));   // J =>Aralarinda virgul koydugumuzda sonda da virgul
                                                    // oldugu icin ve bastaki kelime garanti olarak eklenecegi icin
                                                    // ilk harfi yazdik.
        benzersizInput+=input.substring(0,1); // J

        for (int i = 1; i <=islenecekKelime.length()-1 ; i++) {

            if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
                System.out.print(", "+islenecekKelime.substring(i,i+1));
                benzersizInput+=islenecekKelime.substring(i,i+1);

            }


        }
        System.out.println("");
        System.out.println("input = " + input);
        System.out.println("benzersizInput = " + benzersizInput);

    }


}

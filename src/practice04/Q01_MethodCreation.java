package practice04;

public class Q01_MethodCreation {
    public static void main(String[] args) {
        /*
            Problem tanımı :
         Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
         Test Data:
         input: "aabbcccccddddaaa"
         output: abcd
        */

        birkereYazdir("Mahmutt smahmut ghh");
    }

    public static void birkereYazdir(String str) { // str yazarak (istedigimiz ismi yazabiliriz) dinamik yaptik.
        String output=""; // String default degeri "" oldugu icin isleme etki etmesin diye bu sekilde atama yaptik.

        for (int i = 0; i <str.length() ; i++) { // (int i = 0; i <=str.length()-1 ; i++) de yapabilirdik.
            if (!output.contains(str.substring(i,i+1))){ // tekrarsiz karakterleri dondurecegimiz icin
                                                        // sonucumuz str'den aldigimiz herhangi bir karakteri icermesin.
                output+=str.substring(i,i+1);

            }

        }

        System.out.println("Girdiginiz input'un tekrarsiz hali: "+output);


    }
}

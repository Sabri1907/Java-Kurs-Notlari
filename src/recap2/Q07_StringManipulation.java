package recap2;

public class Q07_StringManipulation {
    public static void main(String[] args) {
        // String seklinde verilen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

        /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
        1) \\d    ==> tum rakamlar
            \\D    ==> tum rakam disi character ler
        2) \\w   ==> A->Z     a->z         0->9    _
            \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
        3) \\s   ==> space
            \\S   ==> space disindaki hersey  */

        String str1="$13,99";
        str1=str1.replaceAll("\\D","");
        System.out.println("str1 = " + str1); // 1399

        String str2="$10,55";
        str2=str2.replaceAll("\\D","");
        System.out.println("str2 = " + str2); // 1055

        System.out.println(str1+str2); // 13991055 =>Concat yapti

        double sayi1=Double.parseDouble(str1); // String'i double yaptik
        double sayi2=Double.parseDouble(str2); // String'i double yaptik
        double toplam= (sayi1+sayi2)/100; //2454/100

        System.out.println("$"+toplam); // $24.54

    }
}

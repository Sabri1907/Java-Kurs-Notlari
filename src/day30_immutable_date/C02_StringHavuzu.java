package day30_immutable_date;

public class C02_StringHavuzu {
    public static void main(String[] args) {

        String str1= "Ali Can";
        String str2=str1+"";
        String str3=new String("Ali Can");
        String hiclik="";
        String str4=str1.concat(hiclik);

        System.out.println(str1==str2); // false
        System.out.println(str1.equals(str2)); // true

        System.out.println(str1.equals(str3)); // true
        System.out.println(str1==str3); // false

        System.out.println(str2.equals(str4)); // true
        System.out.println(str2==str4); // false

        System.out.println("str2-str4 equals : "+str2.equals(str4)); // true
        System.out.println("str2-str4: "+(str2==str4)); // false

        /*
        NOT:
        1- String yeni bir String olustururken esitligin sag tarafinda new keyword'u olursa
        java direk yeni bir obje ve referansini olusturur.

        2- Eger esitligin sag tarafinda bir method calisiyor veya + islemi yapiliyorsa
        String immutable oldugundan degisikligi kaydetmek uzere hemen bir kopya
        String ve referansini olusturur, sonraki degeri hesaplayip bu yeni kopya objenin icine koyar.


         */

        String str5="Ali Can";
        String str6=str1;

        System.out.println(str1.equals(str5)); // true
        System.out.println(str5==str1); // *****TRUE

        System.out.println(str1.equals(str6)); // true
        System.out.println(str1==str6); // *****TRUE

        System.out.println(str5.equals(str6)); // true
        System.out.println(str5==str6); // *******TRUE

        /*
        NOT:
        3-Eger yeni String objesi olusturulurken new kelimesi kullanilmaz veya esitligin
        sag tarafinda + islemi olmazsa Java bakar;
            Eger daha once olusturulan String objelerden (String havuzu) bire-bir ayni String
            varsa o objeyi ve referansini kullanir.
            Birebir aynisi yoksa yeni bir obje ve referans olusturur.
         */
    }
}

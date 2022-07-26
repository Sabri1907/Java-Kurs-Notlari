package day32_stringBuilder;

public class C02_Append_Insert {

    public static void main(String[] args) {

        /*
        append(): istedigimiz string'i en sona ekler. Sayi girsek de String olarak sonun ekliyor.
                   Boolean olarak true false yazsak bile sona ekliyor.
         */

        StringBuilder sb= new StringBuilder("Java daha ne yapsun");

        sb.append("?");

        sb.append(5);

        sb.append(true);

        System.out.println(sb);

        /*
        insert(): Istedigimiz index'den itibaren araya ekleme yapmak istedigimizde append() degil
        insert() methodunu kullaniriz.
         */

        sb.insert(4," her seyi dusunmus, ");
        System.out.println(sb); //Java her seyi dusunmus,  daha ne yapsun?5true

        sb.insert(45," harbi harbi",0,6);
        System.out.println(sb); //Java her seyi dusunmus,  daha ne yapsun?5true harbi
        /*
        Yukaridaki kullanimda sirasiyla eklemek istedigimiz yerin index numarasini, eklemek istedgimiz String'i,
        ve String'in hangi araligini eklemek istiyorsak o aranin index araligini yazariz.
         */


    }
}

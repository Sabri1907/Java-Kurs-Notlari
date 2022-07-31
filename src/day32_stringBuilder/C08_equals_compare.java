package day32_stringBuilder;

public class C08_equals_compare {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        String str="Java";

        System.out.println(sb1.equals(sb2)); // false=> Farjkli StringBuilderler'in ici ayni olsa sonuc farkli olur.

        System.out.println(sb1.equals(str)); // false => Normalde farkli objeleri bu sekilde kiyaslayamayiz.
                                            // Java bunlara izin veriyor sonuc icleri ayni olsa bile false doner.

        System.out.println(sb1.equals(sb1)); // true

        /*
        NOT: StringBuilder'da equals() methodu ancak ayni obje olursa true doner.
             String'deki gibi dusunmeyin.
         */

        System.out.println(sb1.compareTo(sb2)); // 0 => Butun karakterler ayni oldugu icin 0 dondurur.

        StringBuilder sb3=new StringBuilder("Jave");
        System.out.println(sb1.compareTo(sb3)); // -4

        /*
        compareto() methodu iki StringBuilder'i bastan baslayarak harf harf karsilastirir.
        Ilk harfler ayni ise, ikincilere gecer ikinciler ayni ise 3.lere gecer.
        Ilk farkli olan harfe kadar gider farkli olan iki harfin ascii kodlari arasindaki farki verir

        Eger hic farkli harf yoksa sonuc olarak 0 dondurur
         */



    }
}

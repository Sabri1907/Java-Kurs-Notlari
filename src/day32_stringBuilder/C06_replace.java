package day32_stringBuilder;

public class C06_replace {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Calm Down");

        // NOT: StringBuilder'de replaceAll() methodu yok.

        sb.replace(5,9,"Up");
        // replace() methodunda sirasiyla baslangic,bitis index'ini girdikten sonra girilecek yeni degeri yazariz.
        System.out.println(sb); // Calm Up

        sb.replace(4,5,">>>");
        System.out.println(sb); // Calm>>>Up

        sb.replace(4,7," ");
        System.out.println(sb); // Calm Up

        sb.replace(5,7,"Down");
        System.out.println(sb); // Calm Down


    }
}

package day32_stringBuilder;

public class C07_delete {

    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java Her Zaman Guzeldir.");

        sb.delete(8,9); // 8'inci index dahil, 9'uncu index haric siler.
        System.out.println(sb); //Java HerZaman Guzeldir.

        sb.deleteCharAt(8); // 8'inci index'deki elemani siler.
        System.out.println(sb); //Java Heraman Guzeldir.

        // Bastan baslayarak her loop'ta  ilk harfi silip kalani yazdiralim.

        int son=sb.length();

        for (int i = 0; i <son ; i++) {
            sb.deleteCharAt(0);
            System.out.println(sb);
        }



    }

}

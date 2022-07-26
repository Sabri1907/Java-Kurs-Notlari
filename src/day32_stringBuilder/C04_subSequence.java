package day32_stringBuilder;

public class C04_subSequence {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Yusuf");

        sb.substring(0,3); // substring() methodu String dondurdugu icin ve String immutable oldugu icin
                           // atama yapmazsak yapilan degisiklik kalici olmaz.
        System.out.println(sb); // Yusuf
    }
}

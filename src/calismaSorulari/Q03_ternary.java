package calismaSorulari;

public class Q03_ternary {
    public static void main(String[] args) {
        /*
        Final notu tanimlayin, Nested Ternary ile cozunuz
        'A'  ->  "Gayet Basarili"
        'B'  ->  "Basarili"
        'C'  ->   "Ha gayret"
        bu notlar disindakilere de Digerleri.. yazdiriniz
        */

        char not='C';

        System.out.println(not=='A'?"Gayet Basarili":not=='B'?"Basarili":"Ha Gayret");
    }
}

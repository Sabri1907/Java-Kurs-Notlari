package practice01;

public class Q02_Println_vs_print {
    /*
println() ve print() arasinda tek fark var;
println satir atliyor,
print ise imlecin ayni satirda kalmasini sagliyor.

 */
    public static void main(String[] args) {

        System.out.println("******PRINTLN*******");
        System.out.println("Welcome");
        System.out.println("Java");
        System.out.println("Practice");

        System.out.println("******PRINT*******");
        System.out.print("Welcome");
        System.out.print(" Java");
        System.out.print(" Practice");

    }
}

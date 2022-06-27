package practice01;

public class Q11_IfStatement02 {
    public static void main(String[] args) {
        /*
        not hesaplayici
        A => 90 ~100
        B => 80 ~ 89
        C => 70 ~ 79
        D => 60 ~ 69
        F =>  0 ~ 59
        */

        int not=100;
        boolean gecerliNot=not>=0 && not <=100;

        if (not>=90 && not<=100){
            System.out.println("Notunuz: A");
        } else if (not<90 && not>=80){
            System.out.println("Notunuz: B");
        }else if (not<80 && not>=70){
            System.out.println("Notunuz: C");
        }else if (not<70 && not>=60){
            System.out.println("Notunuz: D");
        }else{
            System.out.println("Notunuz: F");
        }
    }
}

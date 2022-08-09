package practice13_interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03_Fibonacci {
    /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34...
     */
    public static void main(String[] args) {

        List<Integer> fibonacciList = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scan.nextInt();
        fibonacciList.add(0);
        fibonacciList.add(1);
        System.out.println("fibonacciList = " + fibonacciList);

        int i=1;  // Bu i'yi while sartini olusturmak icin kullandik
        if (sayi<=1){
            System.out.println("Lutfen daha buyuk sayi giriniz");
        }else{
            while(fibonacciList.get(i)<sayi){// Fibonacci rlrmanlari sayidn kucuk olddugu surece
                fibonacciList.add(fibonacciList.get(i)+fibonacciList.get(i-1)); // List'in icindeki
                // bir onceki elemani yanindaki elemanla toplar.

                i++;

            }

            System.out.println("fibonacciList = " + fibonacciList);
        }

        int sonIndexdekiEleman= fibonacciList.size()-1;
        if (fibonacciList.get(sonIndexdekiEleman)>sayi){
            fibonacciList.remove(sonIndexdekiEleman); // Son eleman sayidan buyuk oldugu icin kaldirdik
            System.out.println("Girdigin sayi fibonacci dizsinde bulunmamaktadir.\n" +
                    ">>Girdiginiz sayiya kadar ki fibonacci dizisi budur: "+ fibonacciList );
        } else{
            System.out.println("Senin gidigin sayi fibonacci listinde var. fibonacciList = " + fibonacciList);
        }




    }
}

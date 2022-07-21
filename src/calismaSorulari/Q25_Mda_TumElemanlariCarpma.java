package calismaSorulari;

public class Q25_Mda_TumElemanlariCarpma {
    /*
    SORU: Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana
          yazdiran bir method yaziniz. { {1,2,3}, {4,5,6} }
     */

    public static void main(String[] args) {

        int arr [][]={{1,2,3}, {4,5,6}};

        elemanlariCarp(arr);

    }

    public static void elemanlariCarp(int[][] arr) {

        int carpim=1;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                carpim*=arr[i][j];

            }

        }

        System.out.println("Array'deki elementlerin Carpimi: "+ carpim);
    }
}

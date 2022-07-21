package calismaSorulari;

public class Q27_Mda_AyniIndexdekiElemanlariCarpma {
    /*
    SORU: Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip
          elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru) arr1 = { {1,2},
          {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
     */

    public static void main(String[] args) {

        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1[i].length; j++) {

                if (i == j) {

                    toplam1 += arr1[i][j];
                }

            }

        }

        System.out.println("Arr1'in ayni index'deki elemanlari toplami: " + toplam1);

        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < arr2[i].length; j++) {

                if (i == j) {

                    toplam2 += arr2[i][j];
                }

            }

        }

        System.out.println("Arr2'in ayni index'deki elemanlari toplami: " + toplam2);
    }

}




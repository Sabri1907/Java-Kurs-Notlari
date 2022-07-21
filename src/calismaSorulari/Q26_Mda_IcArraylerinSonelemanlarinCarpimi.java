package calismaSorulari;

public class Q26_Mda_IcArraylerinSonelemanlarinCarpimi {
    /*
    SORU: Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini
          ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }
     */

    public static void main(String[] args) {

        int [][] arr= {{1,2,3}, {4,5}, {6,2}};

        System.out.println("***************BASIT YONTEMLE YAPILISI*****************");

        int carpim=(arr[0][arr[0].length-1])*(arr[1][arr[1].length-1])*(arr[2][arr[2].length-1]);
        System.out.println("Array'in son elementlerinin caprimi = " + carpim);


        System.out.println("********************DINAMIK YAPILISI*******************");

        int carpim2=1;

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j <arr.length ; j++) {

                if (j==arr[i].length-1){
                    carpim2*=arr[i][j];
                }

            }


        }

        System.out.println("Array'in son elementlerinin caprimi = " + carpim2);

    }
}

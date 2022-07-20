package calismaSorulari;

public class Q19_Array_MaxSayiBulma {

    /*
    SORU: Verilen bir integer array'deki en buyuk sayiyi
          yazdira bir array olusturun.
     */

    public static void main(String[] args) {
        int arr[]= {2,5,7,9,6,58,120,596,7,125,554785};

        maxSayiyiBul(arr);
    }

    public static void maxSayiyiBul(int[] arr) {
        int maxSayi=arr[0];

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]>maxSayi){
                maxSayi=arr[i];
            }

        }

        System.out.println("Verilen Array'deki en buyuk sayi: "+ maxSayi);
    }
}

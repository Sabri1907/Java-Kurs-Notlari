package practice11_interviewQuestions;

public class Q05_Varrags {

    /*
    SORU: Normal toplama methodu ve varrargs ile toplama methodu
     */
    public static void main(String[] args) {

        int[]arr={17,20,33,9,20,55};
        System.out.println("arrTopla(arr) = " + arrTopla(arr));
        varrarglaToplaList(10,20,30);
        System.out.println("varrarglaToplaArr(arr) = " + varrarglaToplaArr(arr));

        // Varrargs array gibi davrandigi icin herhangi bir arrayi parametre olarak verebiliriz.
    }

    private static int varrarglaToplaArr(int...i) {
        int toplam=0;

        for (int each:i) {
            toplam+=each;
        }
        return toplam;
    }

    private static void varrarglaToplaList(int i, int i1, int i2) {

    }

    private static int arrTopla(int[] arr) {
        int toplam=0;

        for (int each:arr) {
            toplam+=each;
        }
        return toplam;
    }
}

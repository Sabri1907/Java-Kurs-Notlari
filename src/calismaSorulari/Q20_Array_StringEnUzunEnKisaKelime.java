package calismaSorulari;

public class Q20_Array_StringEnUzunEnKisaKelime {

    /*
    SORU: Verilen String bir arrayde en uzun ve en kisa String'leri yazdiran
          bir method olusturun
     */

    public static void main(String[] args) {
        String []arr={"Ankara", "Cankiri", "Izmir", "Kahramanmaras","Usak","Kahramanlarkahramanimaras"};

        enUzunVeKisayiBul(arr);

    }

    public static void enUzunVeKisayiBul(String[] arr) {

        String enUzun=arr[0];
        String enKisa=arr[0];

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i].length()<enKisa.length()){
                enKisa=arr[i];
            } else if(arr[i].length()>enUzun.length()){
                enUzun=arr[i];
            }

        }

        System.out.println("Verilen String'deki En uzun Kelime: "+ enUzun);
        System.out.println("Verilen String'deki En kisa Kelime: "+ enKisa);



    }
}

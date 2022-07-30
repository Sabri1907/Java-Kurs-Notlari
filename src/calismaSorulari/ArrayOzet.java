package calismaSorulari;

import java.util.Arrays;

public class ArrayOzet {
    public static void main(String[] args) {
        /*
                                TANIMI GENEL KURALLAR

             Arrays birden fazla variable depolamak icin kullanilabilen object (non-primitive data)’lerdir.
         Bu yüzden Heap memory'de depolanırlar.

        1=) Arrays’de sadece primitive datalar veya non-primitive datalara ait referans’lar
            depolanabilir.

        2=) Arrays icindeki tüm variable’lar ayni data type’inde olmalıdır.


       3=) Arrays 2 şekilde declare edilir. */

            int myArray[ ] ;  //1.Yöntem(Bu yöntem daha çok kullanılır)
            int [ ] myArray1; // 2.Yöntem

        //4=) Arrays 2 şekilde oluşturulur.
            int arr[ ] = new int[3]; // 1.Yöntem
            System.out.println(Arrays.toString(arr)); // [0, 0, 0]

            String isimler[]=new String[2];
            System.out.println(Arrays.toString(isimler)); // [null, null]

            boolean iyiMisin[]=new boolean[5];
            System.out.println(Arrays.toString(iyiMisin)); // [false, false, false, false, false]

            char karakter[]=new char[3];
            System.out.println(Arrays.toString(karakter)); // [ ,  ,  ]
            /*- Burda uzunluğu 3 olan bır array oluşturuldu.
            - Bu şekilde oluşturulan array'a değer atamzsak Java data türüne uygun default değerler atar.
            - Bu arrayi yazdırırsak ekranda [0, 0, 0] görürüz.
            - Bu yöntemde arrayin uzunluğunu belirtmezsek Java CTE verir.
            - Bu yontemde oluşturulan array'e eklemek istediğimiz elemanları ilgili indexlere tek tek
              atamamız gerekir.
               ÖRNEK 0'ıncı indexe 5 eklemek için;
               */
               arr[0]=5; // yazmamız gerekir. Arrayimizin son halini görelim.

               // System.out.println(arr); = [I@5b464ce8 Bu sekilde direk yazdırdığımızda Java arrayin referans
               // numarasını yazdırıyor. Arrayimizin son  halini görmek için Arrays.toString methodunu kullanmalıyız.
        System.out.println(Arrays.toString(arr)); // [5, 0, 0] sadece ilk indexe atama yaptığımız için
        // diğer index'teki elamanlar default deeğerinde kaldı.

        // Diğer array oluşturma yöntemi şu şekildedir.

        int arr2[] = {9, 10, 11};

        // 5=) Array'in elemanlarını update etme (güncelleme)

        arr2[1]=2;
        System.out.println(Arrays.toString(arr2)); // [9, 2, 11] Array'in uzunluğu sabit olduğundan ilgili index'e
        // eleman eklersek o index'teki elemanı siler ve eklenen elemanı onun yerine atar.
        // Arrayi update ederken ilgili arrayin büyüklüğünden büyük bür index numarası girersek
        // Java “ArraysIndexOutOfBoundsException” verir.

        // 6=) Array'in uzunluğunu bulma (length methoduyla bulunur)

        System.out.println(arr2.length); // 3 = Burda dikkat edilmesi gereken husus array'de kullanılan
        // length methodunda () yoktur.

        //7=) Array'in elemanlarını sıralama = Arrays. sort (arr2); methoduyla yapılır. Küçükten büyüğe sıralar ve
        // yapılan değişiklik kalıcı olur.
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2)); // [2, 9, 11]

        // 7=) binarySearch( ) method’u belli bir elemanin bir array’de olup olmadigini kontrol
        //etmek icin kullanilir.
        //Ancak, binarySearch( ) methodunu kullanmadan once mutlaka sort( ) methodu kullanilmalidir.
        //binarySearch aranan deger array'da varsa index numarasini, yoksa -sira numarasini dondurur.

        int[] sayilar= {3,7,15,4,77,10};
        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar)); // [3, 4, 7, 10, 15, 77]
        System.out.println(Arrays.binarySearch(sayilar,4)); // 1
        System.out.println(Arrays.binarySearch(sayilar,15)); // 4
        System.out.println(Arrays.binarySearch(sayilar,11)); // -5
        System.out.println(Arrays.binarySearch(sayilar,6)); // -3
        System.out.println(Arrays.binarySearch(sayilar,-100)); // -1

       //8=) equals() method’u degerleri ve indexleri birlikte kontrol edip, boolean bir
        // deger return eder. Elamanların aynı olmasının yanında sıralama da önemlidir.

        int[] sayilar2= {3,7,15,4,77,10};
        int[] sayilar3= {10,7,15,4,77,3};
        System.out.println(Arrays.equals(sayilar2,sayilar3)); // false

        Arrays.sort(sayilar2);
        Arrays.sort(sayilar3);
        System.out.println(Arrays.equals(sayilar2,sayilar3)); // true

        //9=) split( ) method’u String’e ait bir method’dur ve belirledigimiz ayirac’a gore String’i
        //parcalara ayirip bir Array’e cevirir.
        // Sonucunu gormek icin ya bir array'a atamamiz ya da yazdirmamiz gerekir.

        String str="Java, ne kadar guzel.";

        String[] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); // [Java, ne, kadar, guzel]

        String[] kelimelerNe=str.split("ne");
        System.out.println(Arrays.toString(kelimelerNe)); // [Java ,  kadar guzel]

        String[] kelimelerE=str.split("e");
        System.out.println(Arrays.toString(kelimelerE)); // [Java n,  kadar guz, l]

        String[] karakterler=str.split("");
        System.out.println(Arrays.toString(karakterler));// [J, a, v, a, ,,  , n, e,  , k, a, d, a, r,  , g, u, z, e, l, .]


        System.out.println("*************MULTIDIMENSIONAL ARRAYS*******************");

        // Eger bir Array ic ice Array’lerden olusuyorsa buna Multi Dimensional Array denir.
        // Array’i tanimlarken (declaration), her bir kat icin bir [ ] kullanilir.

        int mda[ ][ ] = { {1,2} , {3,4}, {5,6}};

        // Multidimensional arrayi şe şekilde de oluşturabiliriz.

        int mda2[ ][ ]=new int[2][4]; // Burda outer arrayin içinde uzunlukları 4 olan 2 adet array oluşturuldu.

        System.out.println(Arrays.deepToString(mda2)); // [[0, 0, 0, 0], [0, 0, 0, 0]]
                                                       // Değer atamadığımız default değerler atadı.

        // İlgili index'e değer atamak için kaçıncı array'in kaçıncı index'i olduğunu belirtmemiz gerekiyor.
        // İçerdeki array'lerin ilk index'lkerine sırasıyla 2 ve 4 atayalım.
        mda2[0][0]=2;
        mda2[1][0]=4;
        System.out.println(Arrays.deepToString(mda2)); // [[2, 0, 0, 0], [4, 0, 0, 0]]

        // İçerdeki arraylerden sadece birini yazdıralım.
        // System.out.println(mda2[0]); //[I@96532d6 referans numarasını yazdırır.

        System.out.println(Arrays.toString(mda2[0])); //[2, 0, 0, 0]

        // Belirli bir elemanı yazdıralım. Mesela 2. arrayin 1. elemanını yazdıralım.
        System.out.println(mda2[1][0]); // 4

        System.out.println(Arrays.toString(mda2)); // İç içe kaç array varsa hepsinin referanslarını döndürür.
        // Tüm elemanları yazdırmak için nested for loop veya Arrays.deepToString() methodu kullanılır.



























    }
}

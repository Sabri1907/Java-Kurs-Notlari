package day11_stringManipulations;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String cumle="Java cok kolay, Java cok guzel";
        String kelime="Java";
        /*
        Verilen kelime icin asagidaki sartlardan uygun olani yazan bir program yaziniz
            - Verilen kelime cumlede kullanilmamis
            - Verilen kelime cumlede sadece 1 kere kullanilmis
            - verilen kelime cumlede birden fazla kullanilmis
         */

        int kelimeIlkIndex=cumle.indexOf(kelime);
        int kelimeSonIndex=cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex==-1){
            System.out.println("Verilen kelime cumlede kullanilmamis");
        }else if (kelimeIlkIndex==kelimeSonIndex){
            System.out.println("Verilen kelime cumlede bir kez kullanilmistir");
        }else{
            System.out.println("Verilen kelime cumlede birden fazla kullanilmistir");
        }

    }
}

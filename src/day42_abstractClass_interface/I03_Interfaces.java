package day42_abstractClass_interface;

public interface I03_Interfaces {

    /*
    int sayi; => CTE veriyor.

    Interface'daki tum variable'lar public, static veya final'dir. Dolayisdiyla sonradan deger atama
    sansimiz yoktur. Bunun icin variable olusturdugumuzda deger atamak zorundayiz.
     */

    int SAYI=30;

    void yakit(); // Asagidaki methodlardan farki yok public ve abstract yazmasak da olur.
    /*
    Interface icerisindeki her method public ve abstract ozelliklerine sahiptir.

    ONEMLI NOT: Abstract bir methodun body'si olmasi mumkun degildir. Java developer'larin istegi uzerine
    sonradan kismi bir update yapmistir.
    Bir interface'e sonradan bir abstract method eklersek o interface'i daha once implement etmis
    tum class'lara gidip hepsinde yeni eklenen methodu override etmemiz gerekir.
    Bu da buyuk ve eskiden gelen projeler icin cok zor bir islemdir.
    Bunun icin Java Java8'den itibaren interface'lere sonradan body'si olan method eklenmesine izin vermistir.
     */

    public void motor();
    public abstract void teker();
}

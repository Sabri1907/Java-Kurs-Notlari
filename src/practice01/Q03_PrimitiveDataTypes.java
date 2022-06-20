package practice01;

public class Q03_PrimitiveDataTypes {

    public static void main(String[] args) {
        /*
         * Primitive data type
                byte: only takes whole numbers
                short: only takes whole numbers
                int(used more often): only takes whole numbers
                long: only takes whole numbers
                float: can take decimals (MUST have F or f at the end)
                double( used more often): can take decimals
                boolean: true or false boolean expressions
                char: character within single quote ''
                        also takes number
         * Range: double > float >long > int >short > byte
         */
        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.

        byte byteMax=Byte.MAX_VALUE;
        byte byteMin=Byte.MIN_VALUE;
        System.out.println("byteMin = " + byteMin);
        System.out.println("byteMax = " + byteMax);

        System.out.println("***************************\n************************");

        short maxShort=Short.MAX_VALUE;
        short minShort=Short.MIN_VALUE;
        System.out.println("maxShort = " + maxShort);
        System.out.println("minShort = " + minShort);

        System.out.println("************************\n************************");

        int intMax=Integer.MAX_VALUE;
        int intmin=Integer.MIN_VALUE;
        System.out.println("intMax = " + intMax);
        System.out.println("intmin = " + intmin);

        System.out.println("************************\n************************");

        long maxLong=Long.MAX_VALUE;
        long minLong=Long.MIN_VALUE;
        System.out.println("maxLong = " + maxLong);
        System.out.println("minLong = " + minLong);

        System.out.println("************************\n************************");

        float maxFloat=Float.MAX_VALUE;
        float minFloat=Float.MIN_VALUE;
        System.out.println("maxFloat = " + maxFloat);
        System.out.println("minFloat = " + minFloat);

        System.out.println("************************\n************************");

        double maxDouble=Double.MAX_VALUE;
        double minDouble=Double.MIN_VALUE;
        System.out.println("maxDouble = " + maxDouble);
        System.out.println("minDouble = " + minDouble);


        System.out.println("************************\n************************");




        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)
        //Degiskenler icin anlamli isimler kullanip, yazdiralim

        float laptopFiyat=9999.99f; // Float'in sonunda kucuk veya buyuk F/f kullanilabilir.
        double kilometre= 32564.75;
        char seviye='A';
        boolean dogruMu=true;

        System.out.println("laptopFiyat = " + laptopFiyat);
        System.out.println("kilometre = " + kilometre);
        System.out.println("seviye = " + seviye);
        System.out.println("dogruMu = " + dogruMu);

    }

}
